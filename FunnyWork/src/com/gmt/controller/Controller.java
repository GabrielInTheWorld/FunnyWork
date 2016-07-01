package com.gmt.controller;

import com.gmt.model.Model;
import com.gmt.view.FatherFrame;
import com.gmt.view.Screen;

/**
 * Class to control every job
 * 
 * @author Gabriel Meyer
 *
 */
public class Controller {

	private Model model;
	private Screen screen;
	private FatherFrame father;

	public Controller() {
		model = new Model();
		screen = new Screen(model);
		father = new FatherFrame(model, screen);
	}

	public void simulate() {
		father.start();
	}
}
