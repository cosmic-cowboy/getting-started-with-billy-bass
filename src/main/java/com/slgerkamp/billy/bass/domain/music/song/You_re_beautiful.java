package com.slgerkamp.billy.bass.domain.music.song;

import java.util.ArrayList;

import com.slgerkamp.billy.bass.infra.sound.music.Measures;
import com.slgerkamp.billy.bass.infra.sound.music.TempoMap;
import com.slgerkamp.billy.bass.infra.sound.music.TimeSign;
import com.slgerkamp.billy.bass.infra.sound.music.Voice;

public class You_re_beautiful implements Song {

	public Measures measures() {
		return new Measures(new TimeSign(4), new TempoMap(82));
	}

	public ArrayList<Voice> songForHead() {
		ArrayList<Voice> voices = new ArrayList<Voice>();
    	voices.add(new Voice(19, 3.00, 30, 0.00));
		return voices;
	}

	public ArrayList<Voice> songForTail() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Voice> songForMouth() {
		ArrayList<Voice> voices = new ArrayList<Voice>();
		
    	voices.add(new Voice(8, 0.50, 8, 0.80));
    	voices.add(new Voice(8, 1.00, 8, 1.10));
    	voices.add(new Voice(8, 1.25, 8, 1.50));
    	voices.add(new Voice(8, 1.75, 8, 1.85));
    	voices.add(new Voice(8, 2.00, 8, 2.10));
    	voices.add(new Voice(8, 2.25, 8, 2.80));

    	voices.add(new Voice(12, 0.50, 12, 0.80));
    	voices.add(new Voice(12, 1.00, 12, 1.10));
    	voices.add(new Voice(12, 1.25, 12, 1.50));
    	voices.add(new Voice(12, 1.75, 12, 1.85));
    	voices.add(new Voice(12, 2.00, 12, 2.10));
    	voices.add(new Voice(12, 2.25, 12, 2.80));

    	voices.add(new Voice(13, 0.50, 13, 0.80));
    	voices.add(new Voice(13, 1.00, 13, 1.10));
    	voices.add(new Voice(13, 1.25, 13, 1.50));
    	voices.add(new Voice(13, 1.75, 13, 1.85));
    	voices.add(new Voice(13, 2.00, 13, 2.80));

    	voices.add(new Voice(14, 0.50, 14, 0.80));
    	voices.add(new Voice(14, 1.00, 14, 1.30));
    	voices.add(new Voice(14, 1.50, 14, 1.60));
    	voices.add(new Voice(14, 1.75, 14, 1.85));
    	voices.add(new Voice(14, 2.00, 14, 2.10));
    	voices.add(new Voice(14, 2.25, 14, 2.80));

    	voices.add(new Voice(15, 0.50, 15, 0.80));
    	voices.add(new Voice(15, 1.00, 15, 1.10));
    	voices.add(new Voice(15, 1.25, 15, 1.35));
    	voices.add(new Voice(15, 1.50, 15, 2.80));
    	voices.add(new Voice(15, 3.00, 15, 3.30));
    	voices.add(new Voice(15, 3.50, 15, 3.80));

    	voices.add(new Voice(16, 0.00, 16, 0.10));
    	voices.add(new Voice(16, 0.25, 16, 0.35));
    	voices.add(new Voice(16, 0.50, 16, 0.60));
    	voices.add(new Voice(16, 0.75, 16, 0.85));
    	voices.add(new Voice(16, 1.00, 16, 1.10));
    	voices.add(new Voice(16, 1.25, 16, 1.80));
    	voices.add(new Voice(16, 3.50, 16, 3.60));
    	voices.add(new Voice(16, 3.75, 16, 3.85));

    	voices.add(new Voice(17, 0.00, 17, 0.10));
    	voices.add(new Voice(17, 0.15, 17, 0.25));
    	voices.add(new Voice(17, 0.30, 17, 0.40));
    	voices.add(new Voice(17, 0.50, 17, 0.60));
    	voices.add(new Voice(17, 0.75, 17, 0.85));
    	voices.add(new Voice(17, 1.00, 17, 1.80));
    	voices.add(new Voice(17, 3.50, 17, 3.60));
    	voices.add(new Voice(17, 3.75, 17, 3.85));

    	voices.add(new Voice(18, 0.00, 18, 0.10));
    	voices.add(new Voice(18, 0.25, 18, 0.60));
    	voices.add(new Voice(18, 0.75, 18, 0.85));
    	voices.add(new Voice(18, 1.00, 18, 1.80));
    	voices.add(new Voice(18, 2.00, 18, 2.10));
    	voices.add(new Voice(18, 2.25, 18, 2.60));
    	voices.add(new Voice(18, 2.75, 18, 2.85));
    	voices.add(new Voice(18, 3.00, 18, 3.30));
    	voices.add(new Voice(18, 3.50, 18, 3.60));
    	voices.add(new Voice(18, 3.75, 18, 3.85));

    	voices.add(new Voice(19, 0.00, 19, 0.30));
    	voices.add(new Voice(19, 0.50, 19, 0.80));
    	voices.add(new Voice(19, 1.00, 19, 1.30));
    	voices.add(new Voice(19, 1.50, 19, 2.80));

    	voices.add(new Voice(20, 0.50, 20, 0.80));
    	voices.add(new Voice(20, 1.00, 20, 1.10));
    	voices.add(new Voice(20, 1.25, 20, 1.55));
    	voices.add(new Voice(20, 1.75, 20, 2.80));

    	voices.add(new Voice(21, 0.50, 21, 0.80));
    	voices.add(new Voice(21, 1.00, 21, 1.10));
    	voices.add(new Voice(21, 1.25, 21, 1.55));
    	voices.add(new Voice(21, 1.75, 21, 2.80));

    	voices.add(new Voice(22, 0.50, 22, 0.80));
    	voices.add(new Voice(22, 1.00, 22, 1.10));
    	voices.add(new Voice(22, 1.25, 22, 1.55));
    	voices.add(new Voice(22, 1.75, 22, 2.30));
    	voices.add(new Voice(22, 2.50, 22, 3.30));
    	voices.add(new Voice(22, 3.50, 22, 4.80));

    	voices.add(new Voice(23, 3.50, 23, 3.60));
    	voices.add(new Voice(23, 3.75, 23, 4.30));

    	voices.add(new Voice(24, 0.50, 24, 0.80));
    	voices.add(new Voice(24, 1.00, 24, 1.80));
    	voices.add(new Voice(24, 3.50, 24, 3.60));
    	voices.add(new Voice(24, 3.75, 24, 3.85));

    	// 2/4
    	voices.add(new Voice(25, 0.00, 25, 0.30));
    	voices.add(new Voice(25, 0.50, 25, 1.30));
    	voices.add(new Voice(25, 1.50, 25, 2.80));

    	// 26 = 25.5
//    	voices.add(new Voice(26, 3.50, 26, 3.60));
//    	voices.add(new Voice(26, 3.75, 26, 3.85));
    	voices.add(new Voice(26, 1.50, 26, 1.60));
    	voices.add(new Voice(26, 1.75, 26, 1.85));
    	
    	voices.add(new Voice(26, 2.00, 26, 2.30));
    	voices.add(new Voice(26, 2.50, 26, 3.30));
    	voices.add(new Voice(26, 3.50, 26, 4.30));

    	// 27 = 26.5
//    	voices.add(new Voice(27, 0.00, 27, 0.30));
//    	voices.add(new Voice(27, 0.50, 27, 1.30));
//    	voices.add(new Voice(27, 1.50, 27, 2.30));

//    	voices.add(new Voice(27, 2.50, 27, 3.30));
//    	voices.add(new Voice(27, 3.50, 27, 4.80));
    	
    	voices.add(new Voice(27, 0.50, 27, 1.30));
    	voices.add(new Voice(27, 1.50, 27, 2.80));

    	// 28 = 27.5
//    	voices.add(new Voice(28, 3.00, 28, 3.10));
//    	voices.add(new Voice(28, 3.25, 28, 3.55));
//    	voices.add(new Voice(28, 3.75, 28, 4.30));
    	voices.add(new Voice(28, 1.00, 28, 1.10));
    	voices.add(new Voice(28, 1.25, 28, 1.55));
    	voices.add(new Voice(28, 1.75, 28, 2.30));

    	voices.add(new Voice(28, 2.50, 28, 3.30));
    	voices.add(new Voice(28, 3.50, 28, 4.30));

    	// 29 = 28.5
//    	voices.add(new Voice(29, 0.50, 29, 1.30));
//    	voices.add(new Voice(29, 1.50, 29, 2.30));

//    	voices.add(new Voice(29, 2.50, 29, 3.30));
//    	voices.add(new Voice(29, 3.50, 29, 4.80));

    	voices.add(new Voice(29, 0.50, 29, 1.30));
    	voices.add(new Voice(29, 1.50, 29, 2.80));

		return voices;
	}



}
