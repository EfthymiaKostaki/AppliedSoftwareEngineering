package codeanalyzer.sourceCodeAnalyzer;

import java.io.IOException;

import codeanalyzer.sourceFileReader.SourceFileReader;

public abstract class SourceCodeAnalyzer {
	protected SourceFileReader fileReader;
	
	public SourceCodeAnalyzer(codeanalyzer.sourceFileReader.SourceFileReader sourceFileReader) {
		this.fileReader = sourceFileReader;
	}
	
	public abstract int calculateLOC(String filepath) throws IOException; 
	
	public abstract int calculateNOM(String filepath) throws IOException;
	
	public abstract int calculateNOC(String filepath) throws IOException;
}
