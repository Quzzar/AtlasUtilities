package com.quzzar.atlas.atlasutilities;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class InteralClock {
	
	
	public static void runTask() {
		
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.instance, new Runnable() {
			
			public void run() {
				
				for(Player p : Bukkit.getOnlinePlayers()) {
					
					CoordsDisplay.updateDisplay(p);
					
				}
				
				
			}
		
		}, 15, 15); // Every 3/4 second
		
	}
	
	
}
