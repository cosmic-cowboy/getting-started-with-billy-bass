package com.slgerkamp.billy.bass;

import java.io.IOException;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.slgerkamp.billy.bass.domain.communication.Sensor;
import com.slgerkamp.billy.bass.domain.music.Performance;
import com.slgerkamp.billy.bass.infra.gpio.DigitalOutputPinController;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException, IOException {

    	if (args.length > 0) {
    		String s = args[0];
    		switch (Integer.valueOf(s)) {
			case 1:
		    	listen();
				break;
			case 2:
		    	callMusician();				
				break;
			case 3:
				call();				
				break;

			default:
				break;
			}
    			
    	}
	}


    public static void listen() throws InterruptedException, IOException {
		// get a handle to the GPIO controller
    	final GpioController gpio = GpioFactory.getInstance();
    	final GpioPinDigitalInput mic = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_DOWN);
    	final DigitalOutputPinController mouth = new DigitalOutputPinController(gpio, RaspiPin.GPIO_25);
    	final DigitalOutputPinController tail = new DigitalOutputPinController(gpio, RaspiPin.GPIO_27);    	
    	final DigitalOutputPinController head = new DigitalOutputPinController(gpio, RaspiPin.GPIO_06);
    	mouth.low();
    	tail.low();
    	head.low();
    	Sensor sensor = new Sensor(mic, mouth, tail, head);
    	sensor.getInfo(200);
    	Thread.sleep(10000);
        // release the GPIO controller resources
        gpio.shutdown();

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
    	final DigitalOutputPinController mouth = new DigitalOutputPinController(gpio, RaspiPin.GPIO_25);
    	final DigitalOutputPinController tail = new DigitalOutputPinController(gpio, RaspiPin.GPIO_27);    	
    	final DigitalOutputPinController head = new DigitalOutputPinController(gpio, RaspiPin.GPIO_06);
    	mouth.call(250);
    	head.call(250);
    	tail.call(250);
    	
        // release the GPIO controller resources
        gpio.shutdown();
	}

}
