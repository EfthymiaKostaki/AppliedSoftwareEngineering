package codeanalyzer.sourceCodeAnalyzer;

import java.io.IOException;
import org.junit.Test;

import codeanalyzer.sourceFileReader.LocalFileReader;

import static org.junit.Assert.*;

public class StrCompAnalyzerTest {
	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	private SourceCodeAnalyzer sca = new StrCompAnalyzer(new LocalFileReader());
	
	@Test
	public void testCalculateStrCompLOC() throws IOException {
		assertEquals(7, sca.calculateLOC(TEST_CLASS));
	}
	
	@Test
	public void testCalculateStrCompNOM() throws IOException {
		assertEquals(3, sca.calculateNOM(TEST_CLASS));
	}
	
	@Test
	public void testCalculateStrCompNOC() throws IOException {
		assertEquals(3, sca.calculateNOC(TEST_CLASS));
	}
}
