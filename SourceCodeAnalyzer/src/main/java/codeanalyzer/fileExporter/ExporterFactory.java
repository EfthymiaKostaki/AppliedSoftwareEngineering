package codeanalyzer.fileExporter;

/**
 * A class which creates FileExporters according to their exporterType.
 * 
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public class ExporterFactory {
	
	/**
	 * 
	 * @param exporterType The type of file we want to export to.
	 * @return FileExporter An object which can be used to access
	 * the FileExporter methods for their implementation.
	 */
	public FileExporter createFileExporter(String exporterType) {
		FileExporter fileExporter;
		if (exporterType.equals("csv")) {
			fileExporter = new CsvExporter();
		} else if (exporterType.equals("json")) {
			fileExporter = new JsonExporter();
		} else {
			throw new IllegalArgumentException("Unknown type : " + exporterType);
		}
		return fileExporter;
	}
}
