package codeanalyzer;

import java.io.IOException;
import java.util.Map;

import codeanalyzer.fileExporter.ExporterFactory;
import codeanalyzer.fileExporter.FileExporter;
import codeanalyzer.sourceCodeAnalyzer.AnalyzerFactory;
import codeanalyzer.sourceCodeAnalyzer.AnalyzerManagement;
import codeanalyzer.sourceCodeAnalyzer.SourceCodeAnalyzer;
import codeanalyzer.sourceFileReader.FileReaderFactory;
import codeanalyzer.sourceFileReader.SourceFileReader;

public class FacadeAnalyzer {
	String filepath;
	String sourceCodeAnalyzerType;
	String sourceFileLocation;
	String outputFilePath;
	String outputFileType;
	
	public FacadeAnalyzer(String filepath, String sourceCodeAnalyzerType, 
			String sourceFileLocation,
			String outputFilePath, String outputFileType) {
		this.filepath = filepath;
		this.sourceCodeAnalyzerType = sourceCodeAnalyzerType;
		this.sourceFileLocation = sourceFileLocation;
		this.outputFilePath = outputFilePath;
		this.outputFileType = outputFileType;
	}
	
	public void analyze() throws IOException {
		AnalyzerFactory analyzerFactory = new AnalyzerFactory();
		FileReaderFactory fileReaderFactory = new FileReaderFactory();
		SourceFileReader sourceFileReader = fileReaderFactory.createFileReader(sourceFileLocation);
		SourceCodeAnalyzer sourceCodeAnalyzer = analyzerFactory.createSourceCodeAnalyzer
				(sourceFileReader, sourceCodeAnalyzerType);
		AnalyzerManagement analyzerManagement = new AnalyzerManagement();
		Map<String, Integer> metrics = analyzerManagement.calculateMetrics
				(sourceCodeAnalyzer, filepath);
				
		ExporterFactory exporterFactory = new ExporterFactory();
		FileExporter fileExporter = exporterFactory.createFileExporter(outputFileType);
		fileExporter.writeFile(metrics, filepath);
	}

}
