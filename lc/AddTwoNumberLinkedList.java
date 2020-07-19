package com.paytm.lc;

public class AddTwoNumberLinkedList {

	ListNode1 head = null;
	public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {

		int reminder = 0;
		while (l1 != null && l2 != null) {

			int val = l1.val + l2.val + reminder;
			int remin = val % 10;
			addValue(remin);
			reminder = val / 10;
			l1 = l1.next;
			l2 = l2.next;
		}

		return reverse();
	}
	
	
	public void addValue(int val) {
		head = addValue(head, val);
	}
	private ListNode1 addValue(ListNode1 node, int val) {
		
		if(node == null) {
			return new ListNode1(val);
		}
		node.next=  addValue(node.next, val);
		return node;
	}
	
	public ListNode1 reverse() {
		
		ListNode1 tmp  = head;
		ListNode1 prev= null;
		while (tmp != null) {
			ListNode1 next = tmp.next;
			tmp.next = prev;
			prev = tmp;
			tmp = next;
		}
		
		return prev;
	}
	
	public static void main(String[] args) {
		AddTwoNumberLinkedList  a= new AddTwoNumberLinkedList();
		ListNode1 l1 = new ListNode1(2);
		l1.next = new ListNode1(4);
		l1.next.next = new ListNode1(3);
		
		
		ListNode1 l2 = new ListNode1(5);
		l2.next = new ListNode1(6);
		l2.next.next = new ListNode1(4);
		
		ListNode1 l3 = a.addTwoNumbers(l1, l2);
	
		while (l3 != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}
	}
}



