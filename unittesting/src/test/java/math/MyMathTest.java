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
	 * when the MyAdvancedMathTest class is initialized
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
}
