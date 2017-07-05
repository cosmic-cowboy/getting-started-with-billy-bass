package com.slgerkamp.billy.bass.domain.sound.music.song;

import java.util.ArrayList;

import com.slgerkamp.billy.bass.domain.sound.music.Measures;
import com.slgerkamp.billy.bass.domain.sound.music.TempoMap;
import com.slgerkamp.billy.bass.domain.sound.music.TimeSign;
import com.slgerkamp.billy.bass.domain.sound.music.Voice;

public class You_re_beautiful implements Song {

	public ArrayList<Voice> song() {
		ArrayList<Voice> voices = new ArrayList<Voice>();
//    	voices.add(new Voice(0, 0.5, 0, 0.75));
//    	voices.add(new Voice(0, 1.0, 0, 1.25));
//    	voices.add(new Voice(0, 1.5, 0, 1.75));
//    	voices.add(new Voice(0, 2.0, 0, 2.75));
//    	voices.add(new Voice(0, 3.0, 0, 3.25));

//    	for(int i = 0; i < 20; i ++) {
//        	voices.add(new Voice(i, 0.0, i, 0.25));    		
//        	voices.add(new Voice(i, 0.5, i, 0.75));    		
//        	voices.add(new Voice(i, 1.0, i, 1.25));    		
//        	voices.add(new Voice(i, 1.5, i, 1.75));    		
//        	voices.add(new Voice(i, 2.0, i, 2.25));    		
//        	voices.add(new Voice(i, 2.5, i, 2.75));    		
//        	voices.add(new Voice(i, 3.0, i, 3.25));    		
//        	voices.add(new Voice(i, 3.5, i, 3.75));    		
//    	}

    	voices.add(new Voice(0, 0.25, 0, 0.50));
    	voices.add(new Voice(0, 0.75, 0, 1.00));
    	voices.add(new Voice(0, 1.25, 0, 1.50));
    	voices.add(new Voice(0, 1.75, 0, 2.25));
    	voices.add(new Voice(0, 2.50, 0, 2.75));

    	voices.add(new Voice(1, 0.25, 1, 0.50));
    	voices.add(new Voice(1, 0.75, 1, 1.00));
    	voices.add(new Voice(1, 1.25, 1, 1.50));
    	voices.add(new Voice(1, 1.75, 1, 2.25));

    	voices.add(new Voice(2, 0.25, 2, 0.50));
    	voices.add(new Voice(2, 0.75, 2, 1.00));
    	voices.add(new Voice(2, 1.25, 2, 1.50));
    	voices.add(new Voice(2, 1.75, 2, 2.25));
    	voices.add(new Voice(2, 2.50, 2, 2.75));

    	voices.add(new Voice(3, 0.25, 3, 0.50));
    	voices.add(new Voice(3, 0.75, 3, 1.00));
    	voices.add(new Voice(3, 1.25, 3, 1.50));
    	voices.add(new Voice(3, 1.75, 3, 2.25));
    	voices.add(new Voice(3, 2.75, 3, 3.00));
    	voices.add(new Voice(3, 3.25, 3, 3.50));
    	voices.add(new Voice(3, 3.75, 3, 3.875));

    	voices.add(new Voice(4, 0.000, 4, 0.125));
    	voices.add(new Voice(4, 0.125, 4, 0.250));
    	voices.add(new Voice(4, 0.250, 4, 0.375));
    	voices.add(new Voice(4, 0.375, 4, 0.500));
    	voices.add(new Voice(4, 0.500, 4, 0.625));
    	voices.add(new Voice(4, 0.625, 4, 1.000));
    	voices.add(new Voice(4, 3.375, 4, 3.500));
    	voices.add(new Voice(4, 3.250, 4, 3.375));

    	voices.add(new Voice(4, 0.000, 4, 0.125));
    	voices.add(new Voice(4, 0.125, 4, 0.250));
    	voices.add(new Voice(4, 0.250, 4, 0.375));
    	voices.add(new Voice(4, 0.375, 4, 0.500));
    	voices.add(new Voice(4, 0.500, 4, 0.625));
    	voices.add(new Voice(4, 0.750, 4, 1.000));
    	voices.add(new Voice(4, 3.375, 4, 3.500));
    	voices.add(new Voice(4, 3.250, 4, 3.375));

		return voices;
	}

	public Measures measures() {
		return new Measures(new TimeSign(4), new TempoMap(82));
	}

	public ArrayList<Voice> songForHead() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Voice> songForTail() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Voice> songForMouth() {
		// TODO Auto-generated method stub
		return null;
	}

}
