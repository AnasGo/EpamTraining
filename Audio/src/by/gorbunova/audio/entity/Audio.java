package by.gorbunova.audio.entity;

public class Audio implements Comparable<Audio> {
	static final String NONE = "Unknown";
	private int audioId;
	private int lengthInSeconds;
	private String author;
	private String name;
	private String style;

	public Audio() {
		this.audioId = 0;
		this.lengthInSeconds = 0;
		this.style = NONE;

	}

	public Audio(int audioId, int length, String author, String name, String style) {
		this.audioId = audioId;
		this.lengthInSeconds = length;
		this.author = author;
		this.name = name;
		this.style = style;
	}

	public Audio(int audioId, int length) {
		this.audioId = audioId;
		this.lengthInSeconds = length;
		this.author = NONE;
		this.name = NONE;
		this.style = NONE;
	}

	public long getAudioId() {
		return audioId;
	}

	public double getLength() {
		return lengthInSeconds;
	}

	public String getAuthor() {
		return author;
	}

	public String getName() {
		return name;
	}

	public String getStyle() {
		return style;
	}

	public void setAudioId(int audioId) {
		this.audioId = audioId;
	}

	public void setLengthInSeconds(int length) {
		this.lengthInSeconds = length;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "Audio id " + audioId + ", length " + lengthInSeconds + ", author " + author + ", name " + name
				+ ", style " + style;
	}

	@Override
	public int compareTo(Audio audio) {
		return Long.compare(this.audioId, audio.audioId);
	}
}
