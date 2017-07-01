package com.slgerkamp.billy.bass.controller;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.Pin;

public interface Controller {

	public void getController(final GpioController gpio, final Pin inputPin) throws InterruptedException;
}
