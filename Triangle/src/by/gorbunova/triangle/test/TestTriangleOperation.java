package by.gorbunova.triangle.test;

import static org.junit.Assert.*;

import org.junit.Test;
import by.gorbunova.triangle.action.TriangleOperation;
import by.gorbunova.triangle.entity.Point;
import by.gorbunova.triangle.entity.Triangle;

public class TestTriangleOperation {

	@Test
	public void testTrianglePerimetr() {
		Point a = new Point(1, 2);
		Point b = new Point(4, -1);
		Point c = new Point(-3, -2);
		Triangle t = new Triangle(a, b, c);
		TriangleOperation to = new TriangleOperation();
		double p = to.trianglePerimetr(t);
		boolean actual = p <= 0 ? true : false;
		assertFalse("Fail in testTrianglePerimetr", actual);
	}

	@Test
	public void testTriangleSquare() {
		Point a = new Point(1, 3);
		Point b = new Point(3, 1);
		Point c = new Point(2, 4);
		Triangle t = new Triangle(a, b, c);
		TriangleOperation to = new TriangleOperation();
		double sqr = to.triangleSquare(t);
		boolean actual = sqr <= 0 ? true : false;
		assertFalse("Fail in testTriangleSquare", actual);
	}

	@Test
	public void testIsRectangular() {
		Point a = new Point(1, 48);
		Point b = new Point(3, 1);
		Point c = new Point(2, 4);
		Triangle t = new Triangle(a, b, c);
		TriangleOperation to = new TriangleOperation();
		boolean expected = false;
		assertEquals("Fail in testIsRectangular", to.isRectangular(t), expected);
	}
}
