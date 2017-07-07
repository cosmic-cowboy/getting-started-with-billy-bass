package com.slgerkamp.billy.bass.infra.gpio;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;

public class DigitalOutputPinController implements Controller {

	private final GpioPinDigitalOutput pin;
	public DigitalOutputPinController(GpioController gpio, Pin inputPin) {
		pin = gpio.provisionDigitalOutputPin(inputPin, "PinLED", PinState.LOW);
	}

	public void call(int interval) throws InterruptedException {
		
        pin.high();
        System.out.println("status is: ON");

        Thread.sleep(interval);
        System.out.println("wait " + interval + " millseconds");

        pin.low();
        System.out.println("status is: OFF");

        Thread.sleep(interval);
        System.out.println("wait " + interval + " millseconds");
	}

	public void callAsync(int interval) throws InterruptedException {
		
        pin.high();
        System.out.println("status is: ON");

        Thread.sleep(interval);
        System.out.println("wait " + interval + " millseconds");

        pin.low();
        System.out.println("status is: OFF");

        Thread.sleep(interval);
        System.out.println("wait " + interval + " millseconds");
	}

	public void toggle() throws InterruptedException {
		pin.toggle();
        System.out.println("status changes");
	}
	
	public void high() throws InterruptedException {
        pin.high();
        System.out.println("status is: ON");
	}
	
	public void low() throws InterruptedException {
        pin.low();
        System.out.println("status is: OFF");
	}

	public boolean isHigh() throws InterruptedException {
        System.out.println("ishigh : " + pin.isHigh());
        return pin.isHigh();
	}

	public boolean isLow() throws InterruptedException {
        System.out.println("isLow : " + pin.isLow());
        return pin.isLow();
	}

}
