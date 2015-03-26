import info.gridworld.grid.Location;

import java.util.ArrayList;

public class QuickCrab extends CrabCritter {

    @Override
    /**
     * @return list of empty locations immediately to the right and to the left
     */
    public ArrayList<Location> getMoveLocations() {
        ArrayList<Location> locs = new ArrayList<Location>();
        Location left1 = this.getLocation().getAdjacentLocation(this.getDirection() + 270);
        Location left2 = left1.getAdjacentLocation(this.getDirection() + 270);

        Location right1 = this.getLocation().getAdjacentLocation(this.getDirection() + 90);
        Location right2 = left1.getAdjacentLocation(this.getDirection() + 90);

        if (this.getGrid().isValid(left1) && this.getGrid().isValid(left2))
            if (this.getGrid().get(left1) == null && this.getGrid().get(left2) == null)
                locs.add(left2);

        if (this.getGrid().isValid(right1) && this.getGrid().isValid(right2))
            if (this.getGrid().get(right1) == null && this.getGrid().get(right2) == null)
                locs.add(right2);

        return locs;
    }
}
