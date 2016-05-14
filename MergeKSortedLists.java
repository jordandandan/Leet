import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class MergeKSortedLists {
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	/*
	 * Merge and sort 
	 */
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists==null||lists.length==0)
			return null;
		if(lists.length==1)
			return lists[0];
		
		int len = lists.length;
		
		int mid = len/2;
		ListNode[] l = new ListNode[mid+1];
		ListNode[] r = new ListNode[mid+1];
		int i,j;
		for(i=0;i<=mid;i++)
			l[i] = lists[i];
		for(i=0,j=mid+1;j<len;i++,j++)
			r[i] = lists[j];
		ListNode l1,l2;	
		l1 = mergeKLists(l);
		l2 = mergeKLists(r);
		return merge2Lits(l1,l2);
    }
	private ListNode merge2Lits(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode curr = head;
		while(l1.next!=null&&l2.next!=null){
			if(l1.val<l2.val){
				curr.next = l1;
				l1 = l1.next;
			}else{
				curr.next = l2;
				l2 = l2.next;
			}
			curr = curr.next;	
		}
		if(l1.next!=null)
			curr.next = l1;
		else
			curr.next = l2;
		
		return head.next;
	}
	/*
	 * Using PriorityQueue
	 */
	private static final Comparator<ListNode> listComparator =
		new Comparator<ListNode>() {
		@Override
		public int compare(ListNode x, ListNode y) {
		return x.val - y.val;
		}
		};
		public ListNode mergeKLists(List<ListNode> lists) {
		if (lists.isEmpty()) return null;
		Queue<ListNode> queue = (Queue<ListNode>) new PriorityQueue<ListNode>(lists.size(), listComparator);
		for (ListNode node : lists) {
		if (node != null) {
		queue.add(node);
		}
		}
		ListNode dummyHead = new ListNode(0);
		ListNode p = dummyHead;
		while (!queue.isEmpty()) {
		ListNode node = queue.poll();
		p.next = node;
		p = p.next;
		if (node.next != null) {
		queue.add(node.next);
		}
		}
		return dummyHead.next;
		}
}
