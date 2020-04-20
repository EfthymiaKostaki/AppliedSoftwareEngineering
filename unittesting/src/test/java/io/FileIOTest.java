package io;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import math.MyMath;

import static org.junit.Assert.assertArrayEquals;

public class FileIOTest {
	
	/* 
	 * A reference to the FileIO class
	 * whose methods we are testing in this class
	 */
	FileIO fileio;
	
	public static  String resourcesPath= "src/test/resources";
	/*
	 * This is a constructor which is called 
	 * when the MyMathTest class is initialized
	 */
	public FileIOTest() {
		this.fileio = new FileIO();
	}
	
	/*
	 * A test case when
	 * the given file contains only valid entries.
	 */
	@Test
	public void testReadFileValidInput() {
		int[] expectedNames = new int[] {1,2,3,4,5,6,7,8,9};
		String resourceName = "/valid_fileio_test_input.txt";
		String validInputFilepath = resourcesPath.concat(resourceName);
		assertArrayEquals(expectedNames, fileio.readFile(validInputFilepath));
	}
	
	@Rule 
	public ExpectedException thrown = ExpectedException.none();
	
	/*
	 * A test case for the exceptions caused when
	 * the given file is empty. Testing
	 * the exception is performed with a @Rule
	 */
	@Test 
	public void testGivenFileIsEmpty() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Given file is empty");
		String resourceName = "/file_is_empty.txt";
		String validInputFilepath = resourcesPath.concat(resourceName);
		fileio.readFile(validInputFilepath);
	}
	
	/*
	 * A test case for the exceptions caused when
	 * the given file is empty. Testing
	 * the exception is performed with a @Rule
	 */
	@Test 
	public void testFileDoesNotExist() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Input file does not exist");
		String resourceName = "/file_is_empty_or_not.txt";
		String validInputFilepath = resourcesPath.concat(resourceName);
		fileio.readFile(validInputFilepath);
	}
	
	/*
	 * A test case when
	 * the given file contains invalid entries.
	 */
	@Test
	public void testReadFileContainsInvalidEntries() {
		int[] expectedNames = new int[] {3, 4, 5};
		String resourceName = "/file_with_invalid_entries.txt";
		String validInputFilepath = resourcesPath.concat(resourceName);
		assertArrayEquals(expectedNames, fileio.readFile(validInputFilepath));
	}
}
