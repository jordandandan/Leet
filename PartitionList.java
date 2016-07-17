
public class PartitionList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	  public ListNode partition(ListNode head, int x) {
		  if(head == null)
	        	return null;
		  	ListNode dummyHead = new ListNode(0);
	        dummyHead.next = head;
	        ListNode h = dummyHead;
	        while(h.next!=null&&h.next.val<x)
	        	h = h.next;
	        ListNode t1 = h;
	        ListNode t2 = h.next;
	        while(t2!=null){
	        	while(t2!=null&&t2.val>=x){
	        		t1 = t1.next;
	        		t2 = t2.next;
	        	}
	        	if(t2!=null){
	        		t1.next = t2.next;
	        		t2.next = h.next;
	        		h.next = t2;
	        		h = h.next;
	        		t2 = t1.next;
	        	}
	        }
	        return dummyHead.next;
	    }
}
