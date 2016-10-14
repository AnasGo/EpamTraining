package by.gorbunova.audio.test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestAudioReaderFromFile {

	@Test(expected = IOException.class)
	public void readFromFile() throws IOException {
		String fileName = "files/files.txt";
		List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		assertNull("Fail in test readFromFile", lines);
	}
	
	@Test
	public void readFromFileGetLines() throws IOException {
		String fileName = "files/audiofiles.txt";
		List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		assertNotNull("Fail in test readFromFile", lines);
	}
}
