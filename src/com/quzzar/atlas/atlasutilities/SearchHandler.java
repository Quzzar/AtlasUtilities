package com.quzzar.atlas.atlasutilities;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SearchHandler {
	
	
	public static ArrayList<SearchingObject> searchingPlayers = new ArrayList<SearchingObject>();
	
	public static Inventory getPlayerInventory(Player p) {
		
		Inventory pInv = Bukkit.createInventory(null, 36, p.getDisplayName()+"'s Inventory");
		
		pInv.setMaxStackSize(65);
		
		for(int i = 0; i<p.getInventory().getSize(); i++) {
			if(p.getInventory().getItem(i)!=null) {
				
				if(i<9) {
					
					pInv.setItem(i+27, p.getInventory().getItem(i));
					
				} else {
					
					pInv.setItem(i-9, p.getInventory().getItem(i));
					
				}
				
			}
		}
		
		return pInv;
		
	}
	
	
	public static void addSearchingPlayer(Player p, Player otherP) {
		
		boolean contains = false;
		
		for(SearchingObject search : SearchHandler.searchingPlayers) {
			if(search.getPlayer().equals(p)) {
				contains = true;
			}
		}
		
		if(!contains) {
			
			SearchHandler.searchingPlayers.add(new SearchingObject(p, otherP, false));
			
			p.setMaximumAir(19);
			p.sendMessage(ChatColor.GRAY+"Searching "+otherP.getDisplayName()+", don't move...");
			
		}
		
	}
	
	
	public static void runTask() {
		
		
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.instance, new Runnable() {
			
			public void run() {
				
				ArrayList<SearchingObject> removePlayers = new ArrayList<SearchingObject>();
				
				for(SearchingObject search : searchingPlayers) {
					
					if(!search.isMoved()) {
						
						search.getPlayer().openInventory(SearchHandler.getPlayerInventory(search.getOtherPlayer()));
						
						search.getPlayer().setMaximumAir(20);// back to default
						
					}
					
					removePlayers.add(search);
					
				}
				
				searchingPlayers.removeAll(removePlayers);
				
			}
			
		}, 140, 140);// 100 L == 7 sec, 20 ticks == 1 sec
		
		
	}
	
	
	
	
}
