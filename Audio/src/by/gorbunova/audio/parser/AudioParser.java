package by.gorbunova.audio.parser;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.gorbunova.audio.entity.AudioType;

public class AudioParser {
	private static Logger log = LogManager.getLogger();
	
	private static final int TOKENCOUNT = 8;
	private static final String SPACING = "\\s+";
	private static final String AUDIOTYPE = "(mp3audio+|oggaudio+|wavaudio+)";
	
	/**
	 * method for string parsing
	 * 
	 * @param String from file
	 * @return some specific AudioType
	 */
	
	public static AudioType parseLine(String line) {
		Scanner scCount = new Scanner(line);
		scCount.useDelimiter(SPACING);
		int count = 0;
		while (scCount.hasNext()) {
			scCount.next();
			count++;
		}
		if (scCount != null) {
			scCount.close();
		}
		Scanner scLine = new Scanner(line);
		scLine.useDelimiter(SPACING);
		try {
			if (count == TOKENCOUNT) {
				return AudioType.valueOf(scLine.findInLine(AUDIOTYPE).toUpperCase());
			}
		} catch (IllegalArgumentException e) {
			log.error("Error parsing, couldn't find AudioType in line" + line, e);
		} finally {
			if (scLine != null) {
				scLine.close();
			}
		}
		return AudioType.UNKNOWN;
	}
}
