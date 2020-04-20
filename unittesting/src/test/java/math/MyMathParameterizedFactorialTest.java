package math;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert;
/**
 * An class that provides test cases for the 
 * math operations of the MyMath
 * class, for demonstrating Unit Testing.
 * @author EfthymiaKostaki
 */

@RunWith(Parameterized.class)
public class MyMathParameterizedFactorialTest {
	
	@Parameter (value = 0) 
	public int factorialNumber;
	
	@Parameter (value = 1)
	public int result;
	
	MyMath mm = new MyMath();
	
	/*
	 * The following method generates the input values 
	 * for the tests. 
	 */
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{0,1},{1,1},{2,2},{12,479001600}};
		
		return Arrays.asList(data);
	}
	
	/*
	 * A unit test that is executed for each pair of 
	 * parameters. 
	 */
	@Test
	public void testFactorialWithExtremeCases() {
		Assert.assertEquals(result, mm.factorial(factorialNumber));
	}
}
