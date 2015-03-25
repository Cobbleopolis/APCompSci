import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter {

    @Override
    public ArrayList<Actor> getActors() {
        ArrayList<Actor> actors = new ArrayList<Actor>();
        Location loc1 = this.getLocation().getAdjacentLocation(this.getDirection());
        Location loc2 = this.getLocation().getAdjacentLocation(this.getDirection() + 180);

        if (this.getGrid().isValid(loc1) && this.getGrid().get(loc1) != null)
            actors.add(this.getGrid().get(loc1));

        if (this.getGrid().isValid(loc2) && this.getGrid().get(loc2) != null)
            actors.add(this.getGrid().get(loc2));

        return actors;
    }
}
