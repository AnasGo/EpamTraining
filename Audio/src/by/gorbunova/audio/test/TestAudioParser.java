package by.gorbunova.audio.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class TestAudioParser {
	public static final int TOKENCOUNT = 8;
	public static final String SPACING = "\\s+";
	public static final String AUDIOTYPE = "(mp3audio+|oggaudio+|wavaudio+)";

	@Test
	public void testParseLineCount() {
		String line = "1 28";
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
		boolean actual = count != TOKENCOUNT ? true : false;
		assertTrue("Fail in testParseLineCount", actual);
	}

	@Test
	public void testParseLineAudioType() {
		String line = "1 25 author name mp3audio  ";
		Scanner scLine = new Scanner(line);
		scLine.useDelimiter(SPACING);
		boolean actual = scLine.findInLine(AUDIOTYPE).toUpperCase().isEmpty();
		if (scLine != null) {
			scLine.close();
		}
		assertFalse("Fail in testParserLineAudioType", actual);
	}
}
