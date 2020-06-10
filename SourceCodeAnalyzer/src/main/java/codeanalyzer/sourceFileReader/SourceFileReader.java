package codeanalyzer.sourceFileReader;

import java.io.IOException;
import java.util.List;

/**
 * A class which defines the interface SourceFileReader class and its methods.
 *  
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public interface SourceFileReader {
	
	/**
	 * The method readFileIntoList reads a file into a list of Strings.
	 * 
	 * @param filepath which is a String.
	 * @return List<String> A list of Strings for each line.
	 * @throws IOException Can be caused while reading the file.
	 */
	public List<String> readFileIntoList(String filepath) throws IOException;
	
	/**
	 * The method readFileIntoString reads a file into a String.
	 * 
	 * @param filepath which is a String.
	 * @return String A string containing the file separated by /n.
	 * @throws IOException Can be caused while reading the file.
	 */
	public String readFileIntoString(String filepath) throws IOException;
}
