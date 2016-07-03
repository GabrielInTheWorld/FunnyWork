package com.gmt.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.gmt.components.SearchTree;
import com.gmt.view.AnimateWindow;

public class Toolbar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Toolbar() {
		initComponent();
	}

	private void initComponent() {
		add(getFileMenu());
		add(getPremiumMenu());
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

	private JMenu getPremiumMenu() {
		JMenu menu = new JMenu("Specials");

		JMenuItem getAnimWindow = new JMenuItem("Zeig Animationsfenster");
		getAnimWindow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AnimateWindow w = new AnimateWindow();
				Thread t = new Thread(w);
				t.start();
			}
		});
		menu.add(getAnimWindow);

		JMenuItem showTree = new JMenuItem("Zeige Suchbaum");
		showTree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SearchTree<Integer> t = new SearchTree<Integer>();
				for (int i = 0; i < 100; ++i) {
					int rand = (int) (Math.random() * 100);
					t.insert(rand);
				}
				t.printInorder();
			}
		});

		return menu;
	}
}
