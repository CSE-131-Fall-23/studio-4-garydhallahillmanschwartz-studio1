package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	Color purple = new Color(255, 0, 150);
	StdDraw.setPenColor(purple);
	StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
	
	Color pink = new Color(200, 0, 150);
	StdDraw.setPenColor(pink);
	StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.1);
	
	Color lightPink = new Color(150, 0, 150);
	StdDraw.setPenColor(lightPink);
	StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.05);
	
	StdDraw.setPenColor(Color.pink);
	double[] x = {0.75, 0.75, 0.75};
	double[] y = {0.75, 0.75, 0.75};
	StdDraw.filledPolygon(x, y);
	
	
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
	}
}