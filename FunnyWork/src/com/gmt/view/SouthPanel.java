package com.gmt.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import com.gmt.model.Model;

public class SouthPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Model model;
	private Dimension size;

	public SouthPanel(Model model) {
		this.model = model;
		initComponent();
	}

	public void initComponent() {
		setLayout(new FlowLayout());
		size = model.getSouthPanelSize();
	}

	@Override
	public Dimension getPreferredSize() {
		return size;
	}
}
