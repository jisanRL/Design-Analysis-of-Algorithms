package Recusion;

/*
 * Exponent -> exponent refers to the number of times a number is multiplied by itself
 * 			eg. factorial, power, exponential (e^x)
 * Recurisve algorithm
 */
public class Exponention {
	
	/**
	 * factorial 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		if (n <= 1) {
			return n;
		} else {
			return n * factorial(n-1);
		}
	}
	
	/**
	 * power  a^b
	 * @param n
	 * @return
	 */
	public static int power(int p, int n) {
		if (n <= 1) {
			return n;
		} else {
			return p * power(p, n-1);
		}	
	}
	
	/**
	 * exponential with taylors law (Taylor: e^x = 1 + x + x2/2! + x3/3! )
	 * @param p
	 * @param n
	 * @return
	 */
	public static int exponential(int p, int n) {
		if (n <= 1) {
			return n;
		} else {
			return exponential(p, n-1) + (power(p, n)/factorial(n));
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Factorial = "+ i + " " + factorial(i));
		}
		System.out.println("===================================================");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("Power = "+ i + " " + power(i, j));
			}
		}
		System.out.println("===================================================");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("Exponential = "+ i + " " + exponential(i, j));
			}
		}
	}

}
