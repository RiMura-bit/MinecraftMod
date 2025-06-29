package com.example.translatechat;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.chat.Text;
import net.minecraft.text.LiteralText;

public class TranslateChatMod implements ModInitializer {
    @Override
    public void onInitialize() {
        MinecraftClient client = MinecraftClient.getInstance();
        client.inGameHud.getChatHud().addMessage(new LiteralText("Мод активирован"));
    }
}
package main.java.com.example.translatechat;

public class TranslateChatMod {

}
