package com.quzzar.atlas.atlasutilities;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.quzzar.atlas.atlasutilities.CustomHeads.HeadUtil;
import com.quzzar.atlas.atlasutilities.CustomHeads.TextureDatabase;

public class ItemsCreator {
	
	
	public static ItemStack Spider_Web(int amt){
		
		ItemStack i = new ItemStack(Material.WEB);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Spider Web");
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Security_Baton(int amt){
		
		ItemStack i = new ItemStack(Material.STICK);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Security Baton");
	    
	    im.addEnchant(Enchantment.KNOCKBACK, 1, false);
	    
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Granite_Pickaxe(int amt){
		
		ItemStack i = new ItemStack(Material.STONE_PICKAXE);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Granite Pickaxe");
	    
	    //im.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
	    
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Andesite_Pickaxe(int amt){
		
		ItemStack i = new ItemStack(Material.STONE_PICKAXE);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Andesite Pickaxe");
	    
	    //im.addEnchant(Enchantment.DIG_SPEED, 1, false);
	    
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Diorite_Pickaxe(int amt){
		
		ItemStack i = new ItemStack(Material.STONE_PICKAXE);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Diorite Pickaxe");
	    
	    //im.addEnchant(Enchantment.DURABILITY, 1, false);
	    
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Granite_Shovel(int amt){
		
		ItemStack i = new ItemStack(Material.STONE_SPADE);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Granite Shovel");
	    
	    //im.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, false);
	    
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Andesite_Shovel(int amt){
		
		ItemStack i = new ItemStack(Material.STONE_SPADE);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Andesite Shovel");
	    
	    //im.addEnchant(Enchantment.DIG_SPEED, 1, false);
	    
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Diorite_Shovel(int amt){
		
		ItemStack i = new ItemStack(Material.STONE_SPADE);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Diorite Shovel");
	    
	    //im.addEnchant(Enchantment.DURABILITY, 1, false);
	    
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	////
	
	public static ItemStack Portable_Crafting_Table(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.CRAFTING_TABLE, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Portable Crafting Table");
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	////
	
	public static ItemStack Barked_Oak_Log(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.OAK_BARK, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Barked Oak Wood");
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Barked_Spruce_Log(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.SPRUCE_BARK, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Barked Spruce Wood");
	    i.setItemMeta(im);
		
	    return i;
	}
	
	public static ItemStack Barked_Birch_Log(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.BIRCH_BARK, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Barked Birch Wood");
	    i.setItemMeta(im);
		
	    return i;
	}
	
	public static ItemStack Barked_Jungle_Log(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.JUNGLE_BARK, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Barked Jungle Wood");
	    i.setItemMeta(im);
		
	    return i;
	}
	
	
	public static ItemStack Barked_Acacia_Log(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.ACACIA_BARK, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Barked Acacia Wood");
	    i.setItemMeta(im);
		
	    return i;
	}
	
	public static ItemStack Barked_Dark_Oak_Log(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.DARK_OAK_BARK, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Barked Dark Oak Wood");
	    i.setItemMeta(im);
		
	    return i;
	}
	
	////
	
	public static ItemStack Flat_Stone(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.STONE_FLAT, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Flat Stone");
	    i.setItemMeta(im);
		
	    return i;
	}
	
	public static ItemStack Flat_Sandstone(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.SANDSTONE_FLAT, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Flat Sandstone");
	    i.setItemMeta(im);
		
	    return i;
	}
	
	public static ItemStack Flat_Red_Sandstone(int amt){
		
		ItemStack i = HeadUtil.makeRawItemStack(TextureDatabase.RED_SANDSTONE_FLAT, amt);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.WHITE+"Flat Red Sandstone");
	    i.setItemMeta(im);
		
	    return i;
	}
	
	////
	
	public static ItemStack Grenzos_Anguish(int amt){
		
		ItemStack i = new ItemStack(Material.FIREBALL);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.DARK_RED+""+ChatColor.MAGIC+"Grenzo's Anguish");
	    
	    im.addEnchant(Enchantment.FIRE_ASPECT, 2, false);
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Tolsimirian_Rune(int amt){
		
		ItemStack i = new ItemStack(Material.FIREWORK_CHARGE);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.DARK_AQUA+"Tolsimirian Rune");
	    
	    im.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, false);
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	public static ItemStack Selvalas_Scepter(int amt){
		
		ItemStack i = new ItemStack(Material.BLAZE_ROD);
	    ItemMeta im = i.getItemMeta();
	    im.setDisplayName(ChatColor.GOLD+""+ChatColor.ITALIC+"Selvala's Scepter");
	    
	    im.addEnchant(Enchantment.SILK_TOUCH, 1, false);
	    im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    i.setItemMeta(im);
	    
	    return i;
	}
	
	
	
}
