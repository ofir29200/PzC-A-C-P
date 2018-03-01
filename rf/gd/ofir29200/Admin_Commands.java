package rf.gd.ofir29200;

public class Admin_Commands extends org.bukkit.plugin.java.JavaPlugin
{
  public Admin_Commands() {}
  
  public void onEnable()
  {
	getLogger().info("[Admin Commands] plugin is now starting up!");
	new Commands(this);
    getLogger().info("[Admin Commands] plugin is now enabled and ready to receive commands!");
  }
  
  public void onDisable()
  {
	getLogger().info("[Admin Commands] shutdown request has been received!");  
	getLogger().info("[Admin Commands] shutting down plugin");
    getLogger().info("[Admin Commands] plugin is now disabled and fully shutdown!");
  }
  
  
}
