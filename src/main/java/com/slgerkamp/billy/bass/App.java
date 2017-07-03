package com.slgerkamp.billy.bass;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.RaspiPin;
import com.slgerkamp.billy.bass.controller.DigitalOutputPinController;
import com.slgerkamp.billy.bass.domain.sound.song.Performance;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
		// get a handle to the GPIO controller
//    	final GpioController gpio = GpioFactory.getInstance();
//
//        // creating the pin with parameter PinState.HIGH
//        // will instantly power up the pin
//    	final DigitalOutputPinController mouth = new DigitalOutputPinController(gpio, RaspiPin.GPIO_25);
//
//    	Performance performance = new Performance(mouth);
//    	performance.play(System.currentTimeMillis());
//    	mouth.low();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // release the GPIO controller resources
//        gpio.shutdown();

		call();
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
