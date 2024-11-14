package Triangle_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

public class ParametricTriangle {

	Point3f A;
	Point3f B;
	Point3f C;
	Color color;

	public ParametricTriangle(Point3f a, Point3f b, Point3f c) {
		A = a;
		B = b;
		C = c;
		color = Color.BLACK; // Default color (Used for drawing roof & window)
	}

	/**
	 * Constructor for ParametricTriangleColor that allows specifying the color of the triangle.
	 * @param a The first vertex of the triangle.
	 * @param b The second vertex of the triangle.
	 * @param c The third vertex of the triangle.
	 * @param color The color of the triangle.
	 */
	public ParametricTriangle(Point3f a, Point3f b, Point3f c, Color color) {
		A = a;
		B = b;
		C = c;
		this.color = color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Implement in Parametric form, and comment what it does
	public void drawTriangle(Graphics g) {
		g.setColor(color);
		int minX = (int) Math.min(A.x, Math.min(B.x, C.x));
		int maxX = (int) Math.max(A.x, Math.max(B.x, C.x));
		int minY = (int) Math.min(A.y, Math.min(B.y, C.y));
		int maxY = (int) Math.max(A.y, Math.max(B.y, C.y));

		for (int x = minX; x <= maxX; x++) {
			for (int y = minY; y <= maxY; y++) {
				Point3f P = new Point3f(x, y, 0);
				if (isInsideTriangle(P)) {  // Method checks using barycentric coordinates
					setPixel(g, x, y, color.getRed(), color.getGreen(), color.getBlue());  // Fill the triangle with the specified color
				}
			}
		}
	}

	private boolean isInsideTriangle(Point3f P) {
		float totalArea = area(A, B, C);
		float alpha = area(P, B, C) / totalArea;
		float beta = area(A, P, C) / totalArea;
		float gamma = area(A, B, P) / totalArea;
		return (alpha >= 0 && alpha <= 1 && beta >= 0 && beta <= 1 && gamma >= 0 && gamma <= 1 && (alpha + beta + gamma) == 1);
	}

	private float area(Point3f p1, Point3f p2, Point3f p3) {
		return Math.abs((p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0f);
	}

	// I have implemented this method to adapt Swing's coordinate system
	public void setPixel(Graphics g, int x, int y, float R, float G, float B) {
		Color pixelColour = new Color((int) R, (int) G, (int) B);
		g.setColor(pixelColour);
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the center 0,0 at the center of the screen
	}

	// Implement the distance, you may use your previous Distance formulas and comment what it does
	public float Distance(Point3f Check, Point3f Beginning, Point3f End) {
		Vector3f BA = new Vector3f(End.x - Beginning.x, End.y - Beginning.y, 0);
		Vector3f BC = new Vector3f(Check.x - Beginning.x, Check.y - Beginning.y, 0);

		// Cross product to find area, and length of BA to find the perpendicular distance
		Vector3f cross = BA.cross(BC);
		return Math.abs(cross.z) / BA.length();
	}
}

