package by.gorbunova.triangle.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestTriangleReaderFromFile {
	
	@Before
	@Test
	public void readFromFileGetLines() throws IOException{
		String fileName = "files/texttriangle.txt";
		List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		assertNotNull("Fail in test readFromFile",lines);
	}
	
	@Test(expected = IOException.class)
	public void readFromFile() throws IOException{
		String fileName = "files/text.txt";
		List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		assertNull("Fail in test readFromFile",lines);
	}
}
