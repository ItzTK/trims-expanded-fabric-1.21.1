package com.itztk.trimsexpanded;

//import com.itztk.trimsexpanded.item.ModItems;
//import net.fabricmc.fabric.api.event.player.UseItemCallback;
//import net.minecraft.component.DataComponentTypes;
//import net.minecraft.component.type.CustomModelDataComponent;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraft.util.TypedActionResult;
//
//import java.util.Map;


import com.itztk.trimsexpanded.item.ModItems;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomModelData;

import java.util.Map;

public class ConvertDataTrims {

    public static final Map<Item, Item> TRIM_MAPPINGS = Map.of(
            Items.DANGER_POTTERY_SHERD, ModItems.DANGER_SMITHING_TEMPLATE,
            Items.BURN_POTTERY_SHERD, ModItems.DRIP_SMITHING_TEMPLATE,
            Items.HEART_POTTERY_SHERD, ModItems.HEART_SMITHING_TEMPLATE,
            Items.BLADE_POTTERY_SHERD, ModItems.MARGIN_SMITHING_TEMPLATE,
            Items.FRIEND_POTTERY_SHERD, ModItems.PLATED_SMITHING_TEMPLATE,
            Items.ARMS_UP_POTTERY_SHERD, ModItems.PRIDE_SMITHING_TEMPLATE,
            Items.EXPLORER_POTTERY_SHERD, ModItems.SHELL_SMITHING_TEMPLATE,
            Items.HEARTBREAK_POTTERY_SHERD, ModItems.SUSPICIOUS_SMITHING_TEMPLATE,
            Items.SNORT_POTTERY_SHERD, ModItems.VERDANT_SMITHING_TEMPLATE
    );

    public static void detectEvents() {
        UseItemCallback.EVENT.register((playerEntity, world, hand) -> {
            ItemStack stack = playerEntity.getItemInHand(hand);
            if (TRIM_MAPPINGS.containsKey(stack.getItem())) {
                CustomModelData modelData = stack.get(DataComponents.CUSTOM_MODEL_DATA);
                if (modelData != null && modelData.value() == 2052416) {

                    if (!world.isClientSide()) {
                        itemReplacer(playerEntity, stack);
                    }
                    return InteractionResultHolder.success(stack);
                }
            }
            return InteractionResultHolder.pass(stack);
        });
    }

    private static void itemReplacer(Player player, ItemStack stack) {
        int count = stack.getCount();
        Item NEW_ITEM = TRIM_MAPPINGS.get(stack.getItem());
        stack.shrink(count);
        player.addItem(new ItemStack(NEW_ITEM, count));
    }

}