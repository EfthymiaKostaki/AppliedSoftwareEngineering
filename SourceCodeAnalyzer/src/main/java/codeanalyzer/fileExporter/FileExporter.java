package codeanalyzer.fileExporter;

import java.util.Map;

/**
 * An interface for exporting files to different formats.
 * 
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public interface FileExporter {
	
	/**
	 * An abstract method which will allow when implemented 
	 * to export files in different formats.
	 * 
	 * @param metrics A map which contains all the data of the metrics.
	 * @param filepath The path were the file will be exported to.
	 */
	 public void writeFile(Map<String, Integer> metrics, String filepath);
}
