
public class ConvertSortedListtoBinarySearchTree {
	 	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
		 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
		 
	public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        	return null;
        return toBST(head,null);
    }

	private TreeNode toBST(ListNode head, ListNode tail) {
		// TODO Auto-generated method stub
		ListNode slow = head;
		ListNode fast = head;
		if(head==tail)
			return null;
		while(fast!=tail&&fast.next!=tail){
			slow = slow.next;
			fast = fast.next.next;
		}
		TreeNode tmp = new TreeNode(slow.val);
		tmp.left = toBST(head, slow);
		tmp.right = toBST(slow.next, tail);
		
		return tmp;
	}
}
