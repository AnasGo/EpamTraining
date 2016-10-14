package by.gorbunova.audio.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.gorbunova.audio.action.DiscAction;
import by.gorbunova.audio.entity.Audio;
import by.gorbunova.audio.entity.Disc;
import by.gorbunova.audio.factory.DiscCreator;

public class Main {
	public static final String FILEPATH = "files/audiofiles.txt";
	public static final int FIRSTDIAPOSONVALUE = 190;
	public static final int SECONDDIAPOSONVALUE = 200;
	private static Logger log = LogManager.getLogger();
	
	public static void main(String... args) {
		DiscCreator discCreator = new DiscCreator();
		Disc discFromFile = discCreator.createDisc(FILEPATH);
		DiscAction da = new DiscAction();
		Disc sortedDisc = da.sortDiscbyStyle(discFromFile);
		log.info("Disc was sorted.");
		Audio requiredAudio = da.findAudioInDiaposon(sortedDisc, FIRSTDIAPOSONVALUE, SECONDDIAPOSONVALUE);
		log.info("Required Audio was found: "+ requiredAudio.toString());
		}
	}

