package com.gmt.model;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Toolbar extends JMenuBar {

	public Toolbar() {
		initComponent();
	}

	private void initComponent() {
		add(getFileMenu());
	}

	private JMenu getFileMenu() {
		JMenu menu = new JMenu("File");
		JMenuItem getNew = new JMenuItem("Neu");

		menu.add(getNew);
		JMenuItem editer = new JMenuItem("Bearbeiten");

		menu.add(editer);
		menu.addSeparator();
		JMenuItem adder = new JMenuItem("Bilder hinzufügen");

		menu.add(adder);
		return menu;
	}
}
