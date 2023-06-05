package aStar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Line extends JFrame {
	
	Points lastPoint;
	Points curPoint;
	
	BufferedImage buffer;
	
	public Line () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(550, 450);
		setVisible(true);
		buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
	}
	
	@Override
	public void paint(Graphics g) {
		// draw the contents of the buffer onto the screen
		g.setColor(Color.white);		//paints background.
		g.fillRect(0, 0, getWidth(), getHeight());		//fills frame so that the old painting appears to go away
		g.drawImage(buffer, 0, 0, null);
	}
	
	public void drawLine(Points lastPoint, Points curPoint) {
		this.lastPoint = lastPoint;
		this.curPoint = curPoint;
		// draw the line onto the buffer
		Graphics g = buffer.getGraphics();
		g.setColor(Color.RED);
		g.drawLine(lastPoint.x, lastPoint.y, curPoint.x, curPoint.y);
		repaint(); // tell the JFrame to repaint itself
	}
	
	public void drawPolygon(/* arguments for polygon drawing */) {
		// similar to drawLine, draw the polygon onto the buffer
		//rectangle
		
		Graphics g = buffer.getGraphics();
		
		g.setColor(Color.BLACK);
		int xValues[] = { 50, 50, 250, 250}; 
		int yValues[] = { 400+20, 300+20, 300+20, 400+20}; 
		Polygon rectangle = new Polygon( xValues, yValues, 4 );
		g.drawPolygon( rectangle ); 
				
		//pentagon
		int xValues2[] = { 10, 90, 140, 100, 30}; 
		int yValues2[] = { 150+20, 40+20, 140+20, 250+20, 240+20};
		Polygon pentagon = new Polygon ( xValues2, yValues2, 5 );
		g.drawPolygon( pentagon ); 
				
		//triangle left
		int xValues3[] = { 130, 165, 200 };
		int yValues3[] = {250+20, 120+20, 250+20};
		Polygon triangleLeft = new Polygon ( xValues3, yValues3, 3 );
		g.drawPolygon( triangleLeft ); 
				
		//diamond left
		int xValues4[] = { 200, 200, 260, 300 };
		int yValues4[] = { 140+20, 40+20, 20+20, 60+20};
		Polygon diamondLeft = new Polygon ( xValues4, yValues4, 4);
		g.drawPolygon(diamondLeft);
				
		//rectangleRight
		int xValues5[] = {320, 420, 420, 320};
		int yValues5[] = {30+20, 30+20, 230+20, 230+20};
		Polygon rectangleRight = new Polygon ( xValues5, yValues5, 4);
		g.drawPolygon(rectangleRight);
				
		//triangleRight
		int xValues6[] = { 290, 270, 360 };
		int yValues6[] = { 350+20, 220+20, 300+20 };
		Polygon triangleRight = new Polygon ( xValues6, yValues6, 3 );
		g.drawPolygon( triangleRight ); 
				
		int xValues7[] = { 400, 450, 500, 501, 450, 400 };
		int yValues7[] = { 300+20, 260+20, 300+20, 350+20, 400+20, 350+20 };
		Polygon hexagon = new Polygon ( xValues7, yValues7, 6);
		g.drawPolygon(hexagon);
				
		//diamondRight
		int xValues8[] = { 490, 430, 480, 520};
		int yValues8[] = {240+20, 30+20, 10+20, 40+20};
		Polygon diamondRight = new Polygon (xValues8, yValues8, 4);
		g.drawPolygon(diamondRight);
		repaint();
	}
}
