package me.nexobyte.BungeeSystem.main;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * Created by NexoByte on 15.07.2017.
 */
public class BungeeSystem extends Plugin {

    public void onEnable() {
        ProxyServer.getInstance().getConsole().sendMessage(new TextComponent("§8Active"));
    }

    public void onDisable() {

    }
}
