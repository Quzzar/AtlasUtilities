package com.quzzar.atlas.atlasutilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.quzzar.atlas.atlasutilities.CustomHeads.HeadUtil;
import com.quzzar.atlas.atlasutilities.CustomHeads.TextureDatabase;
import com.quzzar.atlas.atlasutilities.CustomRecipePack.HeadUnitShapedRecipe;
import com.quzzar.atlas.atlasutilities.CustomRecipePack.HeadUnitShapelessRecipe;

public class MainListener implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onBlockPlace(BlockPlaceEvent e) {

		if (!e.isCancelled()) {

			if (HeadUtil.checkMechanical(e.getItemInHand())) {
				if (HeadUtil.getTexture(e.getItemInHand()).equals(TextureDatabase.CRAFTING_TABLE)) {
					e.setCancelled(true);
					return;
				}
			}

			if (e.getItemInHand() != null && e.getItemInHand().isSimilar(ItemsCreator.Flat_Stone(1))) {

				e.setCancelled(true);

				attemptPlaceBlock(e.getBlockPlaced(), 43, 8, e.getItemInHand(), e.getPlayer(), Sound.BLOCK_STONE_PLACE);

				return;
			}

			if (e.getItemInHand() != null && e.getItemInHand().isSimilar(ItemsCreator.Flat_Sandstone(1))) {
				
				e.setCancelled(true);

				attemptPlaceBlock(e.getBlockPlaced(), 43, 9, e.getItemInHand(), e.getPlayer(), Sound.BLOCK_STONE_PLACE);

				return;
			}

			if (e.getItemInHand() != null && e.getItemInHand().isSimilar(ItemsCreator.Flat_Red_Sandstone(1))) {

				e.setCancelled(true);

				attemptPlaceBlock(e.getBlockPlaced(), 181, 8, e.getItemInHand(), e.getPlayer(),
						Sound.BLOCK_STONE_PLACE);

				return;
			}

			////

			if (e.getItemInHand() != null && e.getItemInHand().isSimilar(ItemsCreator.Barked_Oak_Log(1))) {

				e.setCancelled(true);

				attemptPlaceBlock(e.getBlockPlaced(), 17, 12, e.getItemInHand(), e.getPlayer(), Sound.BLOCK_WOOD_PLACE);

				return;
			}

			if (e.getItemInHand() != null && e.getItemInHand().isSimilar(ItemsCreator.Barked_Spruce_Log(1))) {

				e.setCancelled(true);

				attemptPlaceBlock(e.getBlockPlaced(), 17, 13, e.getItemInHand(), e.getPlayer(), Sound.BLOCK_WOOD_PLACE);

				return;
			}

			if (e.getItemInHand() != null && e.getItemInHand().isSimilar(ItemsCreator.Barked_Birch_Log(1))) {

				e.setCancelled(true);

				attemptPlaceBlock(e.getBlockPlaced(), 17, 14, e.getItemInHand(), e.getPlayer(), Sound.BLOCK_WOOD_PLACE);

				return;
			}

			if (e.getItemInHand() != null && e.getItemInHand().isSimilar(ItemsCreator.Barked_Jungle_Log(1))) {

				e.setCancelled(true);

				attemptPlaceBlock(e.getBlockPlaced(), 17, 15, e.getItemInHand(), e.getPlayer(), Sound.BLOCK_WOOD_PLACE);

				return;
			}

			if (e.getItemInHand() != null && e.getItemInHand().isSimilar(ItemsCreator.Barked_Acacia_Log(1))) {

				e.setCancelled(true);

				attemptPlaceBlock(e.getBlockPlaced(), 162, 12, e.getItemInHand(), e.getPlayer(),
						Sound.BLOCK_WOOD_PLACE);

				return;
			}

			if (e.getItemInHand() != null && e.getItemInHand().isSimilar(ItemsCreator.Barked_Dark_Oak_Log(1))) {

				e.setCancelled(true);

				attemptPlaceBlock(e.getBlockPlaced(), 162, 13, e.getItemInHand(), e.getPlayer(),
						Sound.BLOCK_WOOD_PLACE);

				return;
			}

		}

	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onBlockBreak(BlockBreakEvent e) {

		if (!e.isCancelled()) {

			if (e.getBlock().getType().equals(Material.DEAD_BUSH)) {

				Location loc = e.getBlock().getLocation().clone();
				loc.add(0.5, 0, 0.5);

				Random rand = new Random();

				loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.STICK, rand.nextInt(3)));
				return;

			}

