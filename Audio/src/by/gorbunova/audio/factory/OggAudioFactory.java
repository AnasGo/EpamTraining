package by.gorbunova.audio.factory;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.gorbunova.audio.entity.OggAudio;

public class OggAudioFactory extends AudioFactory {
	private static Logger log = LogManager.getLogger();

	@Override
	public OggAudio createAudio(String line) {
		OggAudio ogg = null;
		Scanner sc = new Scanner(line);
		sc.useDelimiter(SPACING);
		try {
			ogg = new OggAudio(sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
					sc.nextBoolean());
		} catch (NoSuchElementException | NumberFormatException e) {
			log.error("OggAudio not created, error parsing in String " + line, e);
		} finally {
			if (!(sc == null)) {
				sc.close();
			}
		}
		return ogg;
	}
}
