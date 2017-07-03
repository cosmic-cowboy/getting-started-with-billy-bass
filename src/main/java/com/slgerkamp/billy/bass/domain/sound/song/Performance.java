package com.slgerkamp.billy.bass.domain.sound.song;

import java.util.ArrayList;

import com.slgerkamp.billy.bass.controller.DigitalOutputPinController;

public class Performance {

	final DigitalOutputPinController mouth;
	
	public Performance(DigitalOutputPinController mouth) {
		this.mouth = mouth;
	}

	public void play(long startTime) throws InterruptedException {
    	final Measures measures = new Measures(new TimeSign(4), new TempoMap(82));
    	ArrayList<Voice> voices = new ArrayList<Voice>();
    	voices.add(new Voice(0, 0.5, 0, 2));
    	voices.add(new Voice(0, 2, 0, 3));
    	voices.add(new Voice(0, 3, 0, 4));
    	voices.add(new Voice(3, 1, 4, 1));
    	final Musician musician = new Musician(mouth, measures, voices);

    	while(true) {
    		System.out.println(System.currentTimeMillis());
    		if (!musician.next(startTime)) {
    			break;
    		}
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }		
    	}
	}
}
