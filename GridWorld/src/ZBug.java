import info.gridworld.actor.Bug;

public class ZBug extends Bug {

	public int length;
	public int steps;
	public int progress;

	public ZBug() {
		length = 4;
		steps = 0;
		progress = 0;
		setDirection(90);
	}

	public ZBug(int sideLength) {
		length = sideLength;
		steps = 0;
		progress = 0;
		setDirection(90);
	}

	@Override
	public void act() {
		if (steps < length - 1 && canMove() && progress < 4) {
			move();
			steps++;
		} else {
			if (progress == 0 && sideDone()) {
				resetSide(225);
			} else if (progress == 1 && sideDone()) {
				resetSide(90);
			} else if (progress == 2 && sideDone()) {
				progress++;
			}
		}
	}
	
	public boolean sideDone(){
		return steps >= length - 1;
	}

	public void resetSide(int deg) {
		setDirection(deg);
		steps = 0;
		progress++;
	}

}