			if (!e.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {

				boolean isSpecialBreaking = false;

				isSpecialBreaking = checkBreakBlock(e.getBlock(), 43, 8, ItemsCreator.Flat_Stone(1), 
						isSpecialBreaking);
				isSpecialBreaking = checkBreakBlock(e.getBlock(), 43, 9, ItemsCreator.Flat_Sandstone(1),
						isSpecialBreaking);
				isSpecialBreaking = checkBreakBlock(e.getBlock(), 181, 8, ItemsCreator.Flat_Red_Sandstone(1),
						isSpecialBreaking);
				/*
				isSpecialBreaking = checkBreakBlock(e.getBlock(), 17, 12, ItemsCreator.Barked_Oak_Log(1),
						isSpecialBreaking);
				isSpecialBreaking = checkBreakBlock(e.getBlock(), 17, 13, ItemsCreator.Barked_Spruce_Log(1),
						isSpecialBreaking);
				isSpecialBreaking = checkBreakBlock(e.getBlock(), 17, 14, ItemsCreator.Barked_Birch_Log(1),
						isSpecialBreaking);
				isSpecialBreaking = checkBreakBlock(e.getBlock(), 17, 15, ItemsCreator.Barked_Jungle_Log(1),
						isSpecialBreaking);
				isSpecialBreaking = checkBreakBlock(e.getBlock(), 162, 12, ItemsCreator.Barked_Acacia_Log(1),
						isSpecialBreaking);
				isSpecialBreaking = checkBreakBlock(e.getBlock(), 162, 13, ItemsCreator.Barked_Dark_Oak_Log(1),
						isSpecialBreaking);
				*/

				if (isSpecialBreaking) {
					e.setDropItems(false);
				}

			}

		}

	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onBlockPreventPlace(BlockPlaceEvent e) {

		if (e.isCancelled()) {

			// prevent block abusing

			if (!e.getPlayer().isOnGround()) {

				Location pl = e.getPlayer().getLocation();

				if (e.getBlock().getLocation().getBlockX() == pl.getBlockX()
						&& e.getBlock().getLocation().getBlockZ() == pl.getBlockZ()) {

					if (e.getBlock().getLocation().getBlockY() < pl.getBlockY()) {

						e.getPlayer().teleport(new Location(pl.getWorld(), pl.getX(), pl.getY() - 1, pl.getZ(),
								pl.getYaw(), pl.getPitch()));

					}

				}

			}

		}

	}

