package com.gmt.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

public class SquareComponent extends Component implements Runnable {

	private int height;
	private volatile boolean interrupted;

	public SquareComponent() {
		height = getHeight();
		interrupted = false;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
			while (!interrupted) {

				Thread.sleep(100);
				repaint();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Dimension getMinimumSize() {
		return new Dimension(100, 600);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(100, 600);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		// g.fillRect(25, height, 50, 50);
		g.drawLine(50, 200, 100, 200);
	}
}
