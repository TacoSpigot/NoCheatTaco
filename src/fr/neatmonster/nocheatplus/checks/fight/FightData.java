package fr.neatmonster.nocheatplus.checks.fight;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;

/*
 * MM""""""""`M oo          dP         dP   M""""""'YMM            dP            
 * MM  mmmmmmmM             88         88   M  mmmm. `M            88            
 * M'      MMMM dP .d8888b. 88d888b. d8888P M  MMMMM  M .d8888b. d8888P .d8888b. 
 * MM  MMMMMMMM 88 88'  `88 88'  `88   88   M  MMMMM  M 88'  `88   88   88'  `88 
 * MM  MMMMMMMM 88 88.  .88 88    88   88   M  MMMM' .M 88.  .88   88   88.  .88 
 * MM  MMMMMMMM dP `8888P88 dP    dP   dP   M       .MM `88888P8   dP   `88888P8 
 * MMMMMMMMMMMM         .88                 MMMMMMMMMMM                          
 *                  d8888P                                                       
 */
/**
 * Player specific data for the fight checks.
 */
public class FightData {

    /** The map containing the data per players. */
    private static Map<String, FightData> playersMap = new HashMap<String, FightData>();

    /**
     * Gets the data of a specified player.
     * 
     * @param player
     *            the player
     * @return the data
     */
    public static FightData getData(final Player player) {
        if (!playersMap.containsKey(player.getName()))
            playersMap.put(player.getName(), new FightData());
        return playersMap.get(player.getName());
    }

    // Violation levels.
    public double                  angleVL;

    // Data of the angle check.
    public TreeMap<Long, Location> angleHits = new TreeMap<Long, Location>();
}
