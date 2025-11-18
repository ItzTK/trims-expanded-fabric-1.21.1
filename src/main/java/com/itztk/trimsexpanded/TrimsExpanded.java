package com.itztk.trimsexpanded;

import com.itztk.trimsexpanded.item.ModItems;
import com.itztk.trimsexpanded.item.ModLootTable;
import com.itztk.trimsexpanded.item.TrimsExpandedGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrimsExpanded implements ModInitializer {
	public static final String MOD_ID = "trimsexpanded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TrimsExpandedGroups.registerItemGroups();
		ModItems.registerModItems();
		ModLootTable.modifyLootTables();
		ConvertDataTrims.detectEvents();
//		JoinMessage.register();
	}
}