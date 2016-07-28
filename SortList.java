
public class SortList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public ListNode sortList(ListNode head) {//merge sort
        if(head==null||head.next==null)
        	return head;
        // find the middle
        ListNode slow = head, fast = head , prev = slow;
        while(fast!=null&&fast.next!=null){
        	prev = slow;
        	slow = slow.next;
        	fast = fast.next.next;
        }
        prev.next = null;//notice that make the end of left to null
        ListNode left = sortList(head);
        ListNode right  = sortList(slow);
        return merge(left,right);
    }
	private ListNode merge(ListNode left, ListNode right) {
		// TODO Auto-generated method stub
		ListNode dummyHead = new ListNode(-1), p = dummyHead;
		while(left!=null&&right!=null){
			if(left.val<right.val){
				p.next = left;
				p = p.next;
				left = left.next;
			}else{
				p.next =right;
				p = p.next;
				right = right.next;
			}
			
		}
		if(left!=null)
			p.next = left;
		if(right!=null)
			p.next = right;
		return dummyHead.next;
	}
}
