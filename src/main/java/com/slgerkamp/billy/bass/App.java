package com.slgerkamp.billy.bass;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.RaspiPin;
import com.slgerkamp.billy.bass.controller.LEDController;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
    	
        // get a handle to the GPIO controller
    	final GpioController gpio = GpioFactory.getInstance();
        
        // creating the pin with parameter PinState.HIGH
        // will instantly power up the pin
        new LEDController().getLEDController(gpio, RaspiPin.GPIO_01);
        
        // release the GPIO controller resources
        gpio.shutdown();
    }

}
