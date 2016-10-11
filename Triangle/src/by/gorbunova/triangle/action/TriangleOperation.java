package by.gorbunova.triangle.action;


import by.gorbunova.triangle.entity.Point;
import by.gorbunova.triangle.entity.Triangle;

public class TriangleOperation {
	
	/** method defines triangle perimetr
	 * 
	 * @param any Triangle
	 * @return double perimetr
	 */

	public double trianglePerimetr(Triangle t) {
		Point a = t.getA();
		Point b = t.getB();
		Point c = t.getC();
		double ab = Math.sqrt((Math.pow((b.getX() - a.getX()), 2)) + (Math.pow((b.getY() - a.getY()), 2)));
		double bc = Math.sqrt((Math.pow((c.getX() - b.getX()), 2)) + (Math.pow((c.getY() - b.getY()), 2)));
		double ca = Math.sqrt((Math.pow((a.getX() - c.getX()), 2)) + (Math.pow((a.getY() - c.getY()), 2)));
		return ab + bc + ca;
	}
	
	/** method defines triangle square
	 * 
	 * @param any Triangle
	 * @return double square
	 */

	public double triangleSquare (Triangle t){
		Point a = t.getA();
		Point b = t.getB();
		Point c = t.getC();
		double ab = Math.sqrt((Math.pow((b.getX() - a.getX()), 2)) + (Math.pow((b.getY() - a.getY()), 2)));
		double bc = Math.sqrt((Math.pow((c.getX() - b.getX()), 2)) + (Math.pow((c.getY() - b.getY()), 2)));
		double ca = Math.sqrt((Math.pow((a.getX() - c.getX()), 2)) + (Math.pow((a.getY() - c.getY()), 2)));
		double pp = (ab+bc+ca)/2;
		double sqr = Math.sqrt((pp*(pp - ab)*(pp-bc)*(pp-ca)));
		return sqr;
	}
	
	/** method defines if Triangle is rectangular
	 * 
	 * @param any Triangle
	 * @return boolean true or false
	 */

	public boolean isRectangular(Triangle t){
		Point a = t.getA();
		Point b = t.getB();
		Point c = t.getC();
		double ab = Math.sqrt((Math.pow((b.getX() - a.getX()), 2)) + (Math.pow((b.getY() - a.getY()), 2)));
		double bc = Math.sqrt((Math.pow((c.getX() - b.getX()), 2)) + (Math.pow((c.getY() - b.getY()), 2)));
		double ca = Math.sqrt((Math.pow((a.getX() - c.getX()), 2)) + (Math.pow((a.getY() - c.getY()), 2)));
		if (ca == Math.sqrt(Math.pow(ab, 2) + Math.pow(bc, 2))){
			return true;
		} else if (bc == Math.sqrt(Math.pow(ab, 2) + Math.pow(ca, 2))){
			return true;
		} else if (ab == Math.sqrt(Math.pow(bc, 2) + Math.pow(ca, 2))){
			return true;
		}
		return false;
	}
}
