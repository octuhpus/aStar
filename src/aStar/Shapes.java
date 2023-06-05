package aStar;

import javax.swing.JFrame;

public class Shapes extends JFrame {
	public static final int STARTCOORD[] = {25, 370};
	public static final int GOALCOORD[] = {540, 40};
	
	
	static Points r1 = new Points (50, 400 +20);
	static Points r2 = new Points (50, 300+20);
	static Points r3 = new Points (250, 300+20);
	static Points r4 = new Points (250, 400+20);
	static Points rectangle[] = {r1, r2, r3, r4};
	
	static Points p1 = new Points (10, 150+20);
	static Points p2 = new Points (90, 40+20);
	static Points p3 = new Points (140, 140+20);
	static Points p4 = new Points (100, 250+20);
	static Points p5 = new Points (30, 240+20);
	static Points pentagon[] = {p1, p2, p3, p4, p5};
	
	static Points tL1 = new Points (130, 250+20);
	static Points tL2 = new Points (165, 120+20);
	static Points tL3 = new Points (200, 250+20);
	static Points triangleLeft[] = {tL1, tL2, tL3};
	
	static Points dL1 = new Points (200, 140+20);
	static Points dL2 = new Points (200, 40+20);
	static Points dL3 = new Points (260, 20+20);
	static Points dL4 = new Points (300, 60+20);
	static Points diamondLeft[] = {dL1, dL2, dL3, dL4};
	
	static Points rR1 = new Points (320, 30+20);
	static Points rR2 = new Points (420, 30+20);
	static Points rR3 = new Points (420, 230+20);
	static Points rR4 = new Points (320, 230+20);
	static Points rectangleRight[] = {rR1, rR2, rR3, rR4};
	
	static Points tR1 = new Points (290, 350+20);
	static Points tR2 = new Points (270, 220+20);
	static Points tR3 = new Points (360, 300+20);
	static Points triangleRight[] = {tR1, tR2, tR3};
	
	static Points h1 = new Points (400, 300+20);
	static Points h2 = new Points (450, 260+20);
	static Points h3 = new Points (500, 300+20);
	static Points h4 = new Points (501, 300+20);
	static Points h5 = new Points (450, 400+20);
	static Points h6 = new Points (400, 350+20);
	static Points hexagon[] = {h1, h2, h3, h4, h5, h6};
	
	static Points dR1 = new Points (490, 240+20);
	static Points dR2 = new Points (430, 30+20);
	static Points dR3 = new Points (480, 10+20);
	static Points dR4 = new Points (520, 40+20);
	static Points diamondRight[] = {dR1, dR2, dR3, dR4};
	
	static Points start = new Points (STARTCOORD[0], STARTCOORD[1]);
	static Points goal = new Points (GOALCOORD[0], GOALCOORD[1]);
	
	///////////////////////////////////////////////////////////
	
	static Points startNeigh[] = {r1, r2, p1, p5};
	
	static Points r1Neigh[] = {r2, r4, p5, p1};
	static Points r2Neigh[] = {r3, r1, p5, p4, tL1, tL2};
	static Points r3Neigh[] = {r2, r4, p5, p4, tL1, tL3, tR2, tR1, dL1};
	static Points r4Neigh[] = {r1, r3, tR1, tR3, tR2, h1, h6, h5};
	
	static Points p1Neigh[] = {p2, p5, r1};
	static Points p2Neigh[] = {p3, p1, tL2, dL1, dL2, dL3};
	static Points p3Neigh[] = {p2, p4, tL2, tL1, dL2};
	static Points p4Neigh[] = {p5, p3, tL2, tL1, r2, r3};
	static Points p5Neigh[] = {p1, p4, r2, r1, r3};
	
	static Points tL1Neigh[] = {tL2, tL3, p4, p3, r2, r3};
	static Points tL2Neigh[] = {tL1, tL3, p3, p2, dL1, dL2, tR2, tR1, rR4};
	static Points tL3Neigh[] = {tL2, tL1, tR2, tR1, dL1, r2, r3};
	
	static Points dL1Neigh[] = {dL2, dL4, tL2, tL3, tR2, rR4, r3, tR1};
	static Points dL2Neigh[] = {dL3, dL1, p2, p3, tL2};
	static Points dL3Neigh[] = {dL2, dL4, p2, rR1, rR2, dR3};
	static Points dL4Neigh[] = {dL3, dL1, tL3, tR2, rR1, rR4};
	
	static Points tR1Neigh[] = {r4, r3, h1, h5, h6, tR2, tR3, dL1};
	static Points tR2Neigh[] = {tR1, tR3, tL2, tL3, dL1, dL4, rR1, rR4, r3, h1};
	static Points tR3Neigh[] = {tR1, tR2, h1, h2, rR4, rR3, h6, dR1};
	
