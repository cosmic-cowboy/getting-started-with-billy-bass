package com.slgerkamp.billy.bass;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.RaspiPin;
import com.slgerkamp.billy.bass.controller.DigitalOutputPinController;
import com.slgerkamp.billy.bass.domain.sound.music.Performance;
import com.slgerkamp.billy.bass.domain.sound.rec.Record;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {

//		record();
    		
    	callMusician();
//		call();
	}

	private static void record() {
		final Record recorder = new Record();

		// creates a new thread that waits for a specified
		// of time before stopping
		Thread stopper = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(Record.RECORD_MILLISECOND);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				recorder.finish();
			}
		});

		stopper.start();

		// start recording
		recorder.start();
	}

    public static void callMusician() throws InterruptedException {
		// get a handle to the GPIO controller
    	final GpioController gpio = GpioFactory.getInstance();

        // creating the pin with parameter PinState.HIGH
        // will instantly power up the pin
    	final DigitalOutputPinController mouth = new DigitalOutputPinController(gpio, RaspiPin.GPIO_25);
    	final DigitalOutputPinController tail = new DigitalOutputPinController(gpio, RaspiPin.GPIO_27);    	
    	final DigitalOutputPinController head = new DigitalOutputPinController(gpio, RaspiPin.GPIO_06);

    	Performance performance = new Performance(head, tail, mouth);
    	performance.play();
    	
    	Thread.sleep(1000);
    	head.low();
    	tail.low();
    	mouth.low();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // release the GPIO controller resources
        gpio.shutdown();
	}

	public static void call() throws InterruptedException {
		// get a handle to the GPIO controller
    	final GpioController gpio = GpioFactory.getInstance();
        
        // creating the pin with parameter PinState.HIGH
        // will instantly power up the pin
    	final DigitalOutputPinController head = new DigitalOutputPinController(gpio, RaspiPin.GPIO_27);
    	final DigitalOutputPinController mouth = new DigitalOutputPinController(gpio, RaspiPin.GPIO_25);
    	for(int i = 0; i < 5; i++) {
        	mouth.call(250);
        	head.call(250);
    	}

    	
        // release the GPIO controller resources
        gpio.shutdown();
	}

}
