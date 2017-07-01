package com.slgerkamp.billy.bass;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.RaspiPin;
import com.slgerkamp.billy.bass.controller.MotorController;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
    	for(int i = 0; i < 2; i++) {
            createController();    		
    	}
    }

	private static void createController() throws InterruptedException {
		// get a handle to the GPIO controller
    	final GpioController gpio = GpioFactory.getInstance();
        
        // creating the pin with parameter PinState.HIGH
        // will instantly power up the pin
        new MotorController().getController(gpio, RaspiPin.GPIO_26);

        // release the GPIO controller resources
        gpio.shutdown();
	}

}
