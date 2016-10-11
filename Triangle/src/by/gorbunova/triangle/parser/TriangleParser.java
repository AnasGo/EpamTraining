package by.gorbunova.triangle.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.gorbunova.triangle.entity.Point;
import by.gorbunova.triangle.entity.Triangle;

public class TriangleParser {
	private static Logger log = LogManager.getLogger();
	private static final String SPACING = "\\s+";
	
	/** method for data parsing 
	 * 
	 * @param collection of String got from TriangleReaderFromFile.class
	 * @return collection of Triangle
	 */
	public ArrayList<Triangle> parseData(List<String> lines) {
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();

		for (String line : lines) {
			Triangle triangle = parseLine(line);
			if (!(triangle == null)) {
				triangles.add(triangle);
				log.info("Triangle was added to collection successfully.");
			}
		}
		return triangles;
	}
	
	/** method for string parsing
	 * 
	 * @param String from file
	 * @return Triangle
	 */
	private static Triangle parseLine(String line) {
		Scanner sc = new Scanner(line);
		sc.useDelimiter(SPACING);
		Triangle tr = null;
		try {
			tr = new Triangle(new Point(sc.nextInt(), sc.nextInt()), new Point(sc.nextInt(), sc.nextInt()), new Point(sc.nextInt(), sc.nextInt()));
			if (tr.isTriangle()){
				log.info("Successful triangle parsing.");
				return tr;
			} else {
				log.error("Points on the one line, triangle can not be created.");
				return null;
			}	
		} catch (NoSuchElementException | NumberFormatException e) {
			log.error("Triangle not created, error parsing in String " + line, e);
		} finally {
			if (!(sc == null)) {
				sc.close();
			}
		}
		return tr;
	}
}
