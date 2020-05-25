package codeanalyzer.fileExporter;

import java.util.Map;

public interface FileExporter {
	 public void writeFile(Map<String, Integer> metrics, String filepath);
}
