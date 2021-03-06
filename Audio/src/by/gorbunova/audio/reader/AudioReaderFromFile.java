package by.gorbunova.audio.reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AudioReaderFromFile {
	private static Logger log = LogManager.getLogger();
	/**
	 * method reads information from file
	 * 
	 * @param filename
	 * @return collection of Strings
	 */

	public static List<String> readFromFile(String fileName) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
			log.info("File successful reading.");
			return lines;
		} catch (FileNotFoundException | NoSuchFileException e) {
			log.fatal("File not found", e);
			throw new RuntimeException("File not found, information is not available.");
		} catch (IOException e) {
			log.error("Unknown mistake", e);
		}
		return lines;
	}
}
