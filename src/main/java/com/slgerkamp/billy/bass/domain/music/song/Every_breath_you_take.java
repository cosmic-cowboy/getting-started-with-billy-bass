package com.slgerkamp.billy.bass.domain.music.song;

import java.util.ArrayList;

import com.slgerkamp.billy.bass.infra.sound.music.Measures;
import com.slgerkamp.billy.bass.infra.sound.music.TempoMap;
import com.slgerkamp.billy.bass.infra.sound.music.TimeSign;
import com.slgerkamp.billy.bass.infra.sound.music.Voice;

public class Every_breath_you_take implements Song {

	public Measures measures() {
		return new Measures(new TimeSign(4), new TempoMap(117));
	}

	public ArrayList<Voice> songForTail() {
		ArrayList<Voice> list = new ArrayList<Voice>();
		for(int i = 0; i < 7; i++ ) {
			list.add(new Voice(i, 1.75, i, 2.75));
		}
		return list;
	}

	public ArrayList<Voice> songForHead() {
		ArrayList<Voice> list = new ArrayList<Voice>();
		list.add(new Voice(22, 0, 43, 0));
		return list;
	}

	public ArrayList<Voice> songForMouth() {
		ArrayList<Voice> voices = new ArrayList<Voice>();

		// pattern 1
		voices.add(new Voice(7, 0.75, 7, 1.25));
    	voices.add(new Voice(7, 1.25, 7, 1.75));
    	voices.add(new Voice(7, 1.75, 7, 2.75));
    	voices.add(new Voice(7, 2.75, 7, 3.75));
    	voices.add(new Voice(7, 3.75, 7, 6.00));

		voices.add(new Voice(9, 0.75, 9, 1.25));
    	voices.add(new Voice(9, 1.25, 9, 1.75));
    	voices.add(new Voice(9, 1.75, 9, 2.75));
    	voices.add(new Voice(9, 2.75, 9, 3.75));
    	voices.add(new Voice(9, 3.75, 9, 4.25));
    	voices.add(new Voice(9, 4.25, 9, 4.75));

    	// pattern 2
		voices.add(new Voice(11, 0.25, 11, 0.75));
		voices.add(new Voice(11, 0.75, 11, 1.25));
    	voices.add(new Voice(11, 1.25, 11, 2.25));
    	voices.add(new Voice(11, 2.25, 11, 3.25));
    	voices.add(new Voice(11, 3.25, 11, 3.75));

		voices.add(new Voice(12, 0.25, 12, 0.75));
		voices.add(new Voice(12, 0.75, 12, 1.25));
    	voices.add(new Voice(12, 1.25, 12, 2.25));
    	voices.add(new Voice(12, 2.25, 12, 3.25));
    	voices.add(new Voice(12, 3.25, 12, 3.75));

		voices.add(new Voice(13, 0.25, 13, 0.75));
		voices.add(new Voice(13, 0.75, 13, 1.25));
		voices.add(new Voice(13, 1.25, 13, 1.75));
		voices.add(new Voice(13, 1.75, 13, 2.25));
		voices.add(new Voice(13, 2.25, 13, 2.75));

		// pattern 1
		voices.add(new Voice(15, 0.75, 15, 1.25));
    	voices.add(new Voice(15, 1.25, 15, 1.75));
    	voices.add(new Voice(15, 1.75, 15, 2.75));
    	voices.add(new Voice(15, 2.75, 15, 3.75));
    	voices.add(new Voice(15, 3.75, 15, 6.00));

		voices.add(new Voice(17, 0.75, 17, 1.25));
    	voices.add(new Voice(17, 1.25, 17, 1.75));
    	voices.add(new Voice(17, 1.75, 17, 2.75));
    	voices.add(new Voice(17, 2.75, 17, 3.75));
    	voices.add(new Voice(17, 3.75, 17, 4.50));

    	// pattern 2
		voices.add(new Voice(19, 0.25, 19, 0.75));
		voices.add(new Voice(19, 0.75, 19, 1.25));
    	voices.add(new Voice(19, 1.25, 19, 2.25));
    	voices.add(new Voice(19, 2.25, 19, 3.25));
    	voices.add(new Voice(19, 3.25, 19, 3.75));

    	// pattern 2
		voices.add(new Voice(20, 0.25, 20, 0.50));
		voices.add(new Voice(20, 0.75, 20, 1.00));
    	voices.add(new Voice(20, 1.25, 20, 2.00));
    	voices.add(new Voice(20, 2.25, 20, 3.00));
    	voices.add(new Voice(20, 3.25, 20, 3.50));

		voices.add(new Voice(21, 0.25, 21, 0.50));
		voices.add(new Voice(21, 0.75, 21, 1.00));
    	voices.add(new Voice(21, 1.25, 21, 1.50));
    	voices.add(new Voice(21, 1.75, 21, 2.00));
    	voices.add(new Voice(21, 2.25, 21, 2.75));

		voices.add(new Voice(23, 0.75, 23, 1.25));
    	voices.add(new Voice(23, 1.75, 23, 2.25));
    	voices.add(new Voice(23, 2.75, 23, 3.25));
    	voices.add(new Voice(23, 3.75, 23, 6.00));

		voices.add(new Voice(25, 0.75, 25, 1.00));
    	voices.add(new Voice(25, 1.25, 25, 1.50));
    	voices.add(new Voice(25, 1.75, 25, 2.50));
    	voices.add(new Voice(25, 3.25, 25, 3.50));
    	voices.add(new Voice(25, 3.75, 25, 6.00));

		voices.add(new Voice(27, 0.75, 27, 1.00));
    	voices.add(new Voice(27, 1.25, 27, 1.50));
    	voices.add(new Voice(27, 1.75, 27, 2.50));
    	voices.add(new Voice(27, 2.75, 27, 4.00));
    	voices.add(new Voice(27, 4.25, 27, 6.00));
    	
		voices.add(new Voice(29, 0.25, 29, 0.50));
		voices.add(new Voice(29, 0.75, 29, 1.00));
    	voices.add(new Voice(29, 1.25, 29, 1.50));
    	voices.add(new Voice(29, 1.75, 29, 2.00));
    	voices.add(new Voice(29, 2.25, 29, 3.25));
    	voices.add(new Voice(29, 3.75, 29, 5.00));
 	

    	// same as from 7 to 13
		// pattern 1
		voices.add(new Voice(31, 0.75, 31, 1.00));
    	voices.add(new Voice(31, 1.25, 31, 1.50));
    	voices.add(new Voice(31, 1.75, 31, 2.50));
    	voices.add(new Voice(31, 2.75, 31, 3.25));
    	voices.add(new Voice(31, 3.75, 31, 6.00));

		voices.add(new Voice(33, 0.75, 33, 1.00));
    	voices.add(new Voice(33, 1.25, 33, 1.50));
    	voices.add(new Voice(33, 1.75, 33, 2.50));
    	voices.add(new Voice(33, 2.75, 33, 3.25));
    	voices.add(new Voice(33, 3.75, 33, 4.00));
    	voices.add(new Voice(33, 4.25, 33, 4.50));

    	// pattern 2
		voices.add(new Voice(35, 0.25, 35, 0.50));
		voices.add(new Voice(35, 0.75, 35, 1.00));
    	voices.add(new Voice(35, 1.25, 35, 2.00));
    	voices.add(new Voice(35, 2.25, 35, 3.00));
    	voices.add(new Voice(35, 3.25, 35, 3.50));

		voices.add(new Voice(36, 0.25, 36, 0.50));
		voices.add(new Voice(36, 0.75, 36, 1.00));
    	voices.add(new Voice(36, 1.25, 36, 2.00));
    	voices.add(new Voice(36, 2.25, 36, 3.00));
    	voices.add(new Voice(36, 3.25, 36, 3.50));

		voices.add(new Voice(37, 0.25, 37, 0.50));
		voices.add(new Voice(37, 0.75, 37, 1.00));
		voices.add(new Voice(37, 1.25, 37, 1.50));
		voices.add(new Voice(37, 1.75, 37, 2.00));
		voices.add(new Voice(37, 2.25, 37, 2.50));
    	
    	
    	
    	
    	// same as 42 and 43
		voices.add(new Voice(40, 0.25, 40, 0.50));
		voices.add(new Voice(40, 0.75, 40, 1.00));
    	voices.add(new Voice(40, 1.25, 40, 1.75));
    	voices.add(new Voice(40, 2.25, 40, 2.50));
    	voices.add(new Voice(40, 2.75, 40, 3.00));
    	voices.add(new Voice(40, 3.25, 40, 4.00));

		voices.add(new Voice(41, 0.25, 41, 1.00));
    	voices.add(new Voice(41, 1.25, 41, 1.75));
    	voices.add(new Voice(41, 2.25, 41, 2.75));
    	voices.add(new Voice(41, 3.25, 41, 3.50));
    	
    	// same as 40 and 41
		voices.add(new Voice(42, 0.25, 42, 0.50));
		voices.add(new Voice(42, 0.75, 42, 1.00));
    	voices.add(new Voice(42, 1.25, 42, 1.75));
    	voices.add(new Voice(42, 2.25, 42, 2.50));
    	voices.add(new Voice(42, 2.75, 42, 3.00));
    	voices.add(new Voice(42, 3.25, 42, 4.00));

		voices.add(new Voice(43, 0.25, 43, 1.00));
    	voices.add(new Voice(43, 1.25, 43, 1.75));
    	voices.add(new Voice(43, 2.25, 43, 2.75));
    	voices.add(new Voice(43, 3.25, 43, 3.50));
    	
    	
    	// same as 46 and 47
		voices.add(new Voice(44, 0.25, 44, 0.50));
		voices.add(new Voice(44, 0.75, 44, 1.00));
    	voices.add(new Voice(44, 1.25, 44, 1.50));
    	voices.add(new Voice(44, 1.75, 44, 2.50));
    	voices.add(new Voice(44, 2.75, 44, 3.00));
    	voices.add(new Voice(44, 3.25, 44, 3.50));
    	voices.add(new Voice(44, 3.75, 44, 4.00));

		voices.add(new Voice(45, 0.25, 45, 1.00));
    	voices.add(new Voice(45, 1.25, 45, 2.50));
    	voices.add(new Voice(45, 2.75, 45, 3.00));
    	voices.add(new Voice(45, 3.25, 45, 3.50));

    	// same as 44 and 45
		voices.add(new Voice(46, 0.25, 46, 0.50));
		voices.add(new Voice(46, 0.75, 46, 1.00));
    	voices.add(new Voice(46, 1.25, 46, 1.50));
    	voices.add(new Voice(46, 1.75, 46, 2.50));
    	voices.add(new Voice(46, 2.75, 46, 3.00));
    	voices.add(new Voice(46, 3.25, 46, 3.50));
    	voices.add(new Voice(46, 3.75, 46, 4.00));

		voices.add(new Voice(47, 0.25, 47, 1.00));
    	voices.add(new Voice(47, 1.25, 47, 2.50));
    	voices.add(new Voice(47, 2.75, 47, 3.00));
    	voices.add(new Voice(47, 3.25, 47, 3.50));

		voices.add(new Voice(48, 0.25, 48, 0.50));
		voices.add(new Voice(48, 0.75, 48, 1.50));
    	voices.add(new Voice(48, 1.75, 48, 2.50));
    	voices.add(new Voice(48, 2.75, 48, 3.00));
    	voices.add(new Voice(48, 3.25, 48, 3.75));

		voices.add(new Voice(49, 0.25, 49, 1.00));
    	voices.add(new Voice(49, 1.25, 49, 2.00));
    	voices.add(new Voice(49, 2.25, 49, 3.00));
    	voices.add(new Voice(49, 3.25, 49, 10.00));

   	
		return voices;
	}




}
