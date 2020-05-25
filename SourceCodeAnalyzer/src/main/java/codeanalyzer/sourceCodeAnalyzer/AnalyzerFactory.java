package codeanalyzer.sourceCodeAnalyzer;

import codeanalyzer.sourceFileReader.SourceFileReader;

public class AnalyzerFactory {
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
