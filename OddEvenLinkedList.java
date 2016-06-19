package src;

public class OddEvenLinkedList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  } 
	public ListNode oddEvenList(ListNode head) {
	        if(head!=null){
	        	ListNode dummyhead = head,oddHead = head,evenHead = head.next;
	        	ListNode temp = evenHead;
	        	while(evenHead!=null){
	        		oddHead.next = oddHead.next.next;
	        		evenHead.next = evenHead.next.next;
	        		oddHead = oddHead.next;
	        		evenHead = evenHead.next;
	        		
	        	}
	        	oddHead.next = evenHead;
	        }
	        return head;
	    }
}
