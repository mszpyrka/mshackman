package main.java.pl.meszszi.mshackman.field;

import main.java.pl.meszszi.mshackman.IDangerous;
import main.java.pl.meszszi.mshackman.MapElement;
import main.java.pl.meszszi.mshackman.Position;
import main.java.pl.meszszi.mshackman.bugs.BugType;
import main.java.pl.meszszi.mshackman.maps.GameMap;

/**
 * Class that represents bug spawning point on game field.
 * There are four such spots on the map, each one spawning different type of bugs.
 */

public class BugSpawn extends MapElement implements IDangerous {

    private final BugType spawnType;

    public BugSpawn(GameMap map, Position position, BugType spawnType) {
        super(map, position);
        this.spawnType = spawnType;
    }
}