	static Points rR1Neigh[] = {rR4, rR2, dL3, dL4, tR2};
	static Points rR2Neigh[] = {rR1, rR3, dR2, dR3, h2};
	static Points rR3Neigh[] = {rR4, rR2, tR3, dR1, dR2, h2, h3};
	static Points rR4Neigh[] = {rR1, rR3, dL4, dL1, tL2, tR2, tR3, h1, h2};
	
	static Points h1Neigh[] = {h2, h6, rR3, rR4, tR1, r4};
	static Points h2Neigh[] = {h1, h3, rR3, rR4, dR2, dR1, rR2, tR3};
	static Points h3Neigh[] = {h2, h4, dR1, dR4};
	static Points h4Neigh[] = {h3, h5, dR4};
	static Points h5Neigh[] = {h6, h4, r4, tR1};
	static Points h6Neigh[] = {h5, h1, tR1, tR3, r4};

	static Points dR1Neigh[] = {dR2, dR4, tR3, rR3, rR2, h2, h3};
	static Points dR2Neigh[] = {dR1, dR3, rR2, rR3, h2};
	static Points dR3Neigh[] = {dR2, dR3, rR2, rR3, dL3, goal};
	static Points dR4Neigh[] = {dR3, dR1, goal};


	///////////////////////////////////////////////////////////
	//start.setNeighbors();
	
	public static Points curPoint;
	public static Points lastPoint;
	
	
	public static void main( String args[] )
	{	
		
		
		double costSoFar = 0;
		//double totalCost = 0;
		double costHolder = 0;
		int j = 0;
		
		Line frame = new Line();
		
		curPoint = start;
		
		PointsQueue pq = new PointsQueue();
		
		storeNeighbors();
		
		while (curPoint != goal) {
			curPoint.visited = true;
			
			for (int i = 0; i < curPoint.neighbors.length; i++) {
				
				//g(n) cost so far to reach n
				costHolder = costSoFar;
				costHolder += curPoint.distanceTo(curPoint.neighbors[i]);
				
				//h(n) cost to reach goal from n
				costHolder += curPoint.neighbors[i].getGoalDistance();
				
				if (curPoint.neighbors[i].visited == false) {
					pq.enqueue(curPoint.neighbors[i], costHolder, curPoint);
				}
				
				System.out.println(i);
			}
			
			
			
			lastPoint = curPoint;
			//costSoFar = pq.getCost();  //store smallest cost from priority queue
			
			curPoint = pq.dequeue();	// load best node into curPoint
			frame.drawLine(lastPoint, curPoint);
			frame.drawPolygon();
			//frame.repaint();
			
			//update();
		}	
		
		System.out.println(lastPoint.x + " " + lastPoint.y);
		
		//frame.drawLine(lastPoint, curPoint);
		//frame.drawPolygon();
		
		System.out.println("finished");
		
		
	}
	
	public Shapes() {
		
	}
	
	public static void storeNeighbors() {
		r1.setNeighbors(r1Neigh);
		r2.setNeighbors(r2Neigh);
		r3.setNeighbors(r3Neigh);
		r4.setNeighbors(r4Neigh);
		
		p1.setNeighbors(p1Neigh);
		p2.setNeighbors(p2Neigh);
		p3.setNeighbors(p3Neigh);
		p4.setNeighbors(p4Neigh);
		p5.setNeighbors(p5Neigh);
		
		tL1.setNeighbors(tL1Neigh);
		tL2.setNeighbors(tL2Neigh);
		tL3.setNeighbors(tL3Neigh);
		
		dL1.setNeighbors(dL1Neigh);
		dL2.setNeighbors(dL2Neigh);
		dL3.setNeighbors(dL3Neigh);
		dL4.setNeighbors(dL4Neigh);
		
		tR1.setNeighbors(tR1Neigh);
		tR2.setNeighbors(tR2Neigh);
		tR3.setNeighbors(tR3Neigh);
		
		rR1.setNeighbors(rR1Neigh);
		rR2.setNeighbors(rR2Neigh);
		rR3.setNeighbors(rR3Neigh);
		rR4.setNeighbors(rR4Neigh);
		
		h1.setNeighbors(h1Neigh);
		h2.setNeighbors(h2Neigh);
		h3.setNeighbors(h3Neigh);
		h4.setNeighbors(h4Neigh);
		h5.setNeighbors(h5Neigh);
		h6.setNeighbors(h6Neigh);
		
		dR1.setNeighbors(dR1Neigh);
		dR2.setNeighbors(dR2Neigh);
		dR3.setNeighbors(dR3Neigh);
		dR4.setNeighbors(dR4Neigh);
		
		start.setNeighbors(startNeigh);
	}
	
}
