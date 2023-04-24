package com.holland.custommobs;

import org.bukkit.plugin.java.JavaPlugin;

public class CustomMobs extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Custom Mobs ENABLED!");
    }
    @Override
    public void onDisable() {
        getLogger().info("Custom Mobs DISABLED");
    }
}
