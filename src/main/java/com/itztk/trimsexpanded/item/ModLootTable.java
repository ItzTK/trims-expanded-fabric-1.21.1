package com.itztk.trimsexpanded.item;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

//import static com.sun.tools.classfile.Attribute.ConstantValue;
//import net.minecraft.loot.LootPool;
//import net.minecraft.loot.LootTables;
//import net.minecraft.loot.condition.RandomChanceLootCondition;
//import net.minecraft.loot.entry.ItemEntry;
//import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTable {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            if(BuiltInLootTables.VILLAGE_ARMORER.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                                .conditionally(LootItemRandomChanceCondition.randomChance(0.33f).build())
                                        .with(LootItem.lootTableItem(ModItems.PLATED_SMITHING_TEMPLATE).build());
                tableBuilder.pool(poolBuilder.build());
            }
//
//            if(BuiltInLootTables.VILLAGE_ARMORER.equals(key)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.33f))
//                        .with(ItemEntry.builder(ModItems.MARGIN_SMITHING_TEMPLATE));
//
//                tableBuilder.pool(poolBuilder.build());
//            }
//
//            if(BuiltInLootTables.VILLAGE_WEAPONSMITH.equals(key)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.33f))
//                        .with(ItemEntry.builder(ModItems.PLATED_SMITHING_TEMPLATE));
//
//                tableBuilder.pool(poolBuilder.build());
//            }
//
//            if(BuiltInLootTables.VILLAGE_WEAPONSMITH.equals(key)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.33f))
//                        .with(ItemEntry.builder(ModItems.MARGIN_SMITHING_TEMPLATE));
//
//                tableBuilder.pool(poolBuilder.build());
//            }
//
//            if(BuiltInLootTables.BURIED_TREASURE.equals(key)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.33f))
//                        .with(ItemEntry.builder(ModItems.SHELL_SMITHING_TEMPLATE));
//
//                tableBuilder.pool(poolBuilder.build());
//            }
//
//            if(BuiltInLootTables.SIMPLE_DUNGEON.equals(key)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.2f))
//                        .with(ItemEntry.builder(ModItems.DANGER_SMITHING_TEMPLATE));
//
//                tableBuilder.pool(poolBuilder.build());
//            }
//
//            if(BuiltInLootTables.CAT_MORNING_GIFT.equals(key)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.05f))
//                        .with(ItemEntry.builder(ModItems.HEART_SMITHING_TEMPLATE));
//
//                tableBuilder.pool(poolBuilder.build());
//            }
//
//            if(BuiltInLootTables.SNIFFER_DIGGING.equals(key)) {
//                LootPool.Builder poolBuilder = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(0.1f))
//                        .with(ItemEntry.builder(ModItems.VERDANT_SMITHING_TEMPLATE));
//
//                tableBuilder.pool(poolBuilder.build());
//            }



        });
    }
}