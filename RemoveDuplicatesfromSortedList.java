
public class RemoveDuplicatesfromSortedList {
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	 public ListNode deleteDuplicates(ListNode head) {
		 	if(head==null)
		 		return null;
	        ListNode dummyHead = new ListNode(-1);
	        dummyHead.next = head;
	        ListNode next = head;
	        while(next!=null&&next.next!=null){
	        	next = next.next;
	        	if(next.val==head.val)
	        		continue;
	        	else{
	        		head.next = next;
	        		head = next;
	        		
	        	}
	 
	        }
	        head.next = null;
	        return dummyHead.next;
	    }
}
