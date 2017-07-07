package com.slgerkamp.billy.bass.domain.music;

import java.io.File;
import java.util.ArrayList;

import com.slgerkamp.billy.bass.domain.music.song.Aliens;
import com.slgerkamp.billy.bass.domain.music.song.Every_breath_you_take;
import com.slgerkamp.billy.bass.domain.music.song.Song;
import com.slgerkamp.billy.bass.domain.music.song.You_re_beautiful;
import com.slgerkamp.billy.bass.infra.gpio.DigitalOutputPinController;
import com.slgerkamp.billy.bass.infra.sound.music.Measures;
import com.slgerkamp.billy.bass.infra.sound.music.Voice;
import com.slgerkamp.billy.bass.infra.sound.play.WavPlayerAsync;

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
		
    	

		// aliens Thread
		long startTime = System.currentTimeMillis();
		System.out.println("billy start : " + startTime);
		Thread.sleep(2200);	
		WavPlayerAsync player = new WavPlayerAsync(new File("aliens.wav"));
		Song song = new Aliens();

		// You_re_beautiful
//		long startTime = System.currentTimeMillis();
//		System.out.println("billy start : " + startTime);
//		Thread.sleep(9000);	
//		WavPlayerAsync player = new WavPlayerAsync(new File("you_re_beautiful.wav"));
//		Song song = new You_re_beautiful();

//		// Every_Breath_You_Take
//		WavPlayerAsync player = new WavPlayerAsync(new File("Every_Breath_You_Take.wav"));
//		Song song = new Every_breath_you_take();


		new Thread(player).start();
		
		// Every_Breath_You_Take
//		Thread.sleep(1850);	
//		long startTime = System.currentTimeMillis();
//		System.out.println("billy start : " + startTime);

    	final Measures measures = song.measures();
    	ArrayList<Voice> mouths = song.songForMouth();
    	final Musician mouth_musician = new Musician(mouth, measures, mouths);
    	ArrayList<Voice> tails = song.songForTail();
    	final Musician tail_musician = new Musician(tail, measures, tails);
    	ArrayList<Voice> heads = song.songForHead();
    	final Musician head_musician = new Musician(head, measures, heads);
    	while(true) {
    		System.out.println(System.currentTimeMillis());
    		if (!mouth_musician.next(startTime) & !tail_musician.next(startTime) & !head_musician.next(startTime)) {
    			System.out.println("billy end");
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
