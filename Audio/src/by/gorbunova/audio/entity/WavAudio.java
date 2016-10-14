package by.gorbunova.audio.entity;

public class WavAudio extends Audio {
	private boolean compressed;
	private String modulationType;

	public WavAudio() {
		super();
		this.modulationType = NONE;
		this.compressed = false;
	}

	public WavAudio(int audioId, int length, String author, String name, String style, String modulationType,
			boolean isCompressed) {
		super(audioId, length, author, name, style);
		this.modulationType = modulationType;
		this.compressed = isCompressed;
	}

	public WavAudio(int audioId, int length, String author, String name, String style) {
		super(audioId, length, author, name, style);
		this.modulationType = NONE;
		this.compressed = false;
	}

	public WavAudio(int audioId, int length) {
		super(audioId, length);
		this.modulationType = NONE;
		this.compressed = false;
	}

	public String getModulationType() {
		return modulationType.toString();
	}

	public boolean isCompressed() {
		return compressed;
	}

	public void setCompressed(boolean compressed) {
		this.compressed = compressed;
	}

	public void setModulationType(String modulationType) {
		this.modulationType = modulationType;
	}

	@Override
	public String toString() {
		return "WavAudio id " + this.getAudioId() + ", length " + this.getLength() + ", author " + this.getAuthor()
				+ ", name " + this.getName() + ", style " + this.getStyle() + ", modulationType "
				+ this.getModulationType() + ", compressed " + this.isCompressed();
	}
}
