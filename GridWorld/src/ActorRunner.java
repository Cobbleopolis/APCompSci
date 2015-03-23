import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ActorRunner {
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        Actor actor = new Actor();
        Location location = new Location(1, 2);
        actor.putSelfInGrid(world.getGrid(), location);
        actor.removeSelfFromGrid();
        actor.putSelfInGrid(world.getGrid(), location);
        world.show();
    }

}
