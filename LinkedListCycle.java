
public class LinkedListCycle {
	 class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	 public boolean hasCycle(ListNode head) {
	        if(head==null||head.next==null||head.next.next==null)
	        	return false;
		 	ListNode fast = head;
	        ListNode slow = head;
	        while(fast!=null){
	        	
	        	slow = slow .next;
	        	if(fast.next!=null)
	        		fast = fast.next.next;
	        	else
	        		break;
	        	if(slow == fast)
	        		return true;
	        }
	        return false;
	    }
}
