package com.gmt.view;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.gmt.components.ImageContainer;
import com.gmt.model.Model;

/**
 * Class for the whole window which will be shown
 * 
 * @author Gabriel Meyer
 *
 */
public class FatherFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Model model;
	private final Screen screen;
	private SouthPanel southPanel;
	private final String title = "Super krasses Game";

	private int x = 0;

	public FatherFrame(Model model, Screen screen) {
		this.model = model;
		this.screen = screen;
		southPanel = new SouthPanel(model);
		initComponents();
		setLocationRelativeTo(null);
	}

	private void initComponents() {
		setTitle(title);
		add(screen);
		// add(southPanel, BorderLayout.SOUTH);
		JScrollPane scrollPane = new JScrollPane(southPanel);
		add(scrollPane, BorderLayout.SOUTH);
		pack();
	}

	public void addImage(Image image) {
		southPanel.add(new ImageContainer(image, x, 0, southPanel.getWidth(), southPanel.getHeight()));
		x += 60;
	}

	public void start() {
		setVisible(true);
	}
}
