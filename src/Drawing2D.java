import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GraphicsObjects.Point3f;
import Line_Algorithms.ExplicitLine;
import Line_Algorithms.ImplicitLine;
import Line_Algorithms.ParametricLine;
import Triangle_Algorithms.ParametricTriangle;

/*
 * 
 * This class to test your work and for you to make lines to draw your house , it will not compile till all the methods are complete in the other classes 
 * 
 */
public class Drawing2D extends JPanel {

	public Drawing2D() // set up graphics window
	{
		setBackground(Color.WHITE);

	}

	public void paintComponent(Graphics g) // draw graphics in the panel
	{
		int width = getWidth(); // width of window in pixels
		int height = getHeight(); // height of window in pixels

		// as swing starts at 0 , 0 , will need to modify drawing

		super.paintComponent(g); // call superclass to make panel display
									// correctly

		g.setColor(Color.BLACK);
		
		//line test code 
		
		/*ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		
		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);*/
		
		// Remove the comments for Explicit line and test it ,

		/*ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ExplicitLine SecondLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
		ExplicitLine ThirdLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ExplicitLine FourthLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);*/
		//

		// Remove the comments for Implicit line and test it

		/*ImplicitLine FirstLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
		ImplicitLine ThirdLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ImplicitLine FourthLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);*/
		// Remove the comments for Parametric line and test it

		/*ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ParametricLine FourthLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);*/
		// */

		// Remove the comments for an example of square using Parametric lines

		/*ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(0, 300, 0));
		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 300, 0), new Point3f(300, 300, 0));
		ParametricLine ThirdLine = new ParametricLine(new Point3f(300, 300, 0), new Point3f(300, 0, 0));
		ParametricLine FourthLine = new ParametricLine(new Point3f(300, 0, 0), new Point3f(0, 0, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);*/
		// */

		/*ParametricTriangle MyFirstTriangle = new ParametricTriangle(new Point3f(200, 0, 0), new Point3f(400,200, 0),
				new Point3f(200, 370, 0));

		 MyFirstTriangle.drawTriangle(g)*/;// */
		
		//insert your house drawings  here

		// Draw house background
		ParametricTriangle leftBackground = new ParametricTriangle(
				new Point3f(100, 100, 0),
				new Point3f(100, 200, 0),
				new Point3f(300, 100, 0),
				Color.CYAN
		);
		ParametricTriangle rightBackground = new ParametricTriangle(
				new Point3f(300, 200, 0),
				new Point3f(100, 200, 0),
				new Point3f(300, 100, 0),
				Color.CYAN
		);
		leftBackground.drawTriangle(g);
		rightBackground.drawTriangle(g);

		// Draw door background
		ParametricTriangle rightDoorBackground = new ParametricTriangle(
				new Point3f(180, 100, 0),
				new Point3f(180, 150, 0),
				new Point3f(220, 100, 0),
				Color.LIGHT_GRAY
		);
		ParametricTriangle leftDoorBackground = new ParametricTriangle(
				new Point3f(220, 150, 0),
				new Point3f(180, 150, 0),
				new Point3f(220, 100, 0),
				Color.LIGHT_GRAY
		);
		rightDoorBackground.drawTriangle(g);
		leftDoorBackground.drawTriangle(g);

		// Draw house wall
		ImplicitLine bottom = new ImplicitLine(new Point3f(100, 100, 0), new Point3f(300, 100, 0));
		ImplicitLine leftSide = new ImplicitLine(new Point3f(100, 100, 0), new Point3f(100, 200, 0));
		ImplicitLine rightSide = new ImplicitLine(new Point3f(300, 100, 0), new Point3f(300, 200, 0));
		bottom.drawLine(g);
		leftSide.drawLine(g);
		rightSide.drawLine(g);

		// Draw door
		ImplicitLine doorBottom = new ImplicitLine(new Point3f(180, 100, 0), new Point3f(220, 100, 0));
		ImplicitLine doorTop = new ImplicitLine(new Point3f(180, 150, 0), new Point3f(220, 150, 0));
		ImplicitLine doorLeft = new ImplicitLine(new Point3f(180, 100, 0), new Point3f(180, 150, 0));
		ImplicitLine doorRight = new ImplicitLine(new Point3f(220, 100, 0), new Point3f(220, 150, 0));
		doorBottom.drawLine(g);
		doorTop.drawLine(g);
		doorLeft.drawLine(g);
		doorRight.drawLine(g);

		// Draw windows
		drawWindow(g, 120, 120);
		drawWindow(g, 240, 120);

		// Draw grass
		drawGrass(g, 0, 100);
		drawGrass(g, 50, 100);
		drawGrass(g, -50, 100);
		drawGrass(g, -100, 100);

		// Draw land
		ImplicitLine land = new ImplicitLine(new Point3f(-300, 100, 0), new Point3f(800, 100, 0));
		land.drawLine(g);

		// Draw tree
		ParametricLine treeLeft = new ParametricLine(new Point3f(400, 100, 0), new Point3f(400, 250, 0));
		ParametricLine treeRight = new ParametricLine(new Point3f(430, 100, 0), new Point3f(430, 250, 0));
		treeLeft.drawLine(g);
		treeRight.drawLine(g);
		drawGrass(g, 390, 200);
		drawGrass(g, 380, 210);
		drawGrass(g, 370, 220);
		drawGrass(g, 360, 230);
		drawGrass(g, 350, 240);
		drawGrass(g, 360, 250);
		drawGrass(g, 370, 260);
		drawGrass(g, 380, 270);
		drawGrass(g, 390, 280);

		drawGrass(g, 410, 200);
		drawGrass(g, 420, 210);
		drawGrass(g, 430, 220);
		drawGrass(g, 440, 230);
		drawGrass(g, 450, 240);
		drawGrass(g, 440, 250);
		drawGrass(g, 430, 260);
		drawGrass(g, 420, 270);
		drawGrass(g, 410, 280);

		// Draw window bone
		drawWindowBone(g, 120, 120);
		drawWindowBone(g, 240, 120);

		// Draw doorhandles
		ImplicitLine doorHandleUp = new ImplicitLine(new Point3f(185, 125, 0), new Point3f(188, 125, 0));
		ImplicitLine doorHandleRight = new ImplicitLine(new Point3f(188, 125, 0), new Point3f(188, 122, 0));
		ImplicitLine doorHandleDown = new ImplicitLine(new Point3f(188, 122, 0), new Point3f(185, 122, 0));
		ImplicitLine doorHandleLeft = new ImplicitLine(new Point3f(185, 122, 0), new Point3f(185, 125, 0));
		doorHandleUp.drawLine(g);
		doorHandleRight.drawLine(g);
		doorHandleDown.drawLine(g);
		doorHandleLeft.drawLine(g);

		// Draw sun
		drawSun(g, 50, 400, 40, 12);

		// Draw chimney
		ParametricTriangle leftChimney = new ParametricTriangle(
				new Point3f(140, 200, 0),
				new Point3f(140, 270, 0),
				new Point3f(160, 270, 0),
				Color.BLACK
		);
		ParametricTriangle rightChimney = new ParametricTriangle(
				new Point3f(140, 200, 0),
				new Point3f(160, 200, 0),
				new Point3f(160, 270, 0),
				Color.BLACK
		);
		leftChimney.drawTriangle(g);
		rightChimney.drawTriangle(g);

		// Draw smoke
		drawSmoke(g, 170, 280);
		drawSmoke(g, 200, 310);
		drawSmoke(g, 230, 330);
		drawSmoke(g, 260, 340);
		drawSmoke(g, 290, 340);

		// Draw roof using two flipped triangles
		ParametricTriangle leftRoof = new ParametricTriangle(
				new Point3f(200, 250, 0),
				new Point3f(200, 200, 0),
				new Point3f(100, 200, 0),
				Color.CYAN
		);
		ParametricTriangle rightRoof = new ParametricTriangle(
				new Point3f(200, 250, 0),
				new Point3f(200, 200, 0),
				new Point3f(300, 200, 0),
				Color.CYAN
		);
		leftRoof.drawTriangle(g);
		rightRoof.drawTriangle(g);

		// Draw roof's line
		ImplicitLine leftRoofLine = new ImplicitLine(new Point3f(100, 200, 0), new Point3f(200, 250, 0));
		leftRoofLine.drawLine(g);

		ImplicitLine rightRoofLine = new ImplicitLine(new Point3f(300, 200, 0), new Point3f(200, 250, 0));
		rightRoofLine.drawLine(g);

		ImplicitLine bottomRoofLine = new ImplicitLine(new Point3f(300, 200, 0), new Point3f(100, 200, 0));
		bottomRoofLine.drawLine(g);
	}
	public void drawWindowBone(Graphics g, int x, int y){
		ExplicitLine a = new ExplicitLine(new Point3f(x, y+20, 0), new Point3f(x+40, y+20, 0));
		ExplicitLine b = new ExplicitLine(new Point3f(x+20, y, 0), new Point3f(x+20, y+40, 0));
		a.drawLine(g);
		b.drawLine(g);
	}
	public void drawGrass(Graphics g, int x, int y){
		int size = 10;
		ParametricLine a = new ParametricLine(new Point3f(x, y, 0), new Point3f(x-2*size, y+2*size, 0));
		ParametricLine b = new ParametricLine(new Point3f(x-2*size, y+2*size, 0), new Point3f(x, y+size, 0));
		ParametricLine c = new ParametricLine(new Point3f(x, y+size, 0), new Point3f(x-size, y+3*size, 0));
		ParametricLine d = new ParametricLine(new Point3f(x-size, y+3*size, 0), new Point3f(x+size, y+size, 0));
		ParametricLine e = new ParametricLine(new Point3f(x+size, y+size, 0), new Point3f(x+2*size, y+3*size, 0));
		ParametricLine f = new ParametricLine(new Point3f(x+2*size, y+3*size, 0), new Point3f(x+2*size, y+size, 0));
		ParametricLine g1 = new ParametricLine(new Point3f(x+2*size, y+size, 0), new Point3f(x+3*size, y+2*size, 0));
		ParametricLine h = new ParametricLine(new Point3f(x+3*size, y+2*size, 0), new Point3f(x+2*size, y, 0));
		ParametricLine i = new ParametricLine(new Point3f(x+2*size, y, 0), new Point3f(x, y, 0));

		a.drawLine(g);
		b.drawLine(g);
		c.drawLine(g);
		d.drawLine(g);
		e.drawLine(g);
		f.drawLine(g);
		g1.drawLine(g);
		h.drawLine(g);
		i.drawLine(g);
	}
	public void drawWindow(Graphics g, int x, int y) {
		int width = 40;
		int height = 40;
		double angle = Math.toRadians(90); // Convert 45 degrees to radians

		// Center of the window
		int centerX = x + width / 2;
		int centerY = y + height / 2;

		// Rotate each point around the center
		Point3f[] originalPoints = {
				new Point3f(x, y, 0), // Bottom left
				new Point3f(x + width, y, 0), // Bottom right
				new Point3f(x, y + height, 0), // Top left
				new Point3f(x + width, y + height, 0) // Top right
		};

		Point3f[] rotatedPoints = new Point3f[originalPoints.length];
		for (int i = 0; i < originalPoints.length; i++) {
			rotatedPoints[i] = rotatePoint(originalPoints[i], centerX, centerY, angle);
		}

		// Create two triangles from rotated points
		ParametricTriangle upperHalf = new ParametricTriangle(
				rotatedPoints[0], // Rotated bottom left
				rotatedPoints[1], // Rotated bottom right
				rotatedPoints[3]  // Rotated top right
		);

		ParametricTriangle lowerHalf = new ParametricTriangle(
				rotatedPoints[0], // Rotated bottom left
				rotatedPoints[2], // Rotated top left
				rotatedPoints[3]  // Rotated top right
		);

		upperHalf.drawTriangle(g);
		lowerHalf.drawTriangle(g);
	}
	public void drawSun(Graphics g, int centerX, int centerY, int sideLength, int numRays) {
		// Draw the rays of the sun
		double angleIncrement = 2 * Math.PI / numRays;
		for (int i = 0; i < numRays; i++) {
			double angle = i * angleIncrement;
			int endX = (int) (centerX + Math.cos(angle) * sideLength * 2);
			int endY = (int) (centerY + Math.sin(angle) * sideLength * 2);
			ExplicitLine sunRay = new ExplicitLine(new Point3f(centerX, centerY, 0), new Point3f(endX, endY, 0), Color.RED);
			sunRay.drawLine(g);
		}

		// Draw the sun
		ParametricTriangle leftsun = new ParametricTriangle(
				new Point3f(30, 380, 0),
				new Point3f(30, 420, 0),
				new Point3f(70, 420, 0),
				Color.RED
		);
		leftsun.drawTriangle(g);

		ParametricTriangle rightsun = new ParametricTriangle(
				new Point3f(30, 380, 0),
				new Point3f(70, 420, 0),
				new Point3f(70, 380, 0),
				Color.RED
		);
		rightsun.drawTriangle(g);
	}
	public void drawSmoke(Graphics g, int x, int y) {
		int size = 15;
		ParametricTriangle leftSmoke = new ParametricTriangle(
				new Point3f(x, y, 0),
				new Point3f(x, y + size, 0),
				new Point3f(x + size, y, 0),
				Color.GRAY
		);
		ParametricTriangle rightSmoke = new ParametricTriangle(
				new Point3f(x + size, y + size, 0),
				new Point3f(x, y + size, 0),
				new Point3f(x + size, y, 0),
				Color.GRAY
		);
		leftSmoke.drawTriangle(g);
		rightSmoke.drawTriangle(g);
	}

	// Helper method to rotate a point around the center
	private Point3f rotatePoint(Point3f point, int centerX, int centerY, double angle) {
		float dx = point.x - centerX;
		float dy = point.y - centerY;
		float rotatedX = (float)(dx * Math.cos(angle) - dy * Math.sin(angle)) + centerX;
		float rotatedY = (float)(dx * Math.sin(angle) + dy * Math.cos(angle)) + centerY;
		return new Point3f(rotatedX, rotatedY, point.z);
	}




	public static void main(String[] args) {
		Drawing2D panel = new Drawing2D();
		JFrame ScreenToDrawOn = new JFrame();
		ScreenToDrawOn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScreenToDrawOn.setTitle("2D Drawing Application");
		ScreenToDrawOn.setSize(1000, 1000); // window is 500 pixels wide, 400
											// high
		ScreenToDrawOn.setVisible(true);
		ScreenToDrawOn.add(panel);

	}

}
