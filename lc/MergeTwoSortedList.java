package com.paytm.lc;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		l1.next =  new ListNode(2);
		l1.next.next = new ListNode(4);
		
		
		ListNode l2 = new ListNode(1);
		l2.next =  new ListNode(3);
		l2.next.next = new ListNode(4);
		
		MergeTwoSortedList m = new MergeTwoSortedList();
		ListNode l3 = m.mergeTwoLists(l1, l2);
		
		while (l3 != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	     
        ListNode l3 = null;
        while(l1 != null &&  l2 != null) {
            
            if(l1.val < l2.val) {
                l3= putVal(l3, l1.val);
                l1 = l1.next;
            } else {
                l3 = putVal(l3, l2.val);
                l2 = l2.next;
            }
        }
        
        while(l1 != null) {
            
            l3 = putVal(l3, l1.val);
            l1 = l1.next;
        }
        
        while(l2 != null) {
            
            l3 = putVal(l3, l2.val);
            l2 = l2.next;
            
        }
     
        return l3;
    }
    
    public ListNode putVal(ListNode ll, int val) {
        
        if(ll == null) {
            return new ListNode(val);
        }
        ll.next = putVal(ll.next, val);
        return ll;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
