
public class ReverseLinkedListII {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	 public ListNode reverseBetween(ListNode head, int m, int n) {
	        ListNode left = null;
	        ListNode right = null,curr = null,prev=null,next=null,tail=null;
	        
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        if(head==null||n-m<=0)
	        	return head;
	        left = dummy;
	        int temp = m;
	        while(temp>1){
	        	left = left.next;
	        	temp--;
	        }
	        curr = left.next;
	        tail = curr;
	        int count = n - m;
	        while(count>0){
	        	next = curr.next;
	        	curr.next = prev;
	        	prev = curr;
	        	curr = next;
	        	count --;
	        }
	        right = curr;
	        left.next = prev;
	        tail.next = right;
	        return dummy.next;
	    }
}
