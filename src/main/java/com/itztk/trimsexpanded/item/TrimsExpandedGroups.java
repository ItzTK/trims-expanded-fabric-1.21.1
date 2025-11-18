package com.itztk.trimsexpanded.item;

import com.itztk.trimsexpanded.TrimsExpanded;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
//import net.minecraft.item.ItemGroup;
//import net.minecraft.item.ItemStack;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.Registry;
//import net.minecraft.text.Text;
//import net.minecraft.util.Identifier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class TrimsExpandedGroups {
    private static final CreativeModeTab TRIMS_EXPANDED_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "trimsexpanded"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PLATED_SMITHING_TEMPLATE))
                    .title(Component.translatable("itemgroup.trimsexpanded.trimsexpanded"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.DANGER_SMITHING_TEMPLATE);
                                output.accept(ModItems.DRIP_SMITHING_TEMPLATE);
                                output.accept(ModItems.HEART_SMITHING_TEMPLATE);
                                output.accept(ModItems.MARGIN_SMITHING_TEMPLATE);
                                output.accept(ModItems.PLATED_SMITHING_TEMPLATE);
                                output.accept(ModItems.PRIDE_SMITHING_TEMPLATE);
                                output.accept(ModItems.SHELL_SMITHING_TEMPLATE);
                                output.accept(ModItems.SUSPICIOUS_SMITHING_TEMPLATE);
                                output.accept(ModItems.VERDANT_SMITHING_TEMPLATE);
                            }).build());

//            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PLATED_SMITHING_TEMPLATE))
//                    .displayName(Text.translatable("itemgroup.trimsexpanded.trimsexpanded"))
//                    .entries((displayContext, entries) -> {
//                        entries.add(ModItems.DANGER_SMITHING_TEMPLATE);
//                        entries.add(ModItems.DRIP_SMITHING_TEMPLATE);
//                        entries.add(ModItems.HEART_SMITHING_TEMPLATE);
//                        entries.add(ModItems.MARGIN_SMITHING_TEMPLATE);
//                        entries.add(ModItems.PLATED_SMITHING_TEMPLATE);
//                        entries.add(ModItems.PRIDE_SMITHING_TEMPLATE);
//                        entries.add(ModItems.SHELL_SMITHING_TEMPLATE);
//                        entries.add(ModItems.SUSPICIOUS_SMITHING_TEMPLATE);
//                        entries.add(ModItems.VERDANT_SMITHING_TEMPLATE);
//
//                    }).build());


    public static void registerItemGroups() {
        TrimsExpanded.LOGGER.info("Registering Item Groups for " + TrimsExpanded.MOD_ID);
    }
}