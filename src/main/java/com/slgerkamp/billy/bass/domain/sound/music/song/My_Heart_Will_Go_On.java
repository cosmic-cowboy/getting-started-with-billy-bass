package com.slgerkamp.billy.bass.domain.sound.music.song;

import java.util.ArrayList;

import com.slgerkamp.billy.bass.domain.sound.music.Measures;
import com.slgerkamp.billy.bass.domain.sound.music.TempoMap;
import com.slgerkamp.billy.bass.domain.sound.music.TimeSign;
import com.slgerkamp.billy.bass.domain.sound.music.Voice;

public class My_Heart_Will_Go_On implements Song {

	public ArrayList<Voice> song() {
		ArrayList<Voice> voices = new ArrayList<Voice>();
    	voices.add(new Voice(7, 0.25, 0, 0.50));

		return voices;
	}

	public Measures measures() {
		return new Measures(new TimeSign(4), new TempoMap(99));
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
