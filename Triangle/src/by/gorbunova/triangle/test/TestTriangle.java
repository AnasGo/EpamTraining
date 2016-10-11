package by.gorbunova.triangle.test;

import static org.junit.Assert.*;

import org.junit.Test;
import by.gorbunova.triangle.entity.Point;
import by.gorbunova.triangle.entity.Triangle;

public class TestTriangle {
	@Test
	public void testIsTriangle(){
		Point a = new Point(-2, 2);
		Point b = new Point(-2, -2);
		Point c = new Point(-2, -3);
		Triangle t = new Triangle(a, b, c);
		boolean actual = t.isTriangle();
		assertTrue("Fail in testIsTriangle", actual);
	}
}
