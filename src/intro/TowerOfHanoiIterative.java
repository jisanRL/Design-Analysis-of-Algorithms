package intro;

import java.util.Stack;

public class TowerOfHanoiIterative {
	static int numberOfDisks;
	
	// disk that will move in step i
	public static int disk(int i) {
		int j, z = i+1;
		for (j = 0; z%2 == 0; j++) {
			z /= 2;
		}
		return j;
	}
	// how many times disk d is moved before stage i 
	public static int movements(int i, int d) {
		return ((i >> d) + 1) >> 1;
		
	}
	// disk d always moves in the same direction
	// clockwise=1, counterclockwise=2
	public static int direction(int d) {
		return 2 - (numberOfDisks+d)%2;
	}

	public static void out(int d, int source, int dest) {
		System.out.println("Moving disk  " + d + " from tower " + source + " to tower " + dest);
	}
	
	public static void main(String[] args) {
		numberOfDisks = 3;
		int limit = (1<< numberOfDisks)-1;		// number of iterations = 2^n - 1
		
		for (int i = 0; i < limit; i++) {
			int d = disk(i);
			int source = (movements(i, d) * direction(d)%3);		// tower it is currently in 
			int dest = (source + direction(d))%3; 					// tower to move it to
			out(d, source, dest);
		}
	}
}
