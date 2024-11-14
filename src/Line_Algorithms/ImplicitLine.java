package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

public class ImplicitLine {

	Point3f Start;
	Point3f End;

	public ImplicitLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	// Implement in Explict form , Extra marks for reducing the search space
	// before you draw the line , and comment what the method does 
	public void drawLine(Graphics g) {
		float xMin = Math.min(Start.x, End.x);
		float xMax = Math.max(Start.x, End.x);
		float yMin = Math.min(Start.y, End.y);
		float yMax = Math.max(Start.y, End.y);

		for (float x = xMin; x <= xMax; x++) {
			for (float y = yMin; y <= yMax; y++) {
				Point3f currentPoint = new Point3f(x, y, 0);
				if (Distance(currentPoint, Start, End) <= 1) { // Check if the point is within 1 unit of the line
					setPixel(g, x, y);
				}
			}
		}
	}

	 
	//implement Distance formulas using your notes , and comment what the method does
	public float Distance(Point3f Check, Point3f Beginning, Point3f End) {
		Vector3f BA = new Vector3f(End.x - Beginning.x, End.y - Beginning.y, 0);  // Vector from Beginning to End
		Vector3f BC = new Vector3f(Check.x - Beginning.x, Check.y - Beginning.y, 0);  // Vector from Beginning to Check

		// Cross product to find the area of the parallelogram and divide by length of BA to find height
		Vector3f crossProduct = BA.cross(BC);
		return Math.abs(crossProduct.z) / BA.length();  // Only interested in the magnitude of the z-component for 2D

	}

	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, float x, float y) {
		Color pixelColour = new Color(0, 0, 0);
		g.setColor(pixelColour);
		g.drawRect((int) (x + 500), (int) (500 - y), 1, 1); // + 500 offset is to make the centre 0,0 at centre of the screen

	}

}
