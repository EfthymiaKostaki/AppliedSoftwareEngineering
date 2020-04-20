package math;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * An class used as a holder of the @RunWith and @Suite 
 * annotations, necessary when someone needs to test only
 * the classes MyMathTest MyMathTest and MyMathParameterizedFactorialTest.
 * @author EfthymiaKostaki
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class, MyMathParameterizedFactorialTest.class})
public class MyMathTestSuite {
	/*
	 * This class remains empty. It's used only as a holder 
	 * of the above annotations.
	 */
}

