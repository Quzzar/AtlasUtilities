package com.quzzar.atlas.atlasutilities;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.quzzar.atlas.atlasutilities.CustomRecipePack.HURecipeLayouts;

public class Main extends JavaPlugin{
	
	
public static Main instance;
	
	@Override
	public void onEnable(){
		
		instance = this;
		
		
		instance.getCommand("roll").setExecutor(new CommandRoll());
		instance.getCommand("displaycoords").setExecutor(new CommandDisplayCoords());
		
		getServer().getPluginManager().registerEvents(new MainListener(), instance);
	    
		HURecipeLayouts.loadLayouts(instance);
		
		Recipes.LoadRecipes(instance);
		
		InteralClock.runTask();
		SearchHandler.runTask();
		
		Utility.tellConsole("Loaded and Ready!");
		
	}
	
	@Override
	public void onDisable(){
		
		for(Player p : Bukkit.getServer().getOnlinePlayers()){
			
			// To prevent item steal
			p.closeInventory();
			
			// To fix dead displays
			CoordsDisplay.removeDisplay(p);
			
		}
		
	}
	
	
}
