package com.gmt.view;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.gmt.components.Square;

public class AnimateWindow extends Frame implements Runnable {

	private Square rect;
	private volatile int height, increaseSize;
	private boolean isInterrupted = false;

	public AnimateWindow() {
		setSize(200, 800);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		rect = new Square(50);
		increaseSize = 10;
		height = getHeight();

		setVisible(true);
	}

	@Override
	public void run() {
		System.out.println("run-Methode");
		while (!isInterrupted) {
			if (height + rect.height >= 0) {
				increaseSize = -10;
			} else if (height <= getHeight()) {
				increaseSize = 10;
			}
			height += increaseSize;
			repaint();
		}

	}

	@Override
	public void paint(Graphics g) {
		System.out.println("paint");
		g.setColor(Color.RED);
		// g.fillRect((getWidth() - (int) rect.getWidth()) / 2, height,
		// rect.width, rect.height);
		g.fillRect(0, height, getWidth(), 50);
	}
}
