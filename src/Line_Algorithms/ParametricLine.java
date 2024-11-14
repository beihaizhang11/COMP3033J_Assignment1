package Line_Algorithms;

import java.awt.*;

import GraphicsObjects.Point3f;

public class ParametricLine {

	Point3f Start;
	Point3f End;

	public ParametricLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}

	// Implement in Parametric form , and comment what it does 
	public void drawLine(Graphics g) {
		float step = 0.01f; // The step size determines the smoothness and density of the drawn line

		for (float t = 0; t <= 1; t += step) {
			// Calculate the point corresponding to the current t value in parametric form
			float x = (1 - t) * Start.x + t * End.x;
			float y = (1 - t) * Start.y + t * End.y;

			// Draw the current point
			setPixel(g, (int) x, (int) y);
		}
	 
	}

	// I have implemented this method to adapt Swings coordinate system
	public void setPixel(Graphics g, int x, int y) {
		Color pixelColour = new Color(19, 128, 36);
		g.setColor(pixelColour);
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the centre 0,0 at centre of the screen for swing :-)

	}
}
