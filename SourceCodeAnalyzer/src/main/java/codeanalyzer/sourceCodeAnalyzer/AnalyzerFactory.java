package codeanalyzer.sourceCodeAnalyzer;

import codeanalyzer.sourceFileReader.SourceFileReader;

/**
 * A class which determines the instance of the source analyer object.
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public class AnalyzerFactory {
	
	/**
	 * The method createSourceCodeAnalyzer creates a SourceCodeAnalyzer according
	 * to the instance of this class which is determined from the 
	 * sourceCodeAnalyzerType.
	 * 
	 * @param sourceFileReader The file reader object.
	 * @param sourceCodeAnalyzerType The type of the SourceCodeAnalyzer. Regex of StrComp.
	 * @return
	 */
	public SourceCodeAnalyzer createSourceCodeAnalyzer(SourceFileReader sourceFileReader, String sourceCodeAnalyzerType) {
		SourceCodeAnalyzer sourceCodeAnalyzer;
		if (sourceCodeAnalyzerType.equals("regex")) {
			sourceCodeAnalyzer = new RegexAnalyzer(sourceFileReader);
		} else if (sourceCodeAnalyzerType.equals("strcomp")) {
			sourceCodeAnalyzer = new StrCompAnalyzer(sourceFileReader);
		} else {
			return null;
		}
		return sourceCodeAnalyzer;
	}
}
