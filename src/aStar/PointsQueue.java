package aStar;

import java.util.*;

public class PointsQueue {

    private TreeSet<PointNode> queue;


    private class PointNode implements Comparable<PointNode> {
        private Points point;
        private double value;
        private PointNode parent;
        private boolean visited;

        public PointNode(Points point, double value) {
            this.point = point;
            this.value = value;
        }

        public Points getPoint() {
            return point;
        }

        public double getValue() {
            return value;
        }
        
        public void setParent(Points p) {
        	this.parent = new PointNode (p, -1);
        }
        
        public boolean visited() {
        	if (visited) {
        		return true;
        	} else {
        		return false;
        	}
        }
        
        public void visit() {
        	visited = true;
        }

        @Override
        public int compareTo(PointNode other) {
            return Double.compare(this.value, other.value);
        }
        
        public PointNode getParent() {
        	return parent;
        }
    }

    public PointsQueue() {
        queue = new TreeSet<>();
    }

    public void enqueue(Points point, double value, Points parent) {
        PointNode node = new PointNode(point, value);
        node.setParent(parent);
        queue.add(node);
    }

    public Points dequeue() {
        PointNode node = queue.pollFirst();
        node.visit();
        return node.getPoint();
    }

    public Points peek() {
        PointNode node = queue.first();
        return node.getPoint();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public double getCost() {
    	PointNode node = queue.first();
    	return node.getValue();
    }

}
