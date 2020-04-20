package math;

/**
 * A class that provides methods for the math operations. Specifically this
 * class includes a method for calculating the factorial of a number.
 * 
 * @author EfthymiaKostaki
 */
public class MyMath {
	
	/**
	 * Returns the factorial of a given number
	 * @param the number whose factorial we want to calculate
	 * @return the factorial of the given number
	 */
	public int factorial(int n) {
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException("n cannot be less than 0 or greater than 20");
		} else if (n == 1) {
			return n;
		} else if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	/**
	 * Returns if a given number is prime or not
	 * @param the number whom we want to determine 
	 * if it is a prime number or not
	 * @return the factorial of the given number
	 */
	public boolean isPrime(int n) {
		if (n <= 2) {
			throw new IllegalArgumentException("Number must be grater than 2.");
		} else {
			boolean isPrime = true;
			for(int divisor = 2; divisor <= n / 2; divisor++) {
			    if (n % divisor == 0) {
			        isPrime = false;
			        break; // num is not a prime, no reason to continue checking
			    }
			}
			return isPrime;
		}
	}
}
