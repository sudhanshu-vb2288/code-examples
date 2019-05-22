package hackerrank;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import hackerrank.BFS.Node;

public class BFS {

		private static int EDGE_DISTANCE = 1;
		public static class Node {
			int x, y, value, dist;
			Node(int x,int y,int value,int dist){
				this.x = x;
				this.y = y;
				this.value = value; 
				this.dist = dist;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] values = { { 1, 1, 1, 1, 1},
						   { 1, 0, 0, 1, 1},
						   { 1, 1, 0, 0, 1},
						   { 1, 9, 1, 9, 1}};
				    
		int row = 4;
		int col = 5;
		int dist = shortestPath(row, col, values);
		System.out.println("Distance = "+dist);
	}
	
	public static int shortestPath(int row, int col, int[][] arr) {
		
		int fillValue = -1;
		int[][] distanceArr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				distanceArr[i][j] = fillValue;
			}
		}
		//Arrays.fill(distanceArr,fillValue);
		
		// Initialize empty queue
		Queue<Node> q = new ArrayDeque<>();
		
		int distance = 0;
		int i,j;
		int flag = 0;
		
		// Set First element into the array
		distanceArr[0][0] = 0;
		q.add(new Node(0,0,arr[0][0],0));
		
		while(!q.isEmpty()) {
			
			// Retrieve value from Queue
			Node node = q.poll();
			System.out.println("("+node.x+","+node.y+") "+node.dist);
			// Got Value 9 in the Node
			if(node.value == 9) {
				distance = node.dist;
				flag = 1;
				break;
			}	
			
			// position of current cell
			i = node.x;
			j = node.y;
			distance = node.dist;
			
			
			// check right node and down node from current position
			// check down node
			if(arrLimit(i+1,j  ,row,col) && distanceArr[i+1][j] == fillValue && arr[i+1][j] != 0) {
				
				q.add(new Node(i+1,j,arr[i+1][j],distance+1));
				distanceArr[i+1][j] = arr[i+1][j];
			}
			// check right node
			if(arrLimit(i  ,j+1,row,col) && distanceArr[i][j+1] == fillValue && arr[i][j+1] != 0) {
				q.add(new Node(i,j+1,arr[i][j+1],distance+1));
				distanceArr[i][j+1] = arr[i][j+1];
			}
			// check up node
			if(arrLimit(i-1,j  ,row,col) && distanceArr[i-1][j] == fillValue && arr[i-1][j] != 0) {
				
				q.add(new Node(i-1,j,arr[i-1][j],distance+1));
				distanceArr[i-1][j] = arr[i-1][j];
			}
			// check left node
			if(arrLimit(i  ,j-1,row,col) && distanceArr[i][j-1] == fillValue && arr[i][j-1] != 0) {
				q.add(new Node(i,j-1,arr[i][j-1],distance+1));
				distanceArr[i][j-1] = arr[i][j-1];
			}
			
		}
		if(flag == 1) return distance;
		else return -1;		
		
	}
	
	// check if coordinate is within array limit
	public static boolean arrLimit(int i, int j, int row, int col) {
		if(i>=0 && j >=0 && i<row && j<col) return true;
		else return false;
	}	
}
