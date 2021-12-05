package com.solvd.bankingandinsurance.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<T> {

	private static final Logger log = LogManager.getLogger(LinkedList.class.getName());
	private Node<T> first = null;

	public void add(Node<T> node) {
		node.setNext(first);
		first = node;
	}

	public void remove() {
		if (first.getNext() != null)
			first = first.getNext();
		else
			first = null;
	}

	private void printList(Node<T> node) {
		log.debug("Node is " + node.getValue());
		if (node.getNext() != null)
			printList(node.getNext());
	}

	public void print() {
		printList(first);
	}
	

}