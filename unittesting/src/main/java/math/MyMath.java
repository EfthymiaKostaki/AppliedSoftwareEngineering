package math;

/**
 * An class that provides methods for the 
 * math operations. Specifically this class includes a method 
 * for calculating the factorial of a number.
 * @author EfthymiaKostaki
 */
public class MyMath {
 
	public int factorial(int n) {
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException("n cannot be less than 0 or greater than 20");
		} else if (n == 1){
		    return n;
		} else if (n == 0){
			return 1;
		} else {	
			return n * factorial(n-1);
		}
	}
}
