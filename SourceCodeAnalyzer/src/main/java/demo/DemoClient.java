package demo;

import java.io.IOException;

import codeanalyzer.FacadeAnalyzer;

/**
 * This is the Demo class of the project which has the main method.
 * 
 * @author Efthymia Kostaki
 * @version 1.0
 * @since   2020-05-25 
 */

public class DemoClient {

	public static void main(String[] args) throws IOException {
		String filepath = "src/main/resources/TestClass.java";
		String sourceCodeAnalyzerType = "regex";
		String sourceFileLocation = "local";
		String outputFilePath = "output_metrics";
		String outputFileType = "csv";
		
		if(args.length == 5) {
			filepath = args[0];
			sourceCodeAnalyzerType = args[1];
			sourceFileLocation = args[2];
			outputFilePath = args[3];
			outputFileType = args[4];
		} else if (args.length != 0) {
			System.out.println("Incorrect number of arguments.");
			System.exit(1);
		}
		
		FacadeAnalyzer facade = new FacadeAnalyzer(filepath, sourceCodeAnalyzerType,
				sourceFileLocation, outputFilePath, outputFileType);
		facade.analyze();
	}

}
