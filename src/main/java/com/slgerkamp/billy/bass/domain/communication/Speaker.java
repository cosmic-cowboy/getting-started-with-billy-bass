package com.slgerkamp.billy.bass.domain.communication;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

import com.slgerkamp.billy.bass.infra.gpio.DigitalOutputPinController;
import com.slgerkamp.billy.bass.infra.sound.play.WavPlayerAsync;

public class Speaker {

	private static String VOICE_DIRECTORY = "/home/pi/voices/";
	private static String MP3_EXTENSION = ".mp3";
	private static String WAV_EXTENSION = ".wav";

	private final DigitalOutputPinController head;
	private final DigitalOutputPinController tail;
	private final DigitalOutputPinController mouth;

	private static int SPEECH_BLANK = 1500;

	public Speaker(
			DigitalOutputPinController mouth,
			DigitalOutputPinController tail,
			DigitalOutputPinController head) {
		this.head = head;
		this.tail = tail;
		this.mouth = mouth;
	}

	void fetch() throws InterruptedException{
		System.out.print("start fetch voice");
		System.out.println(", timestamp : " + System.currentTimeMillis());

		FilenameFilter filter = new FilenameFilter(){
			public boolean accept(File file, String str){
				if (str.endsWith(WAV_EXTENSION)){
					return true;
				}else{
					return false;
				}
			}
		};
		File [] list = new File(VOICE_DIRECTORY).listFiles(filter);
		Arrays.sort(list, new Comparator<File>(){
			public int compare(File o1, File o2) {
				int diff = o1.getName().compareTo(o2.getName());
				return diff;
			}});
		for(File s : list) {
			String filename = s.getName();
			System.out.println(filename);
			String mp3filename = filename.replace(WAV_EXTENSION, "") +  MP3_EXTENSION;
			System.out.println(mp3filename);
			
			if (!new File(VOICE_DIRECTORY + mp3filename).exists()) {
				File talk = new File(VOICE_DIRECTORY + filename);
				play(talk);
				System.out.println("delete : " + talk.delete());
			}
		}
		
		System.out.print("finish fetch voice");
		System.out.println(", timestamp : " + System.currentTimeMillis());		
	}

	private void play(File talk) throws InterruptedException {
		WavPlayerAsync player = new WavPlayerAsync(talk);
		new Thread(player).start();
		Thread.sleep(SPEECH_BLANK);
		tail.call(Recorder.SPEECH_SPEED);
		head.high();
		while (!player.isFinished()) {
			mouth.call(Recorder.SPEECH_SPEED);
		}
		head.low();
		tail.call(Recorder.SPEECH_SPEED);
	}
}
