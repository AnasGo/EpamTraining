package by.gorbunova.audio.entity;

public class Mp3Audio extends Audio {
	private String stereoType;
	private int mp3BitRate;

	public Mp3Audio() {
		super();
		this.stereoType = NONE;
		this.mp3BitRate = 0;
	}

	public Mp3Audio(int audioId, int length, String author, String name, String style, String stereoType,
			int mp3BitRate) {
		super(audioId, length, author, name, style);
		this.stereoType = stereoType;
		this.mp3BitRate = mp3BitRate;
	}

	public Mp3Audio(int audioId, int length, String author, String name, String style) {
		super(audioId, length, author, name, style);
		this.stereoType = NONE;
		this.mp3BitRate = 0;
	}

	public Mp3Audio(int audioId, int length) {
		super(audioId, length);
		this.stereoType = NONE;
		this.mp3BitRate = 0;
	}

	public String getStereoType() {
		return stereoType;
	}

	public int getMp3BitRate() {
		return mp3BitRate;
	}

	public void setStereoType(String stereoType) {
		this.stereoType = stereoType;
	}

	public void setMp3BitRate(int mp3BitRate) {
		this.mp3BitRate = mp3BitRate;
	}

	@Override
	public String toString() {
		return "Mp3Audio id " + this.getAudioId() + ", length " + this.getLength() + ", author " + this.getAuthor()
				+ ", name " + this.getName() + ", style " + this.getStyle() + ", stereoType " + this.getStereoType()
				+ ", bitrate " + this.getMp3BitRate();
	}
}
