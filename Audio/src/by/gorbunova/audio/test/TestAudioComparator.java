package by.gorbunova.audio.test;

import static org.junit.Assert.*;

import org.junit.Test;

import by.gorbunova.audio.comparator.AudioComparator;
import by.gorbunova.audio.entity.Audio;
import by.gorbunova.audio.entity.Mp3Audio;
import by.gorbunova.audio.entity.OggAudio;

public class TestAudioComparator {

	@Test
	public void testCompareDifferentAudioByStyle() {
		AudioComparator comp = new AudioComparator();
		Audio mp3Audio = new Mp3Audio(2, 149, "Queen", "Bohemian rapsody", "stadium-rock");
		Audio oggAudio = new OggAudio(3, 185, "PinkFloyd", "AnotherBrickOnTheWall", "art-music");
		boolean actual = comp.compare(mp3Audio, oggAudio) != 0 ? true : false;
		assertTrue("Fail in testCompareDifferentAudioByStyle", actual);
	}

	@Test
	public void testCompareEqualAudioById() {
		AudioComparator comp = new AudioComparator();
		Audio mp3Audio1 = new Mp3Audio(45, 149, "Queen", "Bohemian rapsody", "rock");
		Audio mp3Audio2 = new Mp3Audio(186, 185, "PinkFloyd", "AnotherBrickOnTheWall", "rock");
		boolean actual = comp.compare(mp3Audio1, mp3Audio2) >= 1 ? true : false;
		assertFalse("Fail in testCompareDifferentAudioByStyle", actual);
	}
}
