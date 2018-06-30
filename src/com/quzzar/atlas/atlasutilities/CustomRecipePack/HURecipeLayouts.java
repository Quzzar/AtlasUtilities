package com.quzzar.atlas.atlasutilities.CustomRecipePack;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import com.quzzar.atlas.atlasutilities.Main;

public class HURecipeLayouts {

	
	private static ItemStack nothing = new ItemStack(Material.AIR);
	
	
	public static ShapelessRecipe shlessSingle;
	public static ShapelessRecipe shlessThree;
	
	public static ShapedRecipe shapedFull;
	public static ShapedRecipe shaped2x2;
	
	
	public static void loadLayouts(Main main){
		
		generalLayouts(main);
		
	}
	
	
	@SuppressWarnings("deprecation")
	public static void generalLayouts(Main main){
		
		shlessSingle = new ShapelessRecipe(new NamespacedKey(Main.instance,"Atlas_ShapelessSingle"),nothing);
		shlessSingle.addIngredient(Material.SKULL_ITEM,3);
	    main.getServer().addRecipe(shlessSingle);
	    
	    shlessThree = new ShapelessRecipe(new NamespacedKey(Main.instance,"Atlas_ShapelessThree"),nothing);
	    shlessThree.addIngredient(Material.SKULL_ITEM,3);
	    main.getServer().addRecipe(shlessThree);
	    
	    
	    shaped2x2 = new ShapedRecipe(new NamespacedKey(Main.instance,"Atlas_ShapedTwoByTwo"),nothing);
	    shaped2x2.shape("SS", "SS");
	    shaped2x2.setIngredient('S', Material.SKULL_ITEM,3);
	    main.getServer().addRecipe(shaped2x2);
	    
	    shapedFull = new ShapedRecipe(new NamespacedKey(Main.instance,"Atlas_ShapedFull"),nothing);
	    shapedFull.shape("SSS", "SSS", "SSS");
	    shapedFull.setIngredient('S', Material.SKULL_ITEM,3);
	    main.getServer().addRecipe(shapedFull);
		
	}
	
	
}
