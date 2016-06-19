package src;

public class RemoveNthNodeFromEndofList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0),slow = dummyHead,fast = dummyHead;//pay attention the test case [1]
        dummyHead.next = head;
        while(n!=0){
        	n--;
        	fast = fast.next;
        }
		while(fast.next!=null){
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return dummyHead.next;
    }
}
