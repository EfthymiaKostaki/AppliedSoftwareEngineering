package codeanalyzer.sourceCodeAnalyzer;

import org.junit.Test;

import codeanalyzer.sourceFileReader.LocalFileReader;

import static org.junit.Assert.*;

import java.io.IOException;

public class RegexAnalyzerTest {
	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	private SourceCodeAnalyzer sca = new RegexAnalyzer(new LocalFileReader());
	
	@Test
	public void testCalculateRegexLOC() throws IOException {
		assertEquals(21, sca.calculateLOC(TEST_CLASS));
	}
	
	@Test
	public void testCalculateRegexNOM() throws IOException {
		assertEquals(3, sca.calculateNOM(TEST_CLASS));
	}
	
	@Test
	public void testCalculateRegexNOC() throws IOException {
		assertEquals(3, sca.calculateNOC(TEST_CLASS));
	}
}
