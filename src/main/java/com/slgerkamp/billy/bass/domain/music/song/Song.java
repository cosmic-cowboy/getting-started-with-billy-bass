package com.slgerkamp.billy.bass.domain.music.song;

import java.util.ArrayList;

import com.slgerkamp.billy.bass.infra.sound.music.Measures;
import com.slgerkamp.billy.bass.infra.sound.music.Voice;

public interface Song {
	public Measures measures();
	public ArrayList<Voice> songForHead();
	public ArrayList<Voice> songForTail();
	public ArrayList<Voice> songForMouth();
}
