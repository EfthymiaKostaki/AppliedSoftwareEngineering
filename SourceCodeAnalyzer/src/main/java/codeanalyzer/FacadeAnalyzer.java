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

/**
 * A class which applies the Facade design pattern for analyzing the 
 * source code of the project using different metrics. 
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
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
	
	/**
	 * analyze() is responsible for the main part of the project since it handles all 
	 * communication with the subpackages.
	 *
	 * @exception IOException when there is a problem with the file being read. 
	 */
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
		fileExporter.writeFile(metrics, outputFilePath);
	}

}
