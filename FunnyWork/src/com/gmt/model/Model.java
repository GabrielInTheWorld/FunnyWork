package com.gmt.model;

import java.awt.Dimension;

/**
 * Class to manage the dimension of layout and window
 * 
 * @author Gabriel Meyer
 *
 */
public class Model {

	private int screenHeight = 600;
	private int screenWidth = 800;
	private Dimension sPanelSize = new Dimension(screenWidth, 60);

	public Dimension getSouthPanelSize() {
		return sPanelSize;
	}

	public int getWidth() {
		return screenWidth;
	}

	public int getHeight() {
		return screenHeight;
	}
}
