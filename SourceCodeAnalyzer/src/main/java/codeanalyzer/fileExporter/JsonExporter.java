package codeanalyzer.fileExporter;

import java.util.Map;

/**
 * A class which implements the FIleExporter interface
 * and allows to export files in JSON Format.
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public class JsonExporter implements FileExporter{
	
	/**
	 * A method which allows to export files in JSON format.
	 * 
	 * @param metrics A map which contains all the data of the metrics.
	 * @param filepath The path were the file will be exported to.
	 */
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {
		// Functionality not implemented yet
		// No need to implement it for the assignment
	}
}
