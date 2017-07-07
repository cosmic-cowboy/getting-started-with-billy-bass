package com.slgerkamp.billy.bass.domain.music.song;

import java.util.ArrayList;

import com.slgerkamp.billy.bass.infra.sound.music.Measures;
import com.slgerkamp.billy.bass.infra.sound.music.TempoMap;
import com.slgerkamp.billy.bass.infra.sound.music.TimeSign;
import com.slgerkamp.billy.bass.infra.sound.music.Voice;

public class Aliens implements Song {

	public Measures measures() {
		return new Measures(new TimeSign(4), new TempoMap(85));
	}

	public ArrayList<Voice> songForTail() {
		ArrayList<Voice> list = new ArrayList<Voice>();
		return list;
	}

	public ArrayList<Voice> songForHead() {
		ArrayList<Voice> list = new ArrayList<Voice>();
		list.add(new Voice(31, 3, 49, 0));
		return list;
	}

	public ArrayList<Voice> songForMouth() {
		ArrayList<Voice> voices = new ArrayList<Voice>();

		// A mero
		voices.add(new Voice(9, 0.0, 9, 0.3));
		voices.add(new Voice(9, 0.5, 9, 0.8));
		voices.add(new Voice(9, 1.0, 9, 1.3));
		voices.add(new Voice(9, 1.5, 9, 2.8));
		voices.add(new Voice(9, 3.00, 9, 3.10));
		voices.add(new Voice(9, 3.25, 9, 3.8));

		voices.add(new Voice(10, 0.0, 10, 0.3));
		voices.add(new Voice(10, 0.5, 10, 0.8));
		voices.add(new Voice(10, 3.00, 10, 3.10));
		voices.add(new Voice(10, 3.25, 10, 3.35));
		voices.add(new Voice(10, 3.50, 10, 3.60));
		voices.add(new Voice(10, 3.75, 10, 3.85));

		voices.add(new Voice(11, 1.0, 11, 2.3));
		voices.add(new Voice(11, 2.5, 11, 2.8));
		voices.add(new Voice(11, 2.8, 11, 3.5));

//		voices.add(new Voice(12, 0.00, 12, 0.50));
		voices.add(new Voice(12, 0.00, 12, 0.20));
		voices.add(new Voice(12, 0.30, 12, 0.50));
		voices.add(new Voice(12, 0.75, 12, 1.30));
		voices.add(new Voice(12, 1.50, 12, 1.60));
		voices.add(new Voice(12, 1.75, 12, 2.30));
		voices.add(new Voice(12, 2.50, 12, 2.60));
		voices.add(new Voice(12, 2.75, 12, 3.30));
		voices.add(new Voice(12, 3.50, 12, 3.60));
		voices.add(new Voice(12, 3.75, 12, 5.80));

		voices.add(new Voice(14, 0.00, 14, 0.30));
		voices.add(new Voice(14, 0.50, 14, 2.30));
		voices.add(new Voice(14, 2.50, 14, 3.30));
		voices.add(new Voice(14, 3.50, 14, 3.60));
		voices.add(new Voice(14, 3.75, 14, 5.80));

		// A mero
		voices.add(new Voice(17, 0.0, 17, 0.3));
		voices.add(new Voice(17, 0.5, 17, 0.8));
		voices.add(new Voice(17, 1.0, 17, 1.3));
		voices.add(new Voice(17, 1.5, 17, 2.8));
		voices.add(new Voice(17, 3.00, 17, 3.10));
		voices.add(new Voice(17, 3.25, 17, 3.8));

		voices.add(new Voice(18, 0.00, 18, 0.10));
		voices.add(new Voice(18, 0.25, 18, 0.35));
		voices.add(new Voice(18, 0.50, 18, 0.80));
		voices.add(new Voice(18, 2.75, 18, 2.85));
		voices.add(new Voice(18, 3.00, 18, 3.10));
		voices.add(new Voice(18, 3.25, 18, 3.35));
		voices.add(new Voice(18, 3.50, 18, 3.60));
		voices.add(new Voice(18, 3.75, 18, 4.80));

		voices.add(new Voice(19, 1.0, 19, 2.3));
		voices.add(new Voice(19, 2.5, 19, 2.8));
		voices.add(new Voice(19, 3.0, 19, 3.8));

		voices.add(new Voice(20, 0.00, 20, 0.30));
		voices.add(new Voice(20, 0.50, 20, 0.60));
		voices.add(new Voice(20, 0.75, 20, 1.10));
		voices.add(new Voice(20, 1.25, 20, 1.35));
		voices.add(new Voice(20, 1.50, 20, 1.60));
		voices.add(new Voice(20, 1.75, 20, 2.10));
		voices.add(new Voice(20, 2.25, 20, 2.35));
		voices.add(new Voice(20, 2.50, 20, 2.60));
		voices.add(new Voice(20, 2.75, 20, 3.30));
		voices.add(new Voice(20, 3.50, 20, 3.60));
		voices.add(new Voice(20, 3.75, 20, 5.80));

		voices.add(new Voice(22, 0.00, 22, 0.30));
		voices.add(new Voice(22, 0.50, 22, 2.30));
		voices.add(new Voice(22, 2.50, 22, 3.30));
		voices.add(new Voice(22, 3.50, 22, 3.60));
		voices.add(new Voice(22, 3.75, 22, 5.80));
		
		// B mero
		voices.add(new Voice(23, 3.00, 23, 3.10));
		voices.add(new Voice(23, 3.25, 23, 3.35));
		voices.add(new Voice(23, 3.50, 23, 4.30));

		voices.add(new Voice(24, 0.50, 24, 0.60));
		voices.add(new Voice(24, 0.75, 24, 1.30));
		voices.add(new Voice(24, 1.50, 24, 1.60));
		voices.add(new Voice(24, 1.75, 24, 2.10));
		voices.add(new Voice(24, 2.25, 24, 2.80));
		voices.add(new Voice(24, 3.00, 24, 3.80));

		voices.add(new Voice(25, 3.00, 25, 3.10));
		voices.add(new Voice(25, 3.25, 25, 3.35));
		voices.add(new Voice(25, 3.50, 25, 4.30));

		voices.add(new Voice(26, 0.50, 26, 0.60));
		voices.add(new Voice(26, 0.75, 26, 1.30));
		voices.add(new Voice(26, 1.50, 26, 1.60));
		voices.add(new Voice(26, 1.75, 26, 2.50));
		voices.add(new Voice(26, 2.75, 26, 3.80));

		voices.add(new Voice(28, 2.00, 28, 2.30));
		voices.add(new Voice(28, 2.50, 28, 2.80));
		voices.add(new Voice(28, 3.00, 28, 3.30));
		voices.add(new Voice(28, 3.50, 28, 4.30));

		voices.add(new Voice(29, 1.00, 29, 1.30));
		voices.add(new Voice(29, 1.50, 29, 2.80));

		voices.add(new Voice(30, 0.00, 30, 0.30));
		voices.add(new Voice(30, 0.50, 30, 0.60));
		voices.add(new Voice(30, 0.75, 30, 0.85));
		voices.add(new Voice(30, 1.00, 30, 1.50));
		voices.add(new Voice(30, 1.75, 30, 1.85));
		voices.add(new Voice(30, 2.00, 30, 2.10));
		voices.add(new Voice(30, 2.25, 30, 2.80));
		voices.add(new Voice(30, 3.00, 30, 3.50));
		voices.add(new Voice(30, 3.75, 30, 3.80));

		voices.add(new Voice(31, 0.00, 31, 0.50));
		voices.add(new Voice(31, 0.75, 31, 0.85));
		voices.add(new Voice(31, 1.00, 31, 1.10));
		voices.add(new Voice(31, 1.25, 31, 1.80));
		voices.add(new Voice(31, 2.00, 31, 2.80));
		voices.add(new Voice(31, 3.00, 31, 3.80));

		// サビ1 start 
		voices.add(new Voice(32, 0.0, 32, 0.8));
		voices.add(new Voice(32, 1.0, 32, 1.8));
		voices.add(new Voice(32, 2.0, 32, 2.8));
		voices.add(new Voice(32, 3.0, 32, 3.3));
		voices.add(new Voice(32, 3.5, 32, 4.3));

		voices.add(new Voice(33, 0.5, 33, 0.8));
		voices.add(new Voice(33, 1.0, 33, 1.3));
		voices.add(new Voice(33, 1.5, 33, 2.3));
		voices.add(new Voice(33, 2.5, 33, 2.8));
		voices.add(new Voice(33, 3.5, 33, 3.8));
		// サビ1 end

		
		voices.add(new Voice(34, 0.0, 34, 0.3));
		voices.add(new Voice(34, 0.5, 34, 0.8));
		voices.add(new Voice(34, 1.0, 34, 1.3));
		voices.add(new Voice(34, 1.5, 34, 1.8));
		voices.add(new Voice(34, 2.0, 34, 2.8));
		voices.add(new Voice(34, 3.0, 34, 3.3));
		voices.add(new Voice(34, 3.5, 34, 3.8));

		voices.add(new Voice(35, 0.0, 35, 0.8));
		voices.add(new Voice(35, 1.0, 35, 1.3));
		voices.add(new Voice(35, 1.5, 35, 3.3));

		voices.add(new Voice(36, 0.5, 36, 0.8));
		voices.add(new Voice(36, 1.0, 36, 1.3));
		voices.add(new Voice(36, 1.5, 36, 1.8));
		voices.add(new Voice(36, 2.0, 36, 2.8));
		voices.add(new Voice(36, 3.0, 36, 3.3));
		voices.add(new Voice(36, 3.5, 36, 4.3));

		voices.add(new Voice(37, 1.5, 37, 1.8));
		voices.add(new Voice(37, 2.0, 37, 2.3));
		voices.add(new Voice(37, 2.5, 37, 4.3));

		voices.add(new Voice(38, 0.5, 38, 2.8));

		// サビ1 start 
		voices.add(new Voice(40, 0.0, 40, 0.8));
		voices.add(new Voice(40, 1.0, 40, 1.8));
		voices.add(new Voice(40, 2.0, 40, 2.8));
		voices.add(new Voice(40, 3.0, 40, 3.3));
		voices.add(new Voice(40, 3.5, 40, 4.3));

		voices.add(new Voice(41, 0.5, 41, 0.8));
		voices.add(new Voice(41, 1.0, 41, 1.3));
		voices.add(new Voice(41, 1.5, 41, 2.3));
		voices.add(new Voice(41, 2.5, 41, 2.8));
		voices.add(new Voice(41, 3.5, 41, 3.8));
		// サビ1 end

		voices.add(new Voice(42, 0.0, 42, 0.3));
		voices.add(new Voice(42, 0.5, 42, 1.3));
		voices.add(new Voice(42, 1.5, 42, 1.8));
		voices.add(new Voice(42, 2.0, 42, 2.8));
		voices.add(new Voice(42, 3.0, 42, 3.3));
		voices.add(new Voice(42, 3.5, 42, 3.8));
	
		voices.add(new Voice(43, 0.0, 43, 0.3));
		voices.add(new Voice(43, 0.5, 43, 0.8));
		voices.add(new Voice(43, 1.0, 43, 1.3));
		voices.add(new Voice(43, 1.5, 43, 3.3));

		voices.add(new Voice(44, 0.5, 44, 0.8));
		voices.add(new Voice(44, 1.0, 44, 1.8));
		voices.add(new Voice(44, 2.0, 44, 2.8));
		voices.add(new Voice(44, 3.0, 44, 3.3));
		voices.add(new Voice(44, 3.5, 44, 4.3));

		voices.add(new Voice(45, 0.5, 45, 1.8));
		voices.add(new Voice(45, 2.0, 45, 2.8));
		voices.add(new Voice(45, 3.0, 45, 3.8));

		voices.add(new Voice(46, 0.0, 46, 0.3));
		voices.add(new Voice(46, 0.5, 46, 3.8));
	
		voices.add(new Voice(47, 2.0, 47, 2.3));
		voices.add(new Voice(47, 2.5, 47, 3.3));
		voices.add(new Voice(47, 3.5, 47, 7.8));

		return voices;
	}




}
