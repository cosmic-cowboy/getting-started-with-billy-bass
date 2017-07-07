package com.slgerkamp.billy.bass.domain.communication;

import java.io.File;
import java.io.IOException;

import com.slgerkamp.billy.bass.infra.gpio.DigitalOutputPinController;
import com.slgerkamp.billy.bass.infra.sound.play.WavPlayerAsync;
import com.slgerkamp.billy.bass.infra.sound.rec.Record;

public class Recorder {
	private static String RECORD_DIRECTORY = "/home/pi/records/";
	private static String WAV_EXTENSION = ".wav";
	
	private static String START_MESSAGE = "what_s_up.wav";
	private static String FINISH_MESSAGE = "i_got_your_message.wav";
	
	private static int RECORD_TIME = 10000;
	private static int SPEECH_BLANK = 1000;
	public static int SPEECH_SPEED = 150;

	private final DigitalOutputPinController head;
	private final DigitalOutputPinController tail;
	private final DigitalOutputPinController mouth;

	public Recorder(
			DigitalOutputPinController mouth,
			DigitalOutputPinController tail,
			DigitalOutputPinController head) {
		this.head = head;
		this.tail = tail;
		this.mouth = mouth;
	}

	void record() throws InterruptedException {
		System.out.print("start rec");
		System.out.println(", timestamp : " + System.currentTimeMillis());
		
		// start message
		what_s_up();
		// rec
		rec();
		// finish message
		i_got_your_message();
	
		// finish
		head.low();
		tail.low();
		mouth.low();
		System.out.print("finish rec");
		System.out.println(", timestamp : " + System.currentTimeMillis());
	}

	private void rec() throws InterruptedException {
		// start recording
		final Record recorder = new Record(new File(RECORD_DIRECTORY + System.currentTimeMillis() + WAV_EXTENSION));				
		// creates a new thread that waits for a specified
		// of time before stopping
		mouth.high();
		Thread stopper = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(RECORD_TIME);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				recorder.finish();
			}
		});
		stopper.start();
		recorder.start();
		mouth.low();
		try {
			System.out.println("call line-talk-message-post.sh...");
			new ProcessBuilder("bash", "/home/pi/line-talk-message-post.sh").start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Finish rec method");
	}
	
	
	private void what_s_up() throws InterruptedException {
		WavPlayerAsync player = new WavPlayerAsync(new File(START_MESSAGE));
		new Thread(player).start();

		head.high();
		Thread.sleep(SPEECH_BLANK);
		mouth.call(SPEECH_SPEED);
		mouth.call(SPEECH_SPEED);
		while (!player.isFinished()) {
			System.out.println("what_s_up is not finished");
		}
		System.out.println("what_s_up is finished");
	}

	private void i_got_your_message() throws InterruptedException {
		WavPlayerAsync player = new WavPlayerAsync(new File(FINISH_MESSAGE));
		new Thread(player).start();

		Thread.sleep(SPEECH_BLANK);
		head.high();
		mouth.call(SPEECH_SPEED);
		mouth.call(SPEECH_SPEED);
		mouth.call(SPEECH_SPEED);
		mouth.call(SPEECH_SPEED);
		while (!player.isFinished()) {
			System.out.println("i_got_your_message is not finished");
		}
		System.out.println("i_got_your_message is finished");
		head.low();

	}
}
