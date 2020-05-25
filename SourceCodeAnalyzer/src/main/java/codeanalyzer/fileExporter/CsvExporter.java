package codeanalyzer.fileExporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * A class which implements the FileExporter interface which
 * gives the ability to write in a CSV file.
 * 
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public class CsvExporter implements FileExporter{
	
	/**
	 * This method overrides the abstract method writeFile which
	 * gives the ability to write in a CSV file.
	 * 
	 * @param metrics A map which contains all the data of the metrics.
	 * @param filepath The path were the file will be exported to.
	 */
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {
		File outputFile = new File(filepath + ".csv");
		StringBuilder metricsNames = new StringBuilder();
		StringBuilder metricsValues = new StringBuilder();
		
		for (Map.Entry<String, Integer> entry : metrics.entrySet()) {
			metricsNames.append(entry.getKey() + ",");
			metricsValues.append(entry.getValue()+",");
		}
		
		try {
			FileWriter writer = new FileWriter(outputFile);
			writer.append(metricsNames + "\n");
			writer.append(metricsValues + "\n");
			writer.close();
			System.out.println("Metrics saved in " + outputFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
