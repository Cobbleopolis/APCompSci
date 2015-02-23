

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class BugRunner2 {
	static ActorWorld world = new ActorWorld();
	static boolean isBug = true;
	
	public static void main(String[] args) {
		for(int i=0; i<=9; i++){
			for(int j=0; j<=9; j++){
				if (isBug){
					world.add(new Location (j, i), new Bug());
				} else {
					world.add(new Location (j, i), new Rock());
				}
				isBug = !isBug;
			}
			isBug = !isBug;
       }
        world.show();

	}
}
