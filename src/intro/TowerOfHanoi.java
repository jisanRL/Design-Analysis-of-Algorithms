package intro;

public class TowerOfHanoi {
	
	/*
	 * The Game:
	 * 	3 rods and n disks
	 * 
	 * objective:
	 * 	move the entire stack to another rod, obeying the following simple rules
	 * 		1. Only one disk can be moved at a time.
	 * 		2. Each move consists of taking the upper disk from one of the stacks and placing it 
	 * 		   on top of another stack 
	 * 		   i.e. a disk can only be moved if it is the uppermost disk on a stack.
	 * 		3. No disk may be placed on top of a smaller disk.
	 * 
	 * Approaches:
	 * 	1. Recursive approach O(2^n - 1) [exponential time]
	 * 	2. Iterative approach O(n) [linear time]
	 */

	
	/*
	 * recursive approach
	 * pre-condition: numberofRods <= 0
	 * 
	 */
	public static void recusrsiveTowerOfHanoi(int numberofRods, String start, String target, String auxilary) {
		if (numberofRods == 1) {
			return;
		} else {
			recusrsiveTowerOfHanoi(numberofRods-1, start, target, auxilary);
			System.out.println("Move disk "+ numberofRods + " from rod " + start +" to rod " + target);
		}
		recusrsiveTowerOfHanoi(numberofRods-1, auxilary, target, start );
	}
	
	/*
	 * iterative apporach
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHanoi.recusrsiveTowerOfHanoi(3, "A", "C", "B");
	}

}
