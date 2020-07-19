package com.paytm.lc;

public class RemoveNthNodeFromLast {

	public static void main(String[] args) {
		
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next = new Node(4);
		node.next.next.next = new Node(5);
		

		Node n1 = removeNthNodeFromEnd(node, 2);
		while (n1 != null) {
			System.out.println(n1.data);
			n1 = n1.next;
		}
	}
	
	private static Node removeNthNodeFromEnd(Node node, int n) {
		
		Node tmp = node;
		Node fast = node;
		Node slow = node;
		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}
		
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		return tmp;
	}

	static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
}


