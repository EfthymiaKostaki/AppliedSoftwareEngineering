package codeanalyzer.sourceFileReader;

public class FileReaderFactory {
	public SourceFileReader createFileReader(String fileReaderType) {
		SourceFileReader sourceFileReader;
		if (fileReaderType.equals("local")) {
			sourceFileReader = new LocalFileReader();
		} else if (fileReaderType.equals("web")) {
			sourceFileReader = new WebFileReader();
		} else {
			return null;
		}
		return sourceFileReader;
	}
}
