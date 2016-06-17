
public class IntersectionofTwoLinkedLists {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 int lenA = length(headA);
		 int lenB = length(headB);
		 while(lenA>lenB){
			 headA = headA.next;
			 lenA--;
		 }
			 
		 while(lenA<lenB){
			 headB = headB.next;
			 lenB--;
		 }

		 while(headA!=headB){
			 headA = headA.next;
			 headB = headB.next;
		 }
		 return headA;
	 }
	private int length(ListNode headA) {
		// TODO Auto-generated method stub
		int len = 0;
		while(headA!=null){
			headA = headA.next;
			len++;
		}
		return len;
	}
}
