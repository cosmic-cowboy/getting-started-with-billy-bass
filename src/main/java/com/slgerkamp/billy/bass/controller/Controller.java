package com.slgerkamp.billy.bass.controller;

public interface Controller {
	
	public void call(final int interval) throws InterruptedException;

	public void toggle() throws InterruptedException;

	public void high() throws InterruptedException;
	
	public void low() throws InterruptedException;
}
