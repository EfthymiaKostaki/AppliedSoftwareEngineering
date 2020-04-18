package math;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * An class that provides test cases for the 
 * math operations of the ArithmeticOperations 
 * class, for demonstrating Unit Testing.
 * @author EfthymiaKostaki
 */
public class ArithmeticOperationsTest {
	ArithmeticOperations am = new ArithmeticOperations(); 
	
	/*
	 * A unit test that checks a valid devision input
	 */
	@Test
    public void testDevideShouldReturnDevidedNumber() {
    	Assert.assertEquals(5.0, am.divide(10,2), 0);
    }
	
	/*
	 * A unit test that checks a valid zero numerator input
	 */
	@Test
    public void testDevideNumeratorZeroShouldReturnDevidedNumber() {
    	Assert.assertEquals(0.0, am.divide(0,2), 0);
    }
	
	/*
	 * A unit test that checks an invalid zero input
	 * that causes an ArithmeticException
	 */
    @Test (expected = ArithmeticException.class)
    public void testDevideShouldCauseAnException() {
    	am.divide(5, 0);
    }  
    
    /*
	 * A unit test that checks a valid input for the method multiply
	 */
	@Test
    public void testMultiplyShouldReturnMultipliedNumber() {
    	Assert.assertEquals(10.0, am.multiply(5,2), 0);
    }
	
	/*
	 * A unit test that checks a valid input of x equals zero
	 * for the method multiply
	 */
	@Test
    public void testMultiplyZeroShouldReturnMultipliedNumber() {
    	Assert.assertEquals(0.0, am.multiply(0,2), 0);
    }
	
	@Rule 
	public ExpectedException thrown = ExpectedException.none();
	
	/*
	 * A test case for the exceptions caused when
	 * X input value is negative. Testing
	 * the exception is performed with a @Rule
	 */
	@Test 
	public void testXMultiplyShouldThrowExceptionOnNegativeInputOfOneOrTwoParameters() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x should be >= 0 and y should be > 0");
		am.multiply(-6, 2);
	}
	
	/*
	 * A test case for the exceptions caused when
	 * Y input value is negative. Testing
	 * the exception is performed with a @Rule
	 */
	@Test 
	public void testYMultiplyShouldThrowExceptionOnNegativeInputOfOneOrTwoParameters() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x should be >= 0 and y should be > 0");
		am.multiply(6, -2);
	}
	
	/*
	 * A test case for the exceptions caused when
	 * Y input value is zero. Testing
	 * the exception is performed with a @Rule
	 */
	@Test 
	public void testYMultiplyShouldThrowExceptionOnZeroInput() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x should be >= 0 and y should be > 0");
		am.multiply(6, 0);
	}
	
	/*
	 * A test case for the exceptions caused when
	 * Y input value is negative. Testing
	 * the exception is performed with a @Rule
	 */
	@Test 
	public void testZeroValuesMultiplyShouldThrowException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x should be >= 0 and y should be > 0");
		am.multiply(0, 0);
	}
	
	/*
	 * A test case for the exceptions caused when
	 * one or more input values are non integers. Testing
	 * the exception is performed with a @Rule
	 */
	
	@Test 
	public void testMultiplyShouldThrowExceptionOnNegativeInputOfOneOrTwoParameter() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The product does not fit in an Integer variable");
		am.multiply(9999999, 99999);
	}
}

