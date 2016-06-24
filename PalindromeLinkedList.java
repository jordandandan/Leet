
public class PalindromeLinkedList {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public boolean isPalindrome(ListNode head) {
		 if(head == null||head.next==null)
	        	return true;
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast!=null&&fast.next!=null){
	        	slow = slow.next;
	        	fast = fast.next.next;
	        }
	        if(fast!=null)//odd
	        	slow = slow.next;
	        ListNode pre=null;
	        ListNode next = slow.next;
	        slow.next = pre;
	        while(next!=null){	
	        	pre = slow;
	        	slow = next;

	        	next = slow.next;

	        	slow.next = pre;
	        }
	        while(slow!=null){
	        	if(slow.val!=head.val)
	        		return false;
	        	slow = slow.next;
	        	head = head.next;
	   
	        }
	        return true;
    }
}
