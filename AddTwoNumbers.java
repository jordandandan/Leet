
public class AddTwoNumbers {
	class ListNode {
	     int val;
		 ListNode next;
		 ListNode(int x){ 
			 val = x; }
		 }
	/*
	 * A clean solution
	 */
	public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
		int x = (p != null) ? p.val : 0;
		int y = (q != null) ? q.val : 0;
		int digit = carry + x + y;
		carry = digit / 10;
		curr.next = new ListNode(digit % 10);
		curr = curr.next;
		if (p != null) p = p.next;
		if (q != null) q = q.next;
		}
		if (carry > 0) {
		curr.next = new ListNode(carry);
		}
		return dummyHead.next;
		}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
        	return l2;
        }
        if(l2==null){
        	return l1;
        }
        ListNode head = new ListNode(l1.val + l2.val);
        boolean add = false;
        ListNode point = head;
        if(head.val >= 10){
        	head.val %= 10;
        	add = true;
        }
        if(l1.next == null && l2.next == null){
        	if(add){
        		point.next = new ListNode(1);
        		
        	}
        	
        		return head;
        }
        l1 = l1.next;
        l2 = l2.next;
        while(l1!=null && l2!=null){
        	ListNode temp = new ListNode(l1.val+l2.val);
        	if(add){
        		temp.val++;
        		add = false;
        	}
        	if(temp.val>=10){
        		temp.val %= 10;
        		add = true;
        	}
        	point.next = temp;
        	point = point.next;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        if(l1!=null){
        	point.next = l1;
        	while(add){
        		l1.val++;
        		add = false;
        		if(l1.val>=10){
        			l1.val %= 10;
        			add = true;
        		}
        		if(l1.next == null)
        			break;
        		l1 = l1.next;
        	}
        		if(add){
        			l1.next = new ListNode(1);
        		}
        }else if(l2!=null){
        	point.next = l2;
        	while(add){
        		l2.val++;
        		add = false;
        		if(l2.val>=10){
        			l2.val %= 10;
        			add = true;
        		}
        		if(l2.next == null)
        			break;
        		l2 = l2.next;
        	}
        	if(add){
        		l2.next = new ListNode(1);
        	}
        }else if(add){
        	point.next = new ListNode(1);
        }
		return head;
    }
}
