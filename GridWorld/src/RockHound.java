import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;

import java.util.ArrayList;
import java.util.Iterator;

public class RockHound extends Critter {

    @Override
    public void processActors(ArrayList<Actor> actors) {
        Iterator i$ = actors.iterator();

        while(i$.hasNext()) {
            Actor a = (Actor)i$.next();
            if(a instanceof Rock) {
                a.removeSelfFromGrid();
            }
        }

    }
}
