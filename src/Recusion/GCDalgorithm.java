package Recusion;

/*
 * Euclids GCD algorithm
 * 		GCD of two numbers is the largest number that divides both of them. 
 * 		A simple way to find GCD is to factorize both numbers and multiply common prime factors.
 * Recurisve algorithm
 * 
 * Time Complexity -> O(log N)
 */
public class GCDalgorithm {
	
	/**
	 * extended euclidian algo
	 * recusrive solution
	 * @param a
	 * @param b
	 * @return
	 */
	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			return gcd(b%a, a);
		}	
	}
	
	/**
	 * extended euclidian algo
	 * Iterative solution
	 * @param a
	 * @param b
	 * @return
	 */
	public static int gcdI(int a, int b) {
		 while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GCD recursive = " + gcd(10, 15));
		
		System.out.println("GCD Iterative = " + gcdI(10, 15));
	}

}
