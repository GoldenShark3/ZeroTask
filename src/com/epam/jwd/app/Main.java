package com.epam.jwd.app;
import com.epam.jwd.model.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static Point[] arrayOfPoints;
	private final static Logger LOGGER = LogManager.getLogger();

	private static void displayArrayOfPoints() {
		for(int i = 0; i < arrayOfPoints.length; i++){
			LOGGER.log(Level.INFO, "Display {} point: ", i + 1);
			System.out.println((i + 1) + ")" + arrayOfPoints[i]);
		}
	} 

	public static void main(String[] args) {
		arrayOfPoints = new Point[2];
		Point firstPoint = new Point(3, 4);
		Point secondPoint = new Point(5, -3);
		arrayOfPoints[0] = firstPoint;
		arrayOfPoints[1] = secondPoint;
		displayArrayOfPoints();
	}
}
