package com.kaworu.controllihack.controllihack;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Controllihack extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[ControlliHack]: Plugin loaded!");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[ControlliHack]: Plugin unloaded!");
    }
}
