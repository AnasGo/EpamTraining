package by.gorbunova.audio.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.gorbunova.audio.entity.Audio;
import by.gorbunova.audio.entity.AudioType;
import by.gorbunova.audio.entity.Disc;
import by.gorbunova.audio.parser.AudioParser;
import by.gorbunova.audio.reader.AudioReaderFromFile;

public class DiscCreator {
	private static Logger log = LogManager.getLogger();

	/** Disc method-creator 
	 * 
	 * @param filename
	 * @return Disc
	 */
	
	public Disc createDisc(String fileName) {
		List<String> lines = AudioReaderFromFile.readFromFile(fileName);
		ArrayList<Audio> audioList = new ArrayList<Audio>();
		Audio audio = null;

		SimpleAudioFactory simpleAf = new SimpleAudioFactory();
		Mp3AudioFactory mp3Af = new Mp3AudioFactory();
		OggAudioFactory oggAf = new OggAudioFactory();
		WavAudioFactory wavAf = new WavAudioFactory();

		for (String line : lines) {
			try {
				if (AudioFactory.checkIdAndLengthInSeconds(line)) {
					AudioType type = AudioParser.parseLine(line);
					switch (type) {
					case UNKNOWN:
						audio = simpleAf.createAudio(line);
						break;
					case MP3AUDIO:
						audio = mp3Af.createAudio(line);
						break;
					case OGGAUDIO:
						audio = oggAf.createAudio(line);
						break;
					case WAVAUDIO:
						audio = wavAf.createAudio(line);
						break;
					}
					if (audio != null) {
						audioList.add(audio);
						log.info("Audio was added successfully.");
					}
				}
			} catch (NoSuchElementException e) {
				log.error("Audio was not validated, error data in line " + line, e);
			}
		}
		return new Disc(audioList);
	}
}
