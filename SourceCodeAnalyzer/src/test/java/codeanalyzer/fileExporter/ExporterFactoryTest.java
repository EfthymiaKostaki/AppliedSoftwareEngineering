package codeanalyzer.fileExporter;

import org.junit.Assert;
import org.junit.Test;

public class ExporterFactoryTest {
	ExporterFactory exporterFactory = new ExporterFactory();
	@Test
	public void testCreateFileExporterCsv() {
		FileExporter fileExporter = exporterFactory.createFileExporter("csv");
		Assert.assertTrue(fileExporter instanceof  CsvExporter);
	}
	
	@Test
	public void testCreateFileExporterJson() {
		FileExporter fileExporter = exporterFactory.createFileExporter("json");
		Assert.assertTrue(fileExporter instanceof  JsonExporter);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateFileExporterUnknown() {
		exporterFactory.createFileExporter("something");
	}
}
