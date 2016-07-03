package com.gmt.components;

public class SearchTree<T extends Comparable<T>> {

	int key = 0;

	class Node {
		T value;
		int key;

		Node left, right;

		public Node(T value, int key) {
			this.value = value;
			this.key = key;

			left = null;
			right = null;
		}

		public T getValue() {
			return value;
		}
	}

	public SearchTree() {
		root = null;
	}

	public void insert(T value) {
		if (root == null) {
			root = new Node(value, key++);
		}
		insert(value, root);
	}

	private void insert(T value, Node node) {
		if (node == null) {
			node = new Node(value, key++);
		} else if (value.compareTo(node.value) > 0) {
			insert(value, node.right);
		} else if (value.compareTo(node.value) < 0) {
			insert(value, node.left);
		} else {
			return;
		}

	}

	public Node search(T value) {
		if (value == null) {
			return null;
		} else {
			return search(value, root);
		}
	}

	private Node search(T value, Node node) {
		if (value.compareTo(node.value) > 0) {
			return search(value, node.right);
		} else if (value.compareTo(node.value) < 0) {
			return search(value, node.left);
		} else
			return null;
	}

	public void printInorder() {

	}

	private Node root;

}
