package math;

import org.junit.Test;

import io.FileIO;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;

public class ArrayOperationsTest {
	@Test
	public void testFindNamesInFileThatStartWith() {
		FileIO fileio = mock(FileIO.class);
		MyMath mm= mock(MyMath.class);
		
		String path = "src/test/resources/integer_numbers.txt";
		when(fileio.readFile(path)).thenReturn(new int[] {4, 3, 193, 691, 8, 12});
		when(mm.isPrime(4)).thenReturn(false);
		when(mm.isPrime(3)).thenReturn(true);
		when(mm.isPrime(193)).thenReturn(true);
		when(mm.isPrime(691)).thenReturn(true);
		when(mm.isPrime(8)).thenReturn(false);
		when(mm.isPrime(12)).thenReturn(false);
		
		ArrayOperations ns = new ArrayOperations();
		int[] expected = {3, 193, 691};
		int[] actual = ns.findPrimesInFile(fileio, path, mm);
		
		assertArrayEquals(expected, actual);
	}
}
