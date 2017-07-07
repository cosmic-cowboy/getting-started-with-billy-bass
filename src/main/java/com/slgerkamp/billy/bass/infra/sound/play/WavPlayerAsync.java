package com.slgerkamp.billy.bass.infra.sound.play;

import java.io.File;

public class WavPlayerAsync implements Runnable {

	private final File file;
	private boolean isFinished;

	public WavPlayerAsync(File file) {
		this.file = file;
	}

	public void run() {
		isFinished = new WavPlayer(file).play();
	}
	
	public boolean isFinished(){
		return isFinished;
	}
}


