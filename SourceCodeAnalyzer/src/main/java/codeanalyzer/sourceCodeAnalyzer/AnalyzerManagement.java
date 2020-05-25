package codeanalyzer.sourceCodeAnalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AnalyzerManagement {
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
