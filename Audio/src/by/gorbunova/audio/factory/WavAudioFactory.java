package by.gorbunova.audio.factory;

import java.util.NoSuchElementException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.gorbunova.audio.entity.WavAudio;

public class WavAudioFactory extends AudioFactory{
	private static Logger log = LogManager.getLogger();

	@Override
	public WavAudio createAudio(String line) {
		WavAudio wav = null;
		Scanner sc = new Scanner(line);
		sc.useDelimiter(SPACING);
		try {
			wav = new WavAudio(sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
					sc.nextBoolean());
		} catch (NoSuchElementException | NumberFormatException e) {
			log.error("WavAudio not created, error parsing in String " + line, e);
		} finally {
			if (!(sc == null)) {
				sc.close();
			}
		}
		return wav;
	}
}
