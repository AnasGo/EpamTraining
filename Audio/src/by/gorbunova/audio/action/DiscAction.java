package by.gorbunova.audio.action;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.gorbunova.audio.comparator.AudioComparator;
import by.gorbunova.audio.entity.Audio;
import by.gorbunova.audio.entity.Disc;

public class DiscAction {
	private static Logger log = LogManager.getLogger();
	
	/** method sorts Disc by Style 
	 * 
	 * @param any Disc
	 * @return sortedDisc
	 */ 
	
	public Disc sortDiscbyStyle(Disc disc) {
		ArrayList<Audio> audioList = disc.getDiscAudio();
		Collections.sort(audioList, new AudioComparator());
		log.info("Disc is sorted successfully.");
		return new Disc(audioList);
		}
	
	/** method defines Audio in required audio length diaposon 
	 * 
	 * @param any Disc, min Value, max Value
	 * @return Audio
	 */
	
	public Audio findAudioInDiaposon(Disc disc, int minValue, int maxValue) {
		Audio audioInDiaposon = null;
		if (minValue > maxValue) {
			int temp = minValue;
			minValue = maxValue;
			maxValue = temp;

		}
		for (int i = 0; i < disc.getDiscAudio().size(); i++) {
			if (disc.getDiscAudio().get(i).getLength() >= minValue
					&& disc.getDiscAudio().get(i).getLength() <= maxValue) {
				audioInDiaposon = disc.getDiscAudio().get(i);
			}
		}
		log.info("Required Audio is found.");
		return audioInDiaposon;
	}
}
