package by.gorbunova.audio.factory;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.gorbunova.audio.entity.Audio;

public abstract class AudioFactory {
	private static Logger log = LogManager.getLogger();
	static final String SPACING = "\\s+";
	
	public abstract Audio createAudio(String line);
	
	/** method checks audioId, lengthInSeconds (must be > 0)
	 * 
	 * @param String from file
	 * @return boolean 
	 */
	
	public static boolean checkIdAndLengthInSeconds(String line) {
		Scanner sc = new Scanner(line);
		sc.useDelimiter(SPACING);
		try {
			int audioId = sc.nextInt();
			int lengthInSeconds = sc.nextInt();
			return audioId > 0 && lengthInSeconds > 0 ? true : false;
		} catch (NoSuchElementException | NumberFormatException e) {
			log.error("Audio not created, error parsing in String " + line, e);
		} finally {
			if (!(sc == null)) {
				sc.close();
			}
		}
		return false;
	}
}
