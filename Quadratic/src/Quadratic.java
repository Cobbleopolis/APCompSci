public class Quadratic{

	public double a;
	public double b;
	public double c;

	public Quadratic() {
		a = 1;
		b = 1;
		c = 1;
	}

	public Quadratic(double la, double lb, double lc) {
		a = la;
		b = lb;
		c = lc;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public void setA(double la) {
		a = la;
	}

	public void setB(double lb) {
		b = lb;
	}

	public void setC(double lc) {
		a = lc;
	}

	public boolean hasSolutions() {
		return Math.pow(b, 2) - (4 * a * c) >= 0;
	}

	public double getSolution1() {
		return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	}

	public double getSolution2() {
		return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	}

	@Override
	public String toString() {
		String out = "";

		if (a != 1) {
			out += a + "x^2";
		} else {
			out += "x^2";
		}

		if (b > 0 && b != 1) {
			out += " + " + b + "x";
		} else if (b < 0) {
			out += " " + b + "x";
		} else if (b == 1) {
			out += "x";
		}

		if (c > 0) {
			out += " + " + c;
		} else if (c < 0) {
			out += " " + c;
		}

		if (!hasSolutions()) {
			out += " has no real solutions.";
		}
		return out;
	}

}
