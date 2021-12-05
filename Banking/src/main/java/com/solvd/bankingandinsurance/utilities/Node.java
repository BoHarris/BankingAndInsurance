package com.solvd.bankingandinsurance.utilities;


public class Node<T> {
	private T value;
	private Node<T> next;

	public Node(T value) {
		this.value = value;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getNext() {
		return next;
	}

	public T getValue() {
		return value;
	}
}