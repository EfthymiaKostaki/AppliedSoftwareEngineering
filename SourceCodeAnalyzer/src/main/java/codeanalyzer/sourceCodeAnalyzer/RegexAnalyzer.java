package codeanalyzer.sourceCodeAnalyzer;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import codeanalyzer.sourceFileReader.SourceFileReader;

public class RegexAnalyzer extends SourceCodeAnalyzer {

	public RegexAnalyzer(SourceFileReader sourceFileReader) {
		super(sourceFileReader);
	}

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
