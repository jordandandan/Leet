
public class InsertionSortList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public ListNode insertionSortList(ListNode head) {
        if(head==null)
        	return null;
        ListNode dummyHead = new ListNode(0);
        while(head!=null){
        	ListNode curr = head;
        	head = head.next;
        	ListNode target = dummyHead;
        	while(target.next!=null&&curr.val>target.next.val){
        		target = target.next;
        	}
        	curr.next = target.next;
        	target.next = curr;
        }
        return dummyHead.next;
    }
}
