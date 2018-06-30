package com.quzzar.atlas.atlasutilities;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;


public class CoordsDisplay {
	
	public static ArrayList<Scoreboard> scoreboards = new ArrayList<Scoreboard>();
	
	public static void setDisplay(Player p) {
		
		Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective obj = board.registerNewObjective("Coords", "Entry");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        
        Team onlineCounter = board.registerNewTeam("coords");
        onlineCounter.addEntry(ChatColor.BLACK + "" + ChatColor.WHITE + "");
        
        obj.getScore(ChatColor.BLACK + "" + ChatColor.WHITE + "").setScore(0);
        
        p.setScoreboard(board);
        
        scoreboards.add(board);
        
        setCoordValues(board, p);
		
	}
	
	public static void removeDisplay(Player p) {
		
		scoreboards.remove(p.getScoreboard());
		p.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
		
	}
	
	
	public static void updateDisplay(Player p) {
		
		if (hasDisplay(p)) {
			
			Scoreboard board = p.getScoreboard();
			
			setCoordValues(board, p);
			
		}
	}
	
	public static boolean hasDisplay(Player p) {
		if(p.getScoreboard()!=null && p.getScoreboard().getObjective(DisplaySlot.SIDEBAR)!=null && 
				scoreboards.contains(p.getScoreboard())) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void setCoordValues(Scoreboard board, Player p) {
		
		board.getObjective(DisplaySlot.SIDEBAR).setDisplayName(ChatColor.GOLD+""+ChatColor.BOLD+""+getFacingDirection(p)+"  ");
		board.getTeam("coords").setPrefix(ChatColor.AQUA+""+ChatColor.ITALIC+""+p.getLocation().getBlockX()+" "+p.getLocation().getBlockZ());
		
	}
	
    public static String getFacingDirection(Player player) {
	    float yaw = player.getLocation().getYaw();
	    if (yaw < 0) {
	        yaw += 360;
	    }
	    if (yaw >= 315 || yaw < 45) {
	        return "S";
	    } else if (yaw < 135) {
	        return "W";
	    } else if (yaw < 225) {
	        return "N";
	    } else if (yaw < 315) {
	        return "E";
	    }
	    return "N";
    }
	
	
}
