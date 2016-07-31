package src;

public class RotateList {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	 public ListNode rotateRight(ListNode head, int k) {
	        if(head==null||head.next==null||k==0)
	        	return head;
	        ListNode slow = head,fast = head;
	        for(int i=0;i<k;i++){
	        	fast=fast.next;
	        	if(fast==null){
	        		k %= i;
	        		i = 0;
	        		fast = head;
	        	}
	        }
	    	while(fast.next!=null){
        		slow = slow.next;
        		fast = fast.next;
        	}
	    	fast.next = head;
			ListNode newHead=slow.next;
			slow.next = null;
			return newHead;
	    }
}
