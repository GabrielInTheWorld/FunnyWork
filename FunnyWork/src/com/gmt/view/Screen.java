package com.gmt.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JComponent;

import com.gmt.model.Model;

/**
 * Class to show the screen
 * 
 * @author Gabriel Meyer
 *
 */
public class Screen extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Model model;
	private Dimension size;

	private Image image;

	public Screen(Model model) {
		this.model = model;
		initComponent();
	}

	private void initComponent() {
		size = new Dimension(model.getWidth(), model.getHeight());
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public Dimension getPreferredSize() {
		return size;
	}

	@Override
	public void paintComponent(Graphics g) {
		if (image != null) {
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
}
