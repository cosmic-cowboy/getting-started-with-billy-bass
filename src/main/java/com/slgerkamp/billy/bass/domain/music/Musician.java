package com.slgerkamp.billy.bass.domain.music;

import java.util.ArrayList;

import com.slgerkamp.billy.bass.infra.gpio.DigitalOutputPinController;
import com.slgerkamp.billy.bass.infra.sound.music.Measures;
import com.slgerkamp.billy.bass.infra.sound.music.Voice;

public class Musician {

	private final Measures measures;
	private final ArrayList<Voice> voices;
	
	private final DigitalOutputPinController mouth;
	
	public Musician(final DigitalOutputPinController mouth, Measures measures, ArrayList<Voice> voices) {
		this.mouth = mouth;
		this.measures = measures;
		this.voices = voices;
	}
	

	public boolean next(long startTime) throws InterruptedException {
		if (voices == null || voices.isEmpty()) {
			return false;
		}
		long current = System.currentTimeMillis(); 
		Voice voice = voices.get(0);

		if(isPlay(startTime, current, voice.endMeasure, voice.endBeat)) {
			System.out.println("end");
			mouth.low();
			voices.remove(0);
			return true;
		}

		if(mouth.isLow() && isPlay(startTime, current, voice.startMeasure, voice.startBeat)) {
			System.out.println("start");
			mouth.high();
			return true;
		}

		return true;
	}

	private boolean isPlay(long startTime, long current, int measure, double beat) {
		double time = measures.getTime(measure, beat);
		long nextPlayTime = startTime + (long)(time*1000);
		
		System.out.println("current : " + current + ", nextPlayTime : " + nextPlayTime);
		System.out.println("time : " + time + ", measure : " + measure + ", beat : " + beat);
		System.out.println("current >= nextPlayTime : " + (current >= nextPlayTime));
		
		if(current >= nextPlayTime) {
			return true;
		}
		return false;
	}

}
