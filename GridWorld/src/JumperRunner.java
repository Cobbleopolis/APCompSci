import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.*;

public class JumperRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        Jumper alice = new Jumper();
        alice.setColor(Color.ORANGE);
        world.add(new Location(0,5), alice);
        world.show();
    }
}
