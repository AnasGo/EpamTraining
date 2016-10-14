package by.gorbunova.audio.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class TestAudioFactory {
	public static final String SPACING = "\\s+";

	@Test
	public void testCheckIdAndLengthInSeconds() {
		String line = new String("0 12 23 24");
		Scanner sc = new Scanner(line);
		sc.useDelimiter(SPACING);
		int audioId = sc.nextInt();
		int lengthInSeconds = sc.nextInt();
		sc.close();
		boolean actual = audioId > 0 && lengthInSeconds > 0 ? true : false;
		boolean expected = false;
		assertEquals("Fail in testCheckIdAndLengthInSeconds", actual, expected);
	}
}
