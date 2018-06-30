package com.quzzar.atlas.atlasutilities;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import com.quzzar.atlas.atlasutilities.CustomHeads.TextureDatabase;
import com.quzzar.atlas.atlasutilities.CustomRecipePack.HURecipeLayouts;
import com.quzzar.atlas.atlasutilities.CustomRecipePack.HeadUnitShapedRecipe;
import com.quzzar.atlas.atlasutilities.CustomRecipePack.HeadUnitShapelessRecipe;

public class Recipes {
	
	@SuppressWarnings("deprecation")
	public static void LoadRecipes(Main main) {
	    
		boolean enabled = true;
		
		if(enabled){
			ShapelessRecipe shR = new ShapelessRecipe(new NamespacedKey(Main.instance,"BatonStick"),ItemsCreator.Security_Baton(1));
			shR.addIngredient(Material.STICK);
			shR.addIngredient(Material.INK_SACK,4);
			shR.addIngredient(Material.REDSTONE);
			shR.addIngredient(Material.GOLD_INGOT);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"Pickk1"),ItemsCreator.Granite_Pickaxe(1));
			shR.shape("RRR", " S ", " S ");
			shR.setIngredient('R', Material.STONE, 1);
			shR.setIngredient('S', Material.STICK);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"Pickk2"),ItemsCreator.Andesite_Pickaxe(1));
			shR.shape("RRR", " S ", " S ");
			shR.setIngredient('R', Material.STONE, 5);
			shR.setIngredient('S', Material.STICK);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"Pickk3"),ItemsCreator.Diorite_Pickaxe(1));
			shR.shape("RRR", " S ", " S ");
			shR.setIngredient('R', Material.STONE, 3);
			shR.setIngredient('S', Material.STICK);
		    main.getServer().addRecipe(shR);
		}
		
		//
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"Shovel1"),ItemsCreator.Granite_Shovel(1));
			shR.shape("R", "S", "S");
			shR.setIngredient('R', Material.STONE, 1);
			shR.setIngredient('S', Material.STICK);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"Shovel2"),ItemsCreator.Andesite_Shovel(1));
			shR.shape("R", "S", "S");
			shR.setIngredient('R', Material.STONE, 5);
			shR.setIngredient('S', Material.STICK);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"Shovel3"),ItemsCreator.Diorite_Shovel(1));
			shR.shape("R", "S", "S");
			shR.setIngredient('R', Material.STONE, 3);
			shR.setIngredient('S', Material.STICK);
		    main.getServer().addRecipe(shR);
		}
		
		
		
		////
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FullLoggs1"),ItemsCreator.Barked_Oak_Log(4));
			shR.shape("LL", "LL");
			shR.setIngredient('L', Material.LOG, 0);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FullLoggs2"),ItemsCreator.Barked_Spruce_Log(4));
			shR.shape("LL", "LL");
			shR.setIngredient('L', Material.LOG, 1);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FullLoggs3"),ItemsCreator.Barked_Birch_Log(4));
			shR.shape("LL", "LL");
			shR.setIngredient('L', Material.LOG, 2);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FullLoggs4"),ItemsCreator.Barked_Jungle_Log(4));
			shR.shape("LL", "LL");
			shR.setIngredient('L', Material.LOG, 3);
		    main.getServer().addRecipe(shR);
		}
		
		////
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FullLoggs21"),ItemsCreator.Barked_Acacia_Log(4));
			shR.shape("LL", "LL");
			shR.setIngredient('L', Material.LOG_2, 0);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FullLoggs22"),ItemsCreator.Barked_Dark_Oak_Log(4));
			shR.shape("LL", "LL");
			shR.setIngredient('L', Material.LOG_2, 1);
		    main.getServer().addRecipe(shR);
		}
		
		////
		
		
		if(enabled){
		    HeadUnitShapelessRecipe.addNew(HURecipeLayouts.shlessSingle, TextureDatabase.OAK_BARK, new ItemStack(Material.WOOD, 4, (short) 0));
		    HeadUnitShapelessRecipe.addNew(HURecipeLayouts.shlessSingle, TextureDatabase.SPRUCE_BARK, new ItemStack(Material.WOOD, 4, (short) 1));
		    HeadUnitShapelessRecipe.addNew(HURecipeLayouts.shlessSingle, TextureDatabase.BIRCH_BARK, new ItemStack(Material.WOOD, 4, (short) 2));
		    HeadUnitShapelessRecipe.addNew(HURecipeLayouts.shlessSingle, TextureDatabase.JUNGLE_BARK, new ItemStack(Material.WOOD, 4, (short) 3));
		    HeadUnitShapelessRecipe.addNew(HURecipeLayouts.shlessSingle, TextureDatabase.ACACIA_BARK, new ItemStack(Material.WOOD, 4, (short) 4));
		    HeadUnitShapelessRecipe.addNew(HURecipeLayouts.shlessSingle, TextureDatabase.DARK_OAK_BARK, new ItemStack(Material.WOOD, 4, (short) 5));
		    
		    HeadUnitShapedRecipe.addNew(HURecipeLayouts.shaped2x2, TextureDatabase.OAK_BARK, new ItemStack(Material.LOG, 4, (short) 0));
		    HeadUnitShapedRecipe.addNew(HURecipeLayouts.shaped2x2, TextureDatabase.SPRUCE_BARK, new ItemStack(Material.LOG, 4, (short) 1));
		    HeadUnitShapedRecipe.addNew(HURecipeLayouts.shaped2x2, TextureDatabase.BIRCH_BARK, new ItemStack(Material.LOG, 4, (short) 2));
		    HeadUnitShapedRecipe.addNew(HURecipeLayouts.shaped2x2, TextureDatabase.JUNGLE_BARK, new ItemStack(Material.LOG, 4, (short) 3));
		    
		    HeadUnitShapedRecipe.addNew(HURecipeLayouts.shaped2x2, TextureDatabase.ACACIA_BARK, new ItemStack(Material.LOG_2, 4, (short) 0));
		    HeadUnitShapedRecipe.addNew(HURecipeLayouts.shaped2x2, TextureDatabase.DARK_OAK_BARK, new ItemStack(Material.LOG_2, 4, (short) 1));
		}
		
		
		////
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FlatStone1"),ItemsCreator.Flat_Stone(4));
			shR.shape("SSS", "SSS", "SSS");
			shR.setIngredient('S', Material.STEP, 0);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FlatStone2"),ItemsCreator.Flat_Sandstone(4));
			shR.shape("SSS", "SSS", "SSS");
			shR.setIngredient('S', Material.STEP, 1);
		    main.getServer().addRecipe(shR);
		}
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FlatStone3"),ItemsCreator.Flat_Red_Sandstone(4));
			shR.shape("SSS", "SSS", "SSS");
			shR.setIngredient('S', Material.STONE_SLAB2, 0);
		    main.getServer().addRecipe(shR);
		}
		
		//
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"FlatStone4"),ItemsCreator.Flat_Stone(1));
			shR.shape("S", "S");
			shR.setIngredient('S', Material.STEP, 0);
		    main.getServer().addRecipe(shR);
		}
		
		
		////
		
		if(enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"WebBlockk"),new ItemStack(Material.WEB, 1));
			shR.shape("SSS", "SSS", "SSS");
			shR.setIngredient('S', Material.STRING);
		    main.getServer().addRecipe(shR);
		}
		
		////
		
		if(enabled){
			ShapelessRecipe shR = new ShapelessRecipe(new NamespacedKey(Main.instance,"WebToStringg"),new ItemStack(Material.STRING, 9));
			shR.addIngredient(Material.WEB);
		    main.getServer().addRecipe(shR);
		}
		
		////
		
		if(enabled){
			ShapelessRecipe shR = new ShapelessRecipe(new NamespacedKey(Main.instance,"ClayBlockk"),new ItemStack(Material.CLAY_BALL, 4));
			shR.addIngredient(Material.CLAY);
		    main.getServer().addRecipe(shR);
		}
		
		////
		
		if(enabled){
			ShapelessRecipe shR = new ShapelessRecipe(new NamespacedKey(Main.instance,"MagmaBlockk"),new ItemStack(Material.MAGMA, 1));
			shR.addIngredient(Material.LAVA_BUCKET);
			shR.addIngredient(Material.COBBLESTONE);
		    main.getServer().addRecipe(shR);
		}
		
		////
		
		if(enabled){
			ShapelessRecipe shR = new ShapelessRecipe(new NamespacedKey(Main.instance,"MossCobbleBlockk"),new ItemStack(Material.MOSSY_COBBLESTONE, 1));
			shR.addIngredient(Material.SEEDS);
			shR.addIngredient(Material.COBBLESTONE);
		    main.getServer().addRecipe(shR);
		}
		
		////
		
		if(enabled){
			ShapelessRecipe shR = new ShapelessRecipe(new NamespacedKey(Main.instance,"PrisToShard"),new ItemStack(Material.PRISMARINE_SHARD, 4));
			shR.addIngredient(Material.PRISMARINE);
		    main.getServer().addRecipe(shR);
		}
		
		////
		
		if(!enabled){
			ShapedRecipe shR = new ShapedRecipe(new NamespacedKey(Main.instance,"PortableCraftingTablee"),ItemsCreator.Portable_Crafting_Table(1));
			shR.shape(" I ", "ICI", " I ");
			shR.setIngredient('I', Material.IRON_INGOT);
			shR.setIngredient('C', Material.WORKBENCH);
		    main.getServer().addRecipe(shR);
		}
		
		
	    
    }
	
	
}
