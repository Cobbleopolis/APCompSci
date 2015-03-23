import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;

public class Jumper extends Bug {

    public Jumper() {
        this.setColor(Color.RED);
        this.setDirection(90);
    }

    public Jumper(Color color){
        this.setColor(color);
        this.setDirection(90);
    }

    @Override
    public void act() {
        if(this.canMove2()){
            Location loc = this.getLocation();
            this.moveTo(this.getLocation().getAdjacentLocation(this.getDirection()).getAdjacentLocation(this.getDirection()));
            this.getGrid().put(loc, new Flower(this.getColor()));
        } else if(this.canMove()) {
            this.move();
        } else {
            this.turn();
        }
    }

    @Override
    public boolean canMove(){
        Grid gr = this.getGrid();
        if(gr == null) {
            return false;
        } else {
            Location loc = this.getLocation();
            Location next = loc.getAdjacentLocation(this.getDirection());
            if(!gr.isValid(next)) {
                return false;
            } else {
                Actor neighbor = (Actor)gr.get(next);
                return neighbor == null;
            }
        }
    }

    public boolean canMove2() {
        Grid gr = this.getGrid();
        if(gr == null) {
            return false;
        } else {
            Location loc = this.getLocation();
            Location next = loc.getAdjacentLocation(this.getDirection()).getAdjacentLocation(this.getDirection());
            if(!gr.isValid(next)) {
                return false;
            } else {
                Actor neighbor = (Actor)gr.get(next);
                return neighbor == null;
            }
        }
    }
}
