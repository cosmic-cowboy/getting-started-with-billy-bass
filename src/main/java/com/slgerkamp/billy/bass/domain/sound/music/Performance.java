package com.slgerkamp.billy.bass.domain.sound.music;

import java.io.File;
import java.util.ArrayList;

import com.slgerkamp.billy.bass.controller.DigitalOutputPinController;
import com.slgerkamp.billy.bass.domain.sound.music.song.Every_breath_you_take;
import com.slgerkamp.billy.bass.domain.sound.music.song.Song;
import com.slgerkamp.billy.bass.domain.sound.play.WavPlayer;

public class Performance {

	final DigitalOutputPinController head;
	final DigitalOutputPinController tail;
	final DigitalOutputPinController mouth;
	
	public Performance(
			DigitalOutputPinController head, 
			DigitalOutputPinController tail,
			DigitalOutputPinController mouth) {
		this.head = head;
		this.tail = tail;
		this.mouth = mouth;
	}


	public void play() throws InterruptedException {
		WavPlayer player = new WavPlayer(new File("Every_Breath_You_Take.wav"));
		new Thread(player).start();

		Song song = new Every_breath_you_take();
    	final Measures measures = song.measures();
    	ArrayList<Voice> mouths = song.songForMouth();
    	final Musician mouth_musician = new Musician(mouth, measures, mouths);
    	ArrayList<Voice> tails = new ArrayList<Voice>();
    	final Musician tail_musician = new Musician(tail, measures, tails);
    	ArrayList<Voice> heads = new ArrayList<Voice>();
    	final Musician head_musician = new Musician(head, measures, heads);
    	
    	Thread.sleep(1850);
    	
    	long startTime = System.currentTimeMillis();
		System.out.println("billy start : " + startTime);
    	while(true) {
    		System.out.println(System.currentTimeMillis());
    		if (!mouth_musician.next(startTime) & !tail_musician.next(startTime) & !head_musician.next(startTime)) {
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
