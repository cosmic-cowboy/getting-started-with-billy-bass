package com.slgerkamp.billy.bass.controller;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;

public class LEDController implements Controller {
	
	public void getController(GpioController gpio, Pin inputPin) throws InterruptedException {
		final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(inputPin, "PinLED", PinState.HIGH);
        System.out.println("light is: ON");
        
        // wait 2 seconds
        Thread.sleep(2000);
        
        // turn off GPIO 1
        pin.low();
        System.out.println("light is: OFF");
        // wait 1 second
        Thread.sleep(1000);
        // turn on GPIO 1 for 1 second and then off
        System.out.println("light is: ON for 1 second");
        pin.pulse(1000, true);
	}
}
