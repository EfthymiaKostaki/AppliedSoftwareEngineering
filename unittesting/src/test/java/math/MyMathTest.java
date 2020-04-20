package math;

import org.junit.Test;
import org.junit.Assert;

public class MyMathTest {

	/* 
	 * A reference to the MyMath class
	 * whose methods we are testing in this class
	 */
	MyMath mm ;
	
	/*
	 * This is a constructor which is called 
	 * when the MyMathTest class is initialized
	 */
	public MyMathTest() {
		this.mm = new MyMath();
	}
	
	/*
	 * A unit test that checks an invalid negative input
	 * that causes an IllegalArgumentException
	 */
    @Test (expected = IllegalArgumentException.class)
    public void testNegativeFactorialShouldCauseAnException() {
    	mm.factorial(-1);
    }  
    
    /*
	 * A unit test that checks an invalid positive input
	 * that causes an IllegalArgumentException
	 */
    @Test (expected = IllegalArgumentException.class)
    public void testPositiveFactorialGreaterThan12ShouldCauseAnException() {
    	mm.factorial(13);
    }
    
    /*
	 * A unit test that checks an invalid input
	 * that causes an IllegalArgumentException
	 */
    @Test (expected = IllegalArgumentException.class)
    public void testNumberLessThanTwoShouldCauseAnException() {
    	mm.isPrime(-1);
    }  
    
    /*
	 * A unit test that checks a valid input
	 * which is a prime number
	 */
    @Test
    public void testIsPrimeNumber() {
    	boolean expected = true;
    	Assert.assertEquals(expected, mm.isPrime(97));
    }  
    
    /*
	 * A unit test that checks an invalid input
	 * which is not a prime number
	 */
    @Test
    public void testIsNotPrimeNumber() {
    	boolean expected = false;
    	Assert.assertEquals(expected, mm.isPrime(14));
    }  
}
