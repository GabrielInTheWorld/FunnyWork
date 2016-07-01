package com.gmt.components;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JComponent;

public class ImageContainer extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Image image;
	private int width, height;
	private int x, y;

	public ImageContainer(Image image, int width, int height, int x, int y) {
		this.image = image;
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(image, x, y, getWidth(), getHeight(), this);
	}
}