	@EventHandler
	public void onCommandExecuted(PlayerCommandPreprocessEvent e) {
		if (!e.getPlayer().hasPermission("helpcommands.override")) {

			if (e.getMessage().equalsIgnoreCase("/plugins") || e.getMessage().equalsIgnoreCase("/?")) {
				e.setCancelled(true);
				e.getPlayer().sendMessage("Unknown command. Type \"/help\" for help.");
				return;
			}

		}
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		
		if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {

			ItemStack itemInHand = e.getPlayer().getInventory().getItemInMainHand();

			if (e.getClickedBlock().getType().equals(Material.LADDER)
					&& itemInHand.isSimilar(new ItemStack(Material.LADDER))) {

				Block botBlock = findBottomOfLadder(e.getClickedBlock());

				if (botBlock.getType().equals(Material.AIR)) {

					BlockBreakEvent eventBreak = new BlockBreakEvent(botBlock, e.getPlayer());
					Bukkit.getServer().getPluginManager().callEvent(eventBreak);

					if (!eventBreak.isCancelled()) {

						BlockFace clickedFace = ((Directional) e.getClickedBlock().getState().getData()).getFacing();

						botBlock.setType(Material.LADDER, false);

						botBlock.setData(blockFaceToByte(clickedFace), false);

						botBlock.getWorld().playSound(botBlock.getLocation(), Sound.BLOCK_LADDER_PLACE, 1f, 1f);

						if (!e.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
							itemInHand.setAmount(itemInHand.getAmount() - 1);
						}

					}

				}

				return;

			}
			
			
			if (itemInHand.isSimilar(ItemsCreator.Selvalas_Scepter(1))) {
				
				Block b = e.getClickedBlock();
				
				if(b.getType().isSolid()) {
					
					BlockBreakEvent eventBreak = new BlockBreakEvent(b, e.getPlayer());
					Bukkit.getServer().getPluginManager().callEvent(eventBreak);

					if (!eventBreak.isCancelled()) {
						
						Location centerBlockLoc = b.getLocation().clone();
						centerBlockLoc.setX(centerBlockLoc.getX()+0.5);
						centerBlockLoc.setZ(centerBlockLoc.getZ()+0.5);
						
						FallingBlock fallingblock = b.getWorld().spawnFallingBlock(centerBlockLoc,
								new MaterialData(b.getType(),b.getData()));
		                fallingblock.setDropItem(false);
						
		                b.setType(Material.AIR);
		                
		                b.getWorld().playSound(b.getLocation(), Sound.ENTITY_EVOCATION_ILLAGER_PREPARE_SUMMON, 1f, 1f);
		                
		                Random rand = new Random();
						
						if(rand.nextInt(100)==1) {
							itemInHand.setAmount(itemInHand.getAmount()-1);
							e.getPlayer().getWorld().playSound(e.getPlayer().getLocation(),
									Sound.ENTITY_ITEM_BREAK, 1f, 1f);
						}
						
					}
					
				}
				
				return;
				
			}
			

		}

		if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {

			Player p = e.getPlayer();

			ItemStack i = p.getInventory().getItemInMainHand();
			ItemStack i_o = p.getInventory().getItemInOffHand();

			if (i != null) {
				if (HeadUtil.checkMechanical(i)) {
					if (HeadUtil.getTexture(i).equals(TextureDatabase.CRAFTING_TABLE)) {
						p.openWorkbench(p.getLocation(), true);
						return;
					}
				}
			}

			if (i_o != null) {
				if (HeadUtil.checkMechanical(i_o)) {
					if (HeadUtil.getTexture(i_o).equals(TextureDatabase.CRAFTING_TABLE)) {
						p.openWorkbench(p.getLocation(), true);
						return;
					}
				}
			}
			
			if (i.isSimilar(ItemsCreator.Grenzos_Anguish(1))) {
				if(!p.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
					
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 2));
					
					p.getWorld().playSound(p.getLocation(), Sound.ENTITY_LIGHTNING_IMPACT, 0.5f, 1f);
					
					Random rand = new Random();
					
					if(rand.nextInt(4)==1) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 50, 2));
					}
					if(rand.nextInt(5)==1) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 1));
					}
					if(rand.nextInt(4)==1) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 30, 2));
					}
					if(rand.nextInt(14)==1) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 80, 1));
					}
					if(rand.nextInt(3)==1) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 80, 1));
					}
					if(rand.nextInt(16)==1) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 120, 1));
					}
					if(rand.nextInt(16)==1) {
						p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 2));
					}
					return;
				}
			}

		}

	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerInteractEntity(PlayerInteractEntityEvent e) {

		if (!e.isCancelled()) {
			
			Player p = e.getPlayer();
			ItemStack mainHand = p.getInventory().getItemInMainHand();
			
			if (mainHand.isSimilar(ItemsCreator.Security_Baton(1)) && e.getRightClicked() instanceof Player) {
				Player otherP = (Player) e.getRightClicked();
				
				SearchHandler.addSearchingPlayer(p,otherP);
				
				return;
			}
			
			if (mainHand.isSimilar(ItemsCreator.Tolsimirian_Rune(1))) {
				
				Entity entity = e.getRightClicked();
				
				if(!entity.isGlowing()) {
					
					entity.setGlowing(true);
					entity.getWorld().playSound(entity.getLocation(), Sound.ENTITY_EVOCATION_ILLAGER_PREPARE_WOLOLO, 1f, 1f);
					
					Bukkit.getScheduler().runTaskLater(Main.instance, new Runnable() {
						@Override
						public void run() {
							entity.setGlowing(false);
						}
					}, 160L);
				}
			}
			
			
			
			if (e.getRightClicked() instanceof LivingEntity 
							&& !e.getRightClicked().getType().equals(EntityType.HORSE)
							&& !e.getRightClicked().getType().equals(EntityType.MULE)
							&& !e.getRightClicked().getType().equals(EntityType.DONKEY)) {
				
				LivingEntity livEntity = (LivingEntity) e.getRightClicked();

				if (mainHand != null && mainHand.getType().equals(Material.LEASH) && mainHand.getAmount() == 1) {
					
					e.setCancelled(true);
					mainHand.setAmount(0);

					Bukkit.getScheduler().runTaskLater(Main.instance, new Runnable() {
						@Override
						public void run() {
							livEntity.setLeashHolder(p);
						}
					}, 1L);

				}
			}
		}
	}

	/*
	 * @EventHandler public void onBlockPhysics(BlockPhysicsEvent e) {
	 * if(e.getBlock().getType().equals(Material.LADDER)) { e.setCancelled(true); }
	 * }
	 */
	
	
	@EventHandler
    public void onInventoryClick(InventoryClickEvent e){
		
		Inventory inv = e.getInventory();
		
		if(inv!=null) {
			if(inv.getMaxStackSize()==65) {
				
				e.setCancelled(true);
				
			}
		}
	}
	
	@EventHandler
    public void onPlayerMove(PlayerMoveEvent e){
		
		if(e.getPlayer().getMaximumAir()==19 && e.getFrom().distance(e.getTo())>0.1) {
			
			for(SearchingObject search : SearchHandler.searchingPlayers) {
				if(!search.isMoved() && search.getPlayer().equals(e.getPlayer())) {
					search.setMoved(true);
					search.getPlayer().sendMessage(ChatColor.RED+"You moved! Searching cancelled!");
					search.getOtherPlayer().sendMessage(ChatColor.RED+search.getPlayer().getDisplayName()+" attempted to search you!");
					return;
				}
			}
			
		}
		
	}
	
	@EventHandler
    public void onEntityDeath(EntityDeathEvent e){
		
		if(e.getEntityType().equals(EntityType.SPIDER)) {
			Random rand = new Random();
			if(rand.nextInt(5)==1) {
				e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), ItemsCreator.Spider_Web(1));
			}
			return;
		}
		
		if(e.getEntityType().equals(EntityType.WOLF)) {
			Random rand = new Random();
			e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.MUTTON, rand.nextInt(3)));
			return;
		}
		
		if(e.getEntityType().equals(EntityType.ENDERMAN)) {
			Random rand = new Random();
			if(rand.nextInt(10)==1) {
				e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.CHORUS_FRUIT));
			}
			return;
		}
		
		if(e.getEntityType().equals(EntityType.HORSE) || e.getEntityType().equals(EntityType.DONKEY) || e.getEntityType().equals(EntityType.MULE)) {
			Random rand = new Random();
			e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.RAW_BEEF, rand.nextInt(4)));
			if(rand.nextInt(20)==1) {
				e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.SADDLE));
			}
			return;
		}
		
		if(e.getEntityType().equals(EntityType.ENDERMAN)) {
			Random rand = new Random();
			if(rand.nextInt(2000)==1) {
				e.getEntity().getWorld().playSound(e.getEntity().getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 1f, 1f);
				e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), ItemsCreator.Selvalas_Scepter(1));
			}
			return;
		}
		
		if(e.getEntityType().equals(EntityType.CREEPER)) {
			Random rand = new Random();
			if(rand.nextInt(2000)==1) {
				e.getEntity().getWorld().playSound(e.getEntity().getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 1f, 1f);
				e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), ItemsCreator.Grenzos_Anguish(1));
			}
			return;
		}
		
		if(e.getEntityType().equals(EntityType.SQUID)) {
			Random rand = new Random();
			if(rand.nextInt(3)==1) {
				e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.RAW_FISH));
			}
			if(rand.nextInt(2000)==1) {
				e.getEntity().getWorld().playSound(e.getEntity().getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 1f, 1f);
				e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), ItemsCreator.Tolsimirian_Rune(1));
			}
			return;
		}
		
		if(e.getEntityType().equals(EntityType.BAT)) {
			Random rand = new Random();
			if(rand.nextInt(18)==1) {
				e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), new ItemStack(Material.IRON_NUGGET));
			}
			return;
		}
		
	}

	private static byte blockFaceToByte(BlockFace face) {
		switch (face) {
		case NORTH:
			return 2;
		case SOUTH:
			return 3;
		case WEST:
			return 4;
		case EAST:
			return 5;
		default:
			return 2;
		}
	}

	private static Block findBottomOfLadder(Block b) {

		Block bCheck = b.getRelative(BlockFace.DOWN);

		if (bCheck.getType().equals(Material.LADDER)) {

			return findBottomOfLadder(bCheck);

		} else {

			return bCheck;

		}

	}

	private static void attemptPlaceBlock(Block b, int id, int data, ItemStack item, Player p, Sound sound) {

		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
			@SuppressWarnings("deprecation")
			public void run() {

				if (!b.getLocation().equals(p.getLocation().getBlock().getLocation())) {

					if (!p.getGameMode().equals(GameMode.CREATIVE)) {
						item.setAmount(item.getAmount() - 1);
					}
					b.setTypeIdAndData(id, (byte) data, true);
					b.getWorld().playSound(b.getLocation(), sound, 1f, 1f);

				}

			}
		}, 0L);
		
	}

	@SuppressWarnings("deprecation")
	private static boolean checkBreakBlock(Block b, int id, int data, ItemStack item, boolean isFound) {

		if (isFound) {
			return isFound;
		}

		if (b.getTypeId() == id && b.getData() == data) {

			b.getWorld().dropItemNaturally(b.getLocation(), item);
			return true;

		}

		return false;

	}
	
	
	
	@EventHandler
    public void onPlayerCraft(PrepareItemCraftEvent event) {
		
		if(event.getRecipe()!=null){
			
			
			if(event.getRecipe() instanceof ShapedRecipe){
				
				for(HeadUnitShapedRecipe HUr: HeadUnitShapedRecipe.list){
					
					
					if(HUr.getRecipe().getKey().equals(((ShapedRecipe)event.getRecipe()).getKey())){
						
						boolean passing = false;
						
						List<ItemStack> currentstack = Arrays.asList(clean(event.getInventory().getMatrix()));
						
						checker:
						for(ItemStack is : currentstack){
							if(is.getType().equals(Material.SKULL_ITEM)){
								
								if(HeadUtil.checkMechanical(is)){
									if(HeadUtil.getTexture(is).equals(HUr.getTexture())){
										
										
										passing = true;
										
										
									}else{
										
										passing = false;
										break checker;
									}
								}else{
									passing = false;
									break checker;
								}
								
								
							}
						}
						
						
						if(passing){
							event.getInventory().setResult(HUr.getResult());
						}
						
						
					}
				}
				
			}else if (event.getRecipe() instanceof ShapelessRecipe){
				
				for(HeadUnitShapelessRecipe HUr : HeadUnitShapelessRecipe.list){
					
					
					
					if(HUr.getRecipe().getKey().equals(((ShapelessRecipe)event.getRecipe()).getKey())){
						
						boolean passing = false;
						
						List<ItemStack> currentstack = Arrays.asList(clean(event.getInventory().getMatrix()));
						
						checker:
						for(ItemStack is : currentstack){
							if(is.getType().equals(Material.SKULL_ITEM)){
								
								if(HeadUtil.checkMechanical(is)){
									if(HeadUtil.getTexture(is).equals(HUr.getTexture())){
										
										passing = true;
										
									}else{
										passing = false;
										break checker;
									}
								}else{
									passing = false;
									break checker;
								}
								
								
							}
						}
						
						
						if(passing){
							event.getInventory().setResult(HUr.getResult());
						}
						
						
					}
				}
				
			}
			
			
			
		}
	}
	
	
	public static ItemStack[] clean(final ItemStack[] v) {
	    List<ItemStack> list = new ArrayList<ItemStack>(Arrays.asList(v));
	    list.removeAll(Collections.singleton(null));
	    return list.toArray(new ItemStack[list.size()]);
	}
	
	
}
