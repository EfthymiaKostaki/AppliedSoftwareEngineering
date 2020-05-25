package codeanalyzer.fileExporter;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doCallRealMethod;

public class JsonExporterTest {
	
	@Test
	public void testWriteJson() {
		JsonExporter jsonExporter = mock(JsonExporter.class);
		// create an empty metrics content
		Map<String, Integer> metrics = new HashMap<>();
		String outputFilepath = "whatever-path";
		
		//this is a demo of how a mocked object can call a real method (partial mocking)
		doCallRealMethod().when(jsonExporter).writeFile(metrics, outputFilepath);
		jsonExporter.writeFile(metrics, outputFilepath);
		//just verify that the method was executed/called
		verify(jsonExporter).writeFile(metrics, outputFilepath);
	}

}
