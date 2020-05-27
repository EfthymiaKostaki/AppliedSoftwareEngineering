package codeanalyzer.sourceFileReader;

/**
 * A class which determines the instance of a SourceFileReader object according
 * to its fileReaderType.
 * 
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public class FileReaderFactory {
	
	/**
	 * The createFileReader method determines the instance of a SourceFileReader object according
	 * to its fileReaderType.
	 * 
	 * @param fileReaderType A string which can be local or web.
	 * @return SourceFileReader An object which can access methods in a different way
	 * according to its instance.
	 */
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
