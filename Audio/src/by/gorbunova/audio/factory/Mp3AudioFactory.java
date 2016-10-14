package by.gorbunova.audio.factory;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.gorbunova.audio.entity.Mp3Audio;

public class Mp3AudioFactory extends AudioFactory {
	private static Logger log = LogManager.getLogger();

	@Override
	public Mp3Audio createAudio(String line) {
		Mp3Audio mp3 = null;
		Scanner sc = new Scanner(line);
		sc.useDelimiter(SPACING);
		try {
			mp3 = new Mp3Audio(sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
		} catch (NoSuchElementException | NumberFormatException e) {
			log.error("Mp3Audio not created, error parsing in String " + line, e);
		} finally {
			if (!(sc == null)) {
				sc.close();
			}
		}
		return mp3;
	}
}
