package codeanalyzer.sourceCodeAnalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * A class which applies the Bridge design pattern for implementing different
 * methods for the SourceCodeAnalyzer.
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public class AnalyzerManagement {
	
	/**
	 * The method calculateMetrics calculates different metrics for the 
	 * sourceCodeAnalyzer.
	 * 
	 * @param sourceCodeAnalyzer An object of SourceCodeAnalyzer
	 * @param filepath A string containing the filepath in which the file will be 
	 * written to.
	 * @return Map<String, Integer> The types of the metrics and their result.
	 * @throws IOException Which can occur from the FileReader.
	 */
	public Map<String, Integer> calculateMetrics(SourceCodeAnalyzer sourceCodeAnalyzer, String filepath) throws IOException{
		int loc = sourceCodeAnalyzer.calculateLOC(filepath);
		int nom = sourceCodeAnalyzer.calculateNOM(filepath);
		int noc = sourceCodeAnalyzer.calculateNOC(filepath);
		
		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",loc);
		metrics.put("nom",nom);
		metrics.put("noc",noc);
		
		return metrics;
	}
			
}
