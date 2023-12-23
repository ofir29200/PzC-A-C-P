package xyz.ofir29200.playzcraft;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Admin_Commands extends JavaPlugin {

    private Commands commands = new Commands();
    @Override
    public void onEnable() {

        // Plugin startup logic
        getLogger().info("The plugin is now starting up!");
        getCommand(Commands.cmd1).setExecutor(commands);
        getCommand(Commands.cmd2).setExecutor(commands);
        getCommand(Commands.cmd3).setExecutor(commands);
        //getCommand(Commands.cmd4).setExecutor(commands);
        getCommand(Commands.cmd5).setExecutor(commands);
        getCommand(Commands.cmd6).setExecutor(commands);
        /*getCommand(Commands.cmd7).setExecutor(commands);
        getCommand(Commands.cmd8).setExecutor(commands);
        getCommand(Commands.cmd9).setExecutor(commands);
        getCommand(Commands.cmd10).setExecutor(commands);
        getCommand(Commands.cmd11).setExecutor(commands);
        getCommand(Commands.cmd12).setExecutor(commands);
        getCommand(Commands.cmd13).setExecutor(commands);
        getCommand(Commands.cmd14).setExecutor(commands);
        getCommand(Commands.cmd15).setExecutor(commands);
        getCommand(Commands.cmd16).setExecutor(commands);
        getCommand(Commands.cmd17).setExecutor(commands);*/
        org.bukkit.Bukkit.broadcastMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "The Plugin is now Enabled!");
        getLogger().info("The plugin is now enabled and ready to receive commands!");
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("shutdown request has been received!");
        getLogger().info("shutting down plugin");
        //disable the plugin
        //@SuppressWarnings("unused")
        //Player player = null;
        org.bukkit.Bukkit.broadcastMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "The Plugin is now Shutting down");
        getLogger().info("plugin is now disabled and fully shutdown!");
    }
}
