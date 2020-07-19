package com.paytm.linkedlist;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		
		LinkedListD l = new LinkedListD();
		l.addNode(1);
		l.addNode(2);
		l.addNode(3);
		l.addNode(4);
		l.addNode(5);
		
		l.print();
		
		System.out.println("**** Reverse linked list **");

		l.reverse();
		
		System.out.println("******* Again reverse ** ** ");
		l.reverse();
	}
}

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}

class LinkedListD {
	
	Node head;
	
	public void addNode(int val) {
		
		head = addNode(head, val);
	}

	public void reverse() {
		
		Node tmp = reverse(head);
		head =tmp;
	
		print(tmp);
	}

	private Node reverse(Node node) {
		
		Node tmp = node;
		Node curr =  tmp;
		Node prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private Node addNode(Node node, int val) {
		
		if(node == null) {
			node =  new Node(val);
			return node;
		}
		node.next = addNode(node.next, val);
		return node;
	}
	
	public void print() {
		
		Node tmp = head;
		tmp = print(tmp);
	}

	private Node print(Node tmp) {
		while (tmp != null) {
			 System.out.println(tmp.data);
			 tmp =  tmp.next;
		}
		return tmp;
	}
}
