package com.horizonbagel.pllink;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Horizon Bagel on 2016/02/07.
 */
public class commandExecutor implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        //static String pluginsListLink;

        if (sender instanceof Player) {
            if (sender.isOp()) {
                Player player = (Player) sender;
                player.chat("/bukkit:plugins");
            }

            if (!sender.isOp()) {
                Player player = (Player) sender;
                sender.sendMessage("導入プラグインはこちらからご確認下さい-> http://www.minecraft.osaka/pc/plugins/");
            }
        }

        if (sender.isOp()){
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            String command = "bukkit:pl";
            Bukkit.dispatchCommand(console, command);
        }

        return true;
    }
}