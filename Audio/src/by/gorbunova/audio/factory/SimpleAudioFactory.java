package by.gorbunova.audio.factory;

import java.util.NoSuchElementException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.gorbunova.audio.entity.Audio;

public class SimpleAudioFactory extends AudioFactory {
	private static Logger log = LogManager.getLogger();
	
	private static final int TOKENCOUNT = 2;
	
	@Override
	public Audio createAudio(String line) {
		Audio simpleAudio = null;
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

		Scanner sc = new Scanner(line);
		sc.useDelimiter(SPACING);
		try {
			simpleAudio = count == TOKENCOUNT ? new Audio(sc.nextInt(), sc.nextInt())
					: new Audio(sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.next());
		} catch (NoSuchElementException | NumberFormatException e) {
			log.error("Audio not created, error parsing in String " + line, e);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		return simpleAudio;
	}
}
