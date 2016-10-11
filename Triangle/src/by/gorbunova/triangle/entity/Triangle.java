package by.gorbunova.triangle.entity;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point x, Point y, Point z) {
		this.a = x;
		this.b = y;
		this.c = z;
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

	@Override
	public String toString() {
		return "A coordinates: " + a.toString() + "; B coordinates: " + b.toString() + "; C coordinates: "
				+ c.toString();
	}

	/**
	 * method defines if points lay/not lay on one line and can construct
	 * Triangle Triangle validation
	 * 
	 * @param any
	 *            Triangle
	 * @return boolean true or false
	 */

	public boolean isTriangle() {
		if ((this.getA().getX() - this.getC().getX()) * (this.getB().getY() - this.getC().getY())
				- (this.getB().getX() - this.getC().getX()) * (this.getA().getY() - this.getC().getY()) == 0) {
			return false;
		} else {
			return true;
		}
	}
}
