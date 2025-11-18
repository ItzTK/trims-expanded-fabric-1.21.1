package com.itztk.trimsexpanded;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.packs.PackResources;
//import net.minecraft.server.network.ServerPlayerEntity;
//import net.minecraft.text.Text;

import java.util.List;
import java.util.stream.Collectors;
//
public class JoinMessage {
//    public static void register() {
//        ServerPlayConnectionEvents.JOIN.register(JoinMessage::onPlayReady);
//    }
//
//
//
//    public static void sendWelcomeMessage(ServerPlayer player) {
//        Component message = Component.literal("§bWelcome");
//        player.sendChatMessage(message);
//    }
//    public static List<PackResources> getLoadedDatapackNames(MinecraftServer server) {
//        return server.getResourceManager().listPacks()collect(Collectors.toList());
//    }
//
//    public static Component formatDatapackList(List<String> datapacks) {
//        String formattedList = datapacks.stream()
//                .map(name -> "• " + name)
//                .collect(Collectors.joining("\n"));
//
//        return Component.literal("Loaded Datapacks (" + datapacks.size() + "):\n" + formattedList)
//                .withColor(0x00AAFF);
//    }
//
//    private static void onPlayReady(ServerGamePacketListenerImpl handler, PacketSender sender, MinecraftServer server) {
//        ServerPlayer player = handler.player;
//        sendWelcomeMessage(player);
//
//
//        List<String> datapacks = getLoadedDatapackNames(server);
//        player.sendChatMessage(formatDatapackList(datapacks));
//
//    }
}