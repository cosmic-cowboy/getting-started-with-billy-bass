package com.slgerkamp.billy.bass.domain.sound.music;

public class Voice {

	public final int startMeasure;
	public final double startBeat;
	public final int endMeasure;
	public final double endBeat;

	public Voice(int startMeasure, double startBeat, int endMeasure, double endBeat) {
		this.startMeasure = startMeasure;
		this.startBeat = startBeat;
		this.endMeasure = endMeasure;
		this.endBeat = endBeat;
	}
}
