package codeanalyzer.sourceCodeAnalyzer;

import java.io.IOException;

import codeanalyzer.sourceFileReader.SourceFileReader;

/**
 * An abstract class which creates specific methods for metrics calculation
 * to be implemented by its children.
 *  
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public abstract class SourceCodeAnalyzer {
	protected SourceFileReader fileReader;
	
	public SourceCodeAnalyzer(codeanalyzer.sourceFileReader.SourceFileReader sourceFileReader) {
		this.fileReader = sourceFileReader;
	}
	
	/**
	 * The method calculateLOC calculates the Lines of Code of the file
	 * specified.
	 * 
	 * @param filepath A string variable.
	 * @return int The number of lines is int.
	 * @throws IOException The fileReader can throw an IOException.
	 */
	public abstract int calculateLOC(String filepath) throws IOException; 
	
	/**
	 * The method calculateNOM calculates the number of methods in the file
	 * specified.
	 * 
	 * @param filepath A string variable.
	 * @return int The number of methods is int.
	 * @throws IOException The fileReader can throw an IOException.
	 */
	public abstract int calculateNOM(String filepath) throws IOException;
	
	/**
	 * The method calculateNOC calculates the number of classes in the file
	 * specified.
	 * 
	 * @param filepath A string variable.
	 * @return int The number of classes is int.
	 * @throws IOException The fileReader can throw an IOException.
	 */
	public abstract int calculateNOC(String filepath) throws IOException;
}
