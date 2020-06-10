package codeanalyzer.sourceCodeAnalyzer;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import codeanalyzer.sourceFileReader.SourceFileReader;

/**
 * A class which extends the SourceCodeAnalyzer class for implementing
 * abstract specific methods using Regex.
 * 
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public class RegexAnalyzer extends SourceCodeAnalyzer {

	public RegexAnalyzer(SourceFileReader sourceFileReader) {
		super(sourceFileReader);
	}
	
	/**
	 * The method calculateLOC calculates the Lines of Code of the file
	 * specified.
	 * 
	 * @param filepath A string variable.
	 * @return int The number of lines is int.
	 * @throws IOException The fileReader can throw an IOException.
	 */
	public int calculateLOC(String filepath) throws IOException {
		String sourceCode = fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
        Matcher nonCodeLinesMatcher = pattern.matcher(sourceCode);

        int nonCodeLinesCounter = 0;
        while (nonCodeLinesMatcher.find()) {
        	nonCodeLinesCounter++;
        }
		
        int sourceFileLength = sourceCode.split("\n").length;
        int loc =  sourceFileLength - nonCodeLinesCounter;
        
		return loc;
	}

	/**
	 * The method calculateNOM calculates the number of methods in the file
	 * specified.
	 * 
	 * @param filepath A string variable.
	 * @return int The number of methods is int.
	 * @throws IOException The fileReader can throw an IOException.
	 */
	@Override
	public int calculateNOM(String filepath) throws IOException {
		String sourceCode = this.fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile(".*\\s*class\\s+.*");
		Matcher classSignatures = pattern.matcher(sourceCode);

		int classCounter = 0;
		while (classSignatures.find()) {
			classCounter++;
		}
		return classCounter;
	}

	/**
	 * The method calculateNOC calculates the number of classes in the file
	 * specified.
	 * 
	 * @param filepath A string variable.
	 * @return int The number of classes is int.
	 * @throws IOException The fileReader can throw an IOException.
	 */
	@Override
	public int calculateNOC(String filepath) throws IOException {
		List<String> sourceCodeList =  this.fileReader.readFileIntoList(filepath);
		int classCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim(); // remove leading and trailing white spaces
			if ((line.startsWith("class ") || line.contains(" class ")) && line.contains("{")) {
				classCounter++;
			}
		}
		return classCounter;
	}
}
