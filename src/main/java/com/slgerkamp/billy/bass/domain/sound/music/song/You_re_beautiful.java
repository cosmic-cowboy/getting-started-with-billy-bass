package com.slgerkamp.billy.bass.domain.sound.music.song;

import java.util.ArrayList;

import com.slgerkamp.billy.bass.domain.sound.music.Measures;
import com.slgerkamp.billy.bass.domain.sound.music.TempoMap;
import com.slgerkamp.billy.bass.domain.sound.music.TimeSign;
import com.slgerkamp.billy.bass.domain.sound.music.Voice;

public class You_re_beautiful implements Song {

	public ArrayList<Voice> songForHead() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Voice> songForTail() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Voice> songForMouth() {
		ArrayList<Voice> voices = new ArrayList<Voice>();

		
    	voices.add(new Voice(9, 0.25, 9, 0.75));
    	voices.add(new Voice(9, 0.75, 9, 1.25));
    	voices.add(new Voice(9, 1.25, 9, 1.75));
    	voices.add(new Voice(9, 1.75, 9, 2.50));
    	voices.add(new Voice(9, 2.50, 9, 2.75));

    	voices.add(new Voice(10, 0.25, 10, 0.75));
    	voices.add(new Voice(10, 0.75, 10, 1.25));
    	voices.add(new Voice(10, 1.25, 10, 1.75));
    	voices.add(new Voice(10, 1.75, 10, 2.25));

    	voices.add(new Voice(11, 0.25, 11, 0.75));
    	voices.add(new Voice(11, 0.75, 11, 1.25));
    	voices.add(new Voice(11, 1.25, 11, 1.75));
    	voices.add(new Voice(11, 1.75, 11, 2.50));
    	voices.add(new Voice(11, 2.50, 11, 2.75));

    	voices.add(new Voice(12, 0.25, 12, 0.75));
    	voices.add(new Voice(12, 0.75, 12, 1.24));
    	voices.add(new Voice(12, 1.25, 12, 1.75));
    	voices.add(new Voice(12, 1.75, 12, 2.25));
    	voices.add(new Voice(12, 2.75, 12, 3.25));
    	voices.add(new Voice(12, 3.25, 12, 3.75));
    	voices.add(new Voice(12, 3.75, 12, 3.875));

    	voices.add(new Voice(13, 0.000, 13, 0.125));
    	voices.add(new Voice(13, 0.125, 13, 0.250));
    	voices.add(new Voice(13, 0.250, 13, 0.375));
    	voices.add(new Voice(13, 0.375, 13, 0.500));
    	voices.add(new Voice(13, 0.500, 13, 0.625));
    	voices.add(new Voice(13, 0.625, 13, 1.000));
    	voices.add(new Voice(13, 3.375, 13, 3.500));
    	voices.add(new Voice(13, 3.250, 13, 3.375));

    	voices.add(new Voice(14, 0.000, 14, 0.125));
    	voices.add(new Voice(14, 0.125, 14, 0.250));
    	voices.add(new Voice(14, 0.250, 14, 0.375));
    	voices.add(new Voice(14, 0.375, 14, 0.500));
    	voices.add(new Voice(14, 0.500, 14, 0.625));
    	voices.add(new Voice(14, 0.750, 14, 1.000));
    	voices.add(new Voice(14, 3.375, 14, 3.500));
    	voices.add(new Voice(14, 3.250, 14, 3.375));

		return voices;
	}

	public Measures measures() {
		return new Measures(new TimeSign(4), new TempoMap(82));
	}


}
