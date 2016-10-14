package by.gorbunova.audio.comparator;

import java.util.Comparator;

import by.gorbunova.audio.entity.Audio;

public class AudioComparator implements Comparator<Audio>{
	
	/** method compares two audiofiles first with style, if style is equal - with audioId
	 * 
	 * @param two Audios
	 * @return difference 
	 */
	
	@Override
	public int compare(Audio audio1, Audio audio2) {
		return audio1.getStyle().compareTo(audio2.getStyle());
	}
}
