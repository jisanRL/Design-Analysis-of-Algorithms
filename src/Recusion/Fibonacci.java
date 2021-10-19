package Recusion;

/*
 * Recurisve algorithm
 * Fibonacci numbers  = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 */
public class Fibonacci {
	
	/**
	 * Recursive method
	 * @param n
	 * @return
	 */
	public static int fibonacciRecusive(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacciRecusive(n-1) + fibonacciRecusive(n-2);
		}
	}
	
	/**
	 * Iterative method
	 * @param n
	 * @return
	 */
	public static int fibonacciIterative(int n) {
		int c = 0;
		int fib = 1;
		
		for (int i = 0; i < n; i++) {
			int tmp = fib;
			fib = fib + c;
			c = tmp;
		}
		return fib;
	}
	
	/**
	 * Dynamic Programming method
	 * @param n
	 * @return
	 */
	public static int fibonacciDynamic(int n) {
		// array to store fibonacci numbers
		int arr[] = new int[n+2];
//		int i;
		
		// oth and 1st number of the series are 0 and 1
		arr[0] = 0;
		arr[1] = 1;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Recursive fibonacci");
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacciRecusive(i));
		}
		
		System.out.println("\nRecursive Iterative");
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacciIterative(i));
		}
		
		System.out.println("\nRecursive Dynamic");
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacciDynamic(i));
		}
		
	}

}
