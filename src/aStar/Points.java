package aStar;

import java.lang.Math;

import static aStar.Shapes.GOALCOORD;

public class Points {
	public int x;
	public int y; 
	public double goalDistance;
	public Points neighbors[];
	public boolean visited = false; 
	public boolean path = false;
	
	public Points (int x, int y) {
		this.x = x;
		this.y = y;
		this.goalDistance = getGoalDistance();
	}
	
	
	// sqrt( (x2-x1)^2 + (y2 - y1)^2)
	public double getGoalDistance() {
		return Math.sqrt(Math.pow(GOALCOORD[0] - this.x, 2.0) + Math.pow(GOALCOORD[1] - this.y, 2.0));
	}
	
	
	// sqrt( (x2-x1)^2 + (y2 - y1)^2)
	public double distanceTo (Points p) {
		return Math.sqrt( Math.pow(p.x - this.x, 2.0) + Math.pow(p.y - this.y, 2.0) );
	}
	
	public void setNeighbors(Points p[]) {
		this.neighbors = p;
	}
	
	public double totalCost(double costSoFar) {
		return costSoFar + goalDistance;
	}
}
