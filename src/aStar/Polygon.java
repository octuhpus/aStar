package aStar;

import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

class Polygons extends JPanel {
	
	
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );

		//rectangle
		int xValues[] = { 50, 50, 250, 250}; 
		int yValues[] = { 400, 300, 300, 400}; 
		Polygon rectangle = new Polygon( xValues, yValues, 4 );
		g.drawPolygon( rectangle ); 
		
		//pentagon
		int xValues2[] = { 10, 90, 140, 100, 30}; 
		int yValues2[] = { 150, 40, 140, 250, 240};
		Polygon pentagon = new Polygon ( xValues2, yValues2, 5 );
		g.drawPolygon( pentagon ); 
		
		//triangle left
		int xValues3[] = { 130, 165, 200 };
		int yValues3[] = {250, 120, 250};
		Polygon triangleLeft = new Polygon ( xValues3, yValues3, 3 );
		g.drawPolygon( triangleLeft ); 
		
		//diamond left
		int xValues4[] = { 200, 200, 260, 300 };
		int yValues4[] = { 140, 40, 20, 60};
		Polygon diamondLeft = new Polygon ( xValues4, yValues4, 4);
		g.drawPolygon(diamondLeft);
		
		//rectangleRight
		int xValues5[] = {320, 420, 420, 320};
		int yValues5[] = {30, 30, 230, 230};
		Polygon rectangleRight = new Polygon ( xValues5, yValues5, 4);
		g.drawPolygon(rectangleRight);
		
		//triangleRight
		int xValues6[] = { 290, 270, 360 };
		int yValues6[] = { 350, 220, 300 };
		Polygon triangleRight = new Polygon ( xValues6, yValues6, 3 );
		g.drawPolygon( triangleRight ); 
		
		int xValues7[] = { 400, 450, 500, 501, 450, 400 };
		int yValues7[] = { 300, 260, 300, 350, 400, 350 };
		Polygon hexagon = new Polygon ( xValues7, yValues7, 6);
		g.drawPolygon(hexagon);
		
		//diamondRight
		int xValues8[] = { 490, 430, 480, 520};
		int yValues8[] = {240, 30, 10, 40};
		Polygon diamondRight = new Polygon (xValues8, yValues8, 4);
		g.drawPolygon(diamondRight);
		
	}
}