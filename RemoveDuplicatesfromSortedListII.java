package src;

public class RemoveDuplicatesfromSortedListII {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public ListNode deleteDuplicates(ListNode head) {  
        if(head == null || head.next == null) return head;  
        ListNode newHead = new ListNode(-1);  
        newHead.next = head;  
        ListNode p1 = newHead;  
        ListNode p2 = head;  
        while(p2!=null){  
            boolean dup = false;  
            while(p2.next!=null && p2.val == p2.next.val){  
                dup = true;  
                p2 = p2.next;  
            }  
            if(dup){  
                p2 = p2.next;  
                continue;  
            }  
            p1.next = p2;  
            p1 = p1.next;  
            p2 = p2.next;  
        }  
        p1.next = p2;  
        return newHead.next;  
    }  
}
