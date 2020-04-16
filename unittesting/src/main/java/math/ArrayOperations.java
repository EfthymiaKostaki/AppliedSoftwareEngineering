package math;

import java.util.ArrayList;
import java.util.List;

import io.FileIO;

/**
 * A class that provides methods for handling different arrays.
 * 
 * @author EfthymiaKostaki
 */
public class ArrayOperations {
	
	/**
	 * A method which returns the numbers who are prime from a given file
	 * @param filepath the file that contains a list of numbers
	 * @param fileIo the class that reads the file and returns an int[] with its contents
	 * @param MyMath object which includes the method for determining if a number is prime
	 * @return an integer array of prime numbers
	 */
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] numbers = fileIo.readFile(filepath);
		List<Integer> primeNumbers = new ArrayList<>();
		
		for(int number: numbers) {
			if (myMath.isPrime(number)) {
				primeNumbers.add(number);
			}
		}
		
		return primeNumbers.stream().mapToInt(i -> i).toArray();
	}
}
