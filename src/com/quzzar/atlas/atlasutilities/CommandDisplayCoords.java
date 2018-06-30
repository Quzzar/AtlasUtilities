package com.quzzar.atlas.atlasutilities;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandDisplayCoords implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			
			if(args.length==0) {
				
				if(CoordsDisplay.hasDisplay(p)) {
					
					CoordsDisplay.removeDisplay(p);
					
				} else {
					
					CoordsDisplay.setDisplay(p);
					
				}
				
			} else {
				p.sendMessage(ChatColor.RED+"Invalid command! /displaycoords");
				return true;
			}
			
		}
		
		return true;
	}
	
	
}
