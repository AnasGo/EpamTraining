package by.gorbunova.triangle.main;

import by.gorbunova.triangle.action.TriangleOperation;
import by.gorbunova.triangle.entity.Point;
import by.gorbunova.triangle.entity.Triangle;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(3,2);
		Point b = new Point (-4, 7);
		Point c = new Point (5, -2);
		Triangle triangle = new Triangle(a,b,c);
		TriangleOperation trOperation = new TriangleOperation();
		double trSquare = trOperation.trianglePerimetr(triangle);
		double trPerimetr = trOperation.trianglePerimetr(triangle);
		boolean isRetang = trOperation.isRectangular(triangle);
		
	}
}
