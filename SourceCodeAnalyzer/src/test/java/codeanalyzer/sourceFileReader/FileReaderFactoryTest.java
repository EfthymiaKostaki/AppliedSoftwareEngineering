package codeanalyzer.sourceFileReader;

import org.junit.Assert;
import org.junit.Test;

public class FileReaderFactoryTest {
	FileReaderFactory fileReaderFactory = new FileReaderFactory();
	@Test
	public void testCreateFileReaderLocal() {
		SourceFileReader fileReader = fileReaderFactory.createFileReader("local");
		Assert.assertTrue(fileReader instanceof  LocalFileReader);
	}
	
	@Test
	public void testReadFileReaderWeb() {
		SourceFileReader fileReader = fileReaderFactory.createFileReader("web");
		Assert.assertTrue(fileReader instanceof  WebFileReader);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateFileReaderUnknown() {
		fileReaderFactory.createFileReader("non-existing-type");
	}
}
