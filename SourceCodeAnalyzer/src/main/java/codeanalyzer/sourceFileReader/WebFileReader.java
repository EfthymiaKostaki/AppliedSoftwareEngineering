package codeanalyzer.sourceFileReader;

import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 * A class which implements the SourceFileReader class for implementing
 * its methods.
 *  
 * @author EfthymiaKostaki
 * @version 1.0
 * @since   2020-05-25 
 */
public class WebFileReader implements SourceFileReader{
	
	/**
	 * The method readFileIntoList reads a file into a list of Strings.
	 * 
	 * @param filepath which is a String.
	 * @return List<String> A list of Strings for each line.
	 * @throws IOException Can be caused while reading the file.
	 */
	public List<String> readFileIntoList(String filepath) throws IOException {
		List<String> lines = new ArrayList<>();
		URL url = new URL(filepath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}
		reader.close();
		return lines;
	}

	/**
	 * The method readFileIntoString reads a file into a String.
	 * 
	 * @param filepath which is a String.
	 * @return String A string containing the file separated by /n.
	 * @throws IOException Can be caused while reading the file.
	 */
	public String readFileIntoString(String filepath) throws IOException {
		StringBuilder sb = new StringBuilder();
        URL url = new URL(filepath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = null;
        while ((line = reader.readLine()) != null) {
        	sb.append(line + "\n");
        }
        reader.close();
		return sb.toString();
	}
}
