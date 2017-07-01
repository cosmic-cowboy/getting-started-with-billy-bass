package com.slgerkamp.billy.bass.controller;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.Pin;
import com.pi4j.wiringpi.Gpio;
import com.pi4j.wiringpi.SoftPwm;

public class MotorController implements Controller {
	
	public void getController(GpioController gpio, Pin inputPin) throws InterruptedException {
		
		System.out.println("address : " + inputPin.getAddress());
		System.out.println("name : " + inputPin.getName());
		System.out.println("provider : " + inputPin.getProvider());

		Gpio.wiringPiSetup();
		SoftPwm.softPwmCreate(inputPin.getAddress(), 0, 100);
		setSpeed(inputPin, 25);
		setSpeed(inputPin, 50);
		setSpeed(inputPin, 100);
		setSpeed(inputPin, 0);
	}
		
	private void setSpeed(Pin inputPin, int speed) throws InterruptedException {
		System.out.println("Speed is set to " + speed + "%");
		// softPwmWrite(int pin, int value)
		// This updates the PWM value on the given pin. The value is checked to
		// be in-range and pins that haven't previously been initialized via 
		// softPwmCreate will be silently ignored.
		SoftPwm.softPwmWrite(inputPin.getAddress(), speed);
		// wait 3 seconds
		Thread.sleep(3000);
	}

}
