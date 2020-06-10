package codeanalyzer.sourceCodeAnalyzer;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class AnalyzerManagementTest {
	
	@Test
	public void testCalculateMetrics() throws IOException {
		SourceCodeAnalyzer sourceCodeAnalyzerMocked = mock(RegexAnalyzer.class);
		String filepath = "src/test/resources/TestClass.java";
		AnalyzerManagement analyzerManagement = new AnalyzerManagement();
		when(sourceCodeAnalyzerMocked.calculateLOC(filepath)).thenReturn(3);
		when(sourceCodeAnalyzerMocked.calculateNOC(filepath)).thenReturn(4);
		when(sourceCodeAnalyzerMocked.calculateNOM(filepath)).thenReturn(5);
		Map<String, Integer> metrics = analyzerManagement.calculateMetrics
				(sourceCodeAnalyzerMocked, filepath);
		Map<String, Integer> metricsTest = new HashMap<>();
		metricsTest.put("loc", 3);
		metricsTest.put("nom", 5);
		metricsTest.put("noc", 4);
		Assert.assertEquals(metricsTest, metrics);
	}
}
