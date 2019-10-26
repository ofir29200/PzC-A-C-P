package rf.gd.ofir29200;

//import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class Admin_Commands extends org.bukkit.plugin.java.JavaPlugin {
  
	private Commands commands = new Commands();
	public void onEnable() {
	getLogger().info("[Admin Commands] The plugin is now starting up!");
	//@SuppressWarnings("unused")
	//Player player = null;
	getCommand(Commands.cmd1).setExecutor(commands);
	getCommand(Commands.cmd2).setExecutor(commands);
	getCommand(Commands.cmd3).setExecutor(commands);
	getCommand(Commands.cmd4).setExecutor(commands);
	getCommand(Commands.cmd5).setExecutor(commands);
	getCommand(Commands.cmd6).setExecutor(commands);
	getCommand(Commands.cmd7).setExecutor(commands);
	getCommand(Commands.cmd8).setExecutor(commands);
	//getCommand(Commands.cmd9).setExecutor(commands);
	//getCommand(Commands.cmd10).setExecutor(commands);
	//getCommand(Commands.cmd11).setExecutor(commands);
	//getCommand(Commands.cmd12).setExecutor(commands);
	//getCommand(Commands.cmd13).setExecutor(commands);
	//getCommand(Commands.cmd14).setExecutor(commands);
	//getCommand(Commands.cmd15).setExecutor(commands);
	//getCommand(Commands.cmd16).setExecutor(commands);
	//getCommand(Commands.cmd17).setExecutor(commands);
    getLogger().info("[Admin Commands] The plugin is now enabled and ready to receive commands!");
	org.bukkit.Bukkit.broadcastMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "The Plugin is now Enabled!");
  }

	public void onDisable() {
	getLogger().info("[Admin Commands] shutdown request has been received!");  
	getLogger().info("[Admin Commands] shutting down plugin");
	//disable the plugin
	//@SuppressWarnings("unused")
	//Player player = null;
	org.bukkit.Bukkit.broadcastMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "The Plugin is now Shutting down");
    getLogger().info("[Admin Commands] plugin is now disabled and fully shutdown!");
	}
	
}