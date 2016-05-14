/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode point = null;
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		while(l1!=null&&l2!=null){
			if(l1.val<=l2.val){
				if(head == null){
					head = new ListNode(l1.val);
					l1 = l1.next;
					point = head;
				}else{
					point.next = l1;
					point = point.next;
					l1 = l1.next;
				}
			}else{
				if(head == null){
					head = new ListNode(l2.val);
					l2 = l2.next;
					point = head;
				}else{
					point.next = l2;
					point = point.next;
					l2 = l2.next;
				}
			}
		}
		if(l1!=null){
			point.next = l1;
		}else if(l2!=null){
			point.next = l2;
		}
		return head;
        
    }
}
