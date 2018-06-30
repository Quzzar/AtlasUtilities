package com.quzzar.atlas.atlasutilities;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Utility {
	
	
	public static void tellConsole(String message){
		Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"["+ChatColor.AQUA+"Player Helper"+ChatColor.BLUE+"]"+ChatColor.GREEN+" "+message);
	}
	
	public static void tellSender(CommandSender sender, String message) {
		sender.sendMessage(ChatColor.BLUE+"["+ChatColor.AQUA+"Player Helper"+ChatColor.BLUE+"] "+message);
	}
	
}
