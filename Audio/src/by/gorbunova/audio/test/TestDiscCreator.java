package by.gorbunova.audio.test;

import static org.junit.Assert.*;

import org.junit.Test;
import by.gorbunova.audio.entity.AudioType;

public class TestDiscCreator {
	public final static String LINE = "wavaudio";
	
	@Test
	public void testCreateDisc() {
		AudioType audioType = AudioType.valueOf(LINE.toUpperCase());
		boolean actual = true;
		switch (audioType) {
		case UNKNOWN:
		case MP3AUDIO:
		case OGGAUDIO:
			actual = false;
			break;
		case WAVAUDIO:
			break;
		}
		boolean expected = true;
		assertEquals("Fail in testCreateDisc", expected, actual);
	}
}
