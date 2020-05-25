package codeanalyzer.fileExporter;

public class ExporterFactory {
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
