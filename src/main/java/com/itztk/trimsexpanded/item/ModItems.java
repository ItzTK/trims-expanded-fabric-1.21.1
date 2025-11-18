package com.itztk.trimsexpanded.item;

import com.itztk.trimsexpanded.TrimsExpanded;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemGroups;
import net.minecraft.world.item.SmithingTemplateItem;


public class ModItems {
    public static final Item DANGER_SMITHING_TEMPLATE = registerItem("danger_armor_trim_smithing_template",
            SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "danger"), FeatureFlags.VANILLA));
    public static final Item DRIP_SMITHING_TEMPLATE = registerItem("drip_armor_trim_smithing_template",
            SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "drip"), FeatureFlags.VANILLA));
    public static final Item HEART_SMITHING_TEMPLATE = registerItem("heart_armor_trim_smithing_template",
            SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "heart"), FeatureFlags.VANILLA));
    public static final Item MARGIN_SMITHING_TEMPLATE = registerItem("margin_armor_trim_smithing_template",
            SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "margin"), FeatureFlags.VANILLA));
    public static final Item PLATED_SMITHING_TEMPLATE = registerItem("plated_armor_trim_smithing_template",
            SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "plated"), FeatureFlags.VANILLA));
    public static final Item PRIDE_SMITHING_TEMPLATE = registerItem("pride_armor_trim_smithing_template",
            SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "pride"), FeatureFlags.VANILLA));
    public static final Item SHELL_SMITHING_TEMPLATE = registerItem("shell_armor_trim_smithing_template",
            SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "shell"), FeatureFlags.VANILLA));
    public static final Item SUSPICIOUS_SMITHING_TEMPLATE = registerItem("suspicious_armor_trim_smithing_template",
            SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "suspicious"), FeatureFlags.VANILLA));
    public static final Item VERDANT_SMITHING_TEMPLATE = registerItem("verdant_armor_trim_smithing_template",
            SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, "verdant"), FeatureFlags.VANILLA));



    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(TrimsExpanded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TrimsExpanded.LOGGER.info("Registering Mod Items for " + TrimsExpanded.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {

        });
    }
}

