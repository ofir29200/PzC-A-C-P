package rf.gd.ofir29200;

//import org.bukkit.entity.Player;

public class Admin_Commands extends org.bukkit.plugin.java.JavaPlugin {
  
	private Commands commands = new Commands();
	public void onEnable() {
	getLogger().info("[Admin Commands] plugin is now starting up!");
	//@SuppressWarnings("unused")
	//Player player = null;
	getCommand(Commands.cmd1).setExecutor(commands);
	getCommand(Commands.cmd2).setExecutor(commands);
	getCommand(Commands.cmd3).setExecutor(commands);
	getCommand(Commands.cmd4).setExecutor(commands);
	getCommand(Commands.cmd5).setExecutor(commands);
	getCommand(Commands.cmd6).setExecutor(commands);
    getLogger().info("[Admin Commands] plugin is now enabled and ready to receive commands!");
  }

	public void onDisable() {
	getLogger().info("[Admin Commands] shutdown request has been received!");  
	getLogger().info("[Admin Commands] shutting down plugin");
	//disable the plugin
	//@SuppressWarnings("unused")
	//Player player = null;
    getLogger().info("[Admin Commands] plugin is now disabled and fully shutdown!");
	}
	
}