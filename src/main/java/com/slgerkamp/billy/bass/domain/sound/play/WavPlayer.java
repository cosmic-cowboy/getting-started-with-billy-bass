package com.slgerkamp.billy.bass.domain.sound.play;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class WavPlayer implements Runnable {

	private final File file;

	public WavPlayer(File file) {
		this.file = file;
	}

	public void run() {
		try{
			AudioInputStream audio_input_stream = AudioSystem.getAudioInputStream(file);
			AudioFormat audio_format = audio_input_stream.getFormat();
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, audio_format, AudioSystem.NOT_SPECIFIED);
			SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
			line.open(audio_format, AudioSystem.NOT_SPECIFIED);
			line.start();
			int buffer_size = 128000;
			int bytes_read = 0;
			byte[] ab_data = new byte[buffer_size];
			while (bytes_read != -1) {
				bytes_read = audio_input_stream.read(ab_data, 0, ab_data.length);
				if (bytes_read >= 0) {
					System.out.println("music write : " + System.currentTimeMillis());
					line.write(ab_data, 0, bytes_read);
				}
			}
			System.out.println("music drain : " + System.currentTimeMillis());
			line.drain();
			line.close();

		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}		
	}
}


