package by.gorbunova.audio.entity;

public class OggAudio extends Audio {
	private String oggFormat;
	private boolean withSubtitles;
	
	public OggAudio(){
		super();
		this.oggFormat = NONE;
		this.withSubtitles = false;
	}

	public OggAudio(int audioId, int length, String author, String name, String style, String oggFormat,
			boolean withSubtitles) {
		super(audioId, length, author, name, style);
		this.oggFormat = oggFormat;
		this.withSubtitles = withSubtitles;
	}

	public OggAudio(int audioId, int length, String author, String name, String style) {
		super(audioId, length, author, name, style);
		this.oggFormat = NONE;
		this.withSubtitles = false;
	}

	public OggAudio(int audioId, int length) {
		super(audioId, length);
		this.oggFormat = NONE;
		this.withSubtitles = false;
	}

	public String getOggFormat() {
		return oggFormat.toString();
	}

	public boolean isWithSubtitles() {
		return withSubtitles;
	}

	public void setOggFormat(String oggFormat) {
		this.oggFormat = oggFormat;
	}

	public void setWithSubtitles(boolean withSubtitles) {
		this.withSubtitles = withSubtitles;
	}

	@Override
	public String toString() {
		return "OggAudio id " + this.getAudioId() + ", length " + this.getLength() + ", author " + this.getAuthor()
				+ ", name " + this.getName() + ", style " + this.getStyle() + ", oggFormat " + this.getOggFormat()
				+ ", withSubtitles " + this.isWithSubtitles();
	}
}
