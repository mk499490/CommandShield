package com.horizonbagel.pllink;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Horizon Bagel on 2016/02/07.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        getConfig().addDefault("PLLink", "導入プラグインはこちらからご確認下さい-> http://www.minecraft.osaka/pc/plugins/");
        getConfig().options().copyDefaults(true);
        saveConfig();

        this.getCommand("pl").setExecutor(new commandExecutor());
        this.getCommand("plugin").setExecutor(new commandExecutor());
        this.getCommand("plugins").setExecutor(new commandExecutor());
        this.getLogger().info("PLLink 1.0 has been enabled.");
    }

    public void onDisable(){
        this.getLogger().info("PLLink 1.0 has been disabled.");
    }
}
