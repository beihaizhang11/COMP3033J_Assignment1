package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ExplicitLine {

	Point3f Start;
	Point3f End;
	float slope;
	Color color;

	public ExplicitLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;
		this.color = Color.WHITE; // Default color (Used in drawing window bone)
		slope = getSlope(); // you need to implement this before the class will compile
	}

	/**
	 * Constructor for ExplicitLine that allows specifying the color of the line.
	 * @param Start The starting point of the line.
	 * @param End The ending point of the line.
	 * @param color The color of the line.
	 */
	public ExplicitLine(Point3f Start, Point3f End, Color color) {
		this.Start = Start;
		this.End = End;
		this.color = color;
		slope = getSlope();
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Implement and comment what the method does
	// Calculate the slope of a line segment
	public float getSlope() {
		return (End.y - Start.y) / (End.x - Start.x); // Return the result of the slope calculation

	}

	// Implement in Explicit form, and comment what the method does
	public void drawLine(Graphics g) {
		g.setColor(color);
		float dx = Math.abs(End.x - Start.x);
		float dy = Math.abs(End.y - Start.y);
		float step = dx > dy ? dx : dy; // Choose the larger difference as the step size reference to ensure linear smoothness

		float xIncrement = (End.x - Start.x) / step;
		float yIncrement = (End.y - Start.y) / step;

		float x = Start.x;
		float y = Start.y;

		// Iterate based on the step size, drawing point by point
		for (int i = 0; i <= step; i++) {
			setPixel(g, Math.round(x), Math.round(y)); // Draw a pixel, rounding the coordinates to the nearest integer
			x += xIncrement; // Increment along the horizontal or vertical axis
			y += yIncrement;
		}
	}

	// I have implemented this method to adapt Swing's coordinate system
	public void setPixel(Graphics g, int x, int y) {
		g.setColor(color);
		g.drawRect(x + 500, 500 - y, 1, 1);  // + 500 offset is to make the centre 0,0 at centre of the screen
	}
}
