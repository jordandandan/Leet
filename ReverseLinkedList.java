
public class ReverseLinkedList {
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	/*
	 * iterative solution
	 */
	public ListNode reverse(ListNode head) {
        if(head==null||head.next==null)
        	return head;
		ListNode prev = null;
        ListNode next = null;
        
        while(head!=null){
        	next = head.next;
        	head.next = prev;
        	prev = head;
        	head = next;
        }
        return prev;
    }
	/*
	 * recursive solution
	 */
	public ListNode reverseList(ListNode head){
		if(head==null||head.next==null)
			return head;
		ListNode newHead = reverse(head.next);
		head.next.next=head;
		head.next=null;
		return newHead;
	}
}
