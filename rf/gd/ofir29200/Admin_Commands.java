package rf.gd.ofir29200;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class Admin_Commands extends org.bukkit.plugin.java.JavaPlugin
{
  public Admin_Commands() {}
  
  public void onEnable()
  {
    getLogger().info("[Admin Commands] now enabled!");
  }
  
  public void onDisable()
  {
    getLogger().info("[Admin Commands] now disabled!");
  }
  
  public boolean onCommand(org.bukkit.command.CommandSender sender, Command cmd, String label, String[] args)
  {
    boolean returnAnswer = false;
    
    if ((cmd.getName().equalsIgnoreCase("lag")) && ((sender instanceof Player)))
    {
      Player player = (Player)sender;
      
      player.sendMessage("hi, " + ChatColor.GREEN + player.getName() + ChatColor.RESET + ", we got your ping!");
      player.chat("lag test");
      player.sendMessage(ChatColor.GOLD + "your name is " + ChatColor.GREEN + player.getName());
      
      returnAnswer = true;
    }
    else if ((cmd.getName().equalsIgnoreCase("shutdown")) && ((sender instanceof Player)))
    {
      Player player = (Player)sender;
      
      org.bukkit.Bukkit.broadcastMessage(ChatColor.RED + "[Admin Commands] " + "The player " + ChatColor.GREEN + player.getName() + ChatColor.RED + " tried to shut down the server");
      returnAnswer = true;
    }
    
    if ((cmd.getName().equalsIgnoreCase("override")) && ((sender instanceof Player)))
    {
      Player player = (Player)sender;
      
      getLogger().info("[admin commands] Player name is: " + player.getName());
      
      if (player.getName().equalsIgnoreCase("ofir29200"))
      {
        player.addPotionEffect(PotionEffectType.SPEED.createEffect(Integer.MAX_VALUE, 1));
        player.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(Integer.MAX_VALUE, 1));
        player.addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(Integer.MAX_VALUE, 1));
        player.addPotionEffect(PotionEffectType.JUMP.createEffect(Integer.MAX_VALUE, 4));
        player.setMaxHealth(100.0D);
        player.setHealth(100.0D);
      }
      else
      {
        player.sendMessage(ChatColor.DARK_RED + "You dont have permission for that command!");
      }
      returnAnswer = true;
    }
    
    if ((cmd.getName().equalsIgnoreCase("apply")) && ((sender instanceof Player)))
    {
      Player player = (Player)sender;
      
      player.sendMessage("hi, " + ChatColor.GREEN + player.getName() + ChatColor.RESET + " please go to https://playzcraftserver.enjin.com/apply to apply");
      
      returnAnswer = true;
    }
    
    if ((cmd.getName().equalsIgnoreCase("discord")) && ((sender instanceof Player)))
    {
      Player player = (Player)sender;
      
      player.sendMessage("hi, " + ChatColor.GREEN + player.getName() + ChatColor.RESET + " please go to https://discord.gg/azYQwa6 to join our discord");
      
      returnAnswer = true;
    }
    
//v1.0
    return returnAnswer;
  }
}
