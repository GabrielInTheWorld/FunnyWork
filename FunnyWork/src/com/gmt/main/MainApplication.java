package com.gmt.main;

import com.gmt.controller.Controller;

public class MainApplication {

	public MainApplication() {
		Controller c = new Controller();
		c.simulate();
	}

	public static void main(String[] args) {
		new MainApplication();
	}

}
