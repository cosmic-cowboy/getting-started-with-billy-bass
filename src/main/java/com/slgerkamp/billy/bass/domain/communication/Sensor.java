package com.slgerkamp.billy.bass.domain.communication;

import java.io.IOException;

import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinState;
import com.slgerkamp.billy.bass.infra.gpio.DigitalOutputPinController;

public class Sensor {
	
	private final GpioPinDigitalInput mic;
	private final DigitalOutputPinController head;
	private final DigitalOutputPinController tail;
	private final DigitalOutputPinController mouth;

	private boolean isRec = false;

	public Sensor(
			GpioPinDigitalInput mic,
			DigitalOutputPinController mouth,
			DigitalOutputPinController tail,
			DigitalOutputPinController head) {
		this.mic = mic;
		this.mouth = mouth;
		this.tail = tail;
		this.head = head;
	}
	
	public void getInfo(int interval) throws InterruptedException, IOException {
		while(true) {
			
			new Speaker(mouth, tail, head).fetch();
			
			System.out.print("mic state : " + mic.getState());
			System.out.print(", rec state : " + isRec);
			System.out.println(", timestamp : " + System.currentTimeMillis());
						
			if(isRec == false && mic.getState().equals(PinState.LOW)) {
				isRec = true;
				new Recorder(mouth, tail, head).record();
				isRec = false;
			}

			Thread.sleep(interval);
		}
	}


}
