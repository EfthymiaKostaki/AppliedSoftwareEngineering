package codeanalyzer.sourceCodeAnalyzer;

import org.junit.Assert;
import org.junit.Test;

import codeanalyzer.sourceFileReader.LocalFileReader;
import codeanalyzer.sourceFileReader.SourceFileReader;

public class AnalyzerFactoryTest {
    AnalyzerFactory analyzerFactory = new AnalyzerFactory();
    SourceFileReader sourceFileReader = new LocalFileReader();
	
	@Test
	public void testCreateFileExporterRegex() {
		SourceCodeAnalyzer sourceCodeAnalyzer = analyzerFactory.createSourceCodeAnalyzer(sourceFileReader, "regex");
		Assert.assertTrue(sourceCodeAnalyzer instanceof  RegexAnalyzer);
	}
	
	@Test
	public void testCreateFileExporterStrComp() {
		SourceCodeAnalyzer sourceCodeAnalyzer = analyzerFactory.createSourceCodeAnalyzer(sourceFileReader,"strcomp");
		Assert.assertTrue(sourceCodeAnalyzer instanceof  StrCompAnalyzer);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateSourceFileAnalyzerUnknown() {
		analyzerFactory.createSourceCodeAnalyzer(sourceFileReader,"non-existing");
	}
}
