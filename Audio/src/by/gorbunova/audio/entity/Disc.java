package by.gorbunova.audio.entity;

import java.util.ArrayList;

public class Disc {
	private ArrayList<Audio> discAudio;

	public Disc() {

	}

	public Disc(ArrayList<Audio> discAudio) {
		this.discAudio = discAudio;
	}

	public ArrayList<Audio> getDiscAudio() {
		return discAudio;
	}
}
