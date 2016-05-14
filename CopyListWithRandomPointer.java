package src;

import java.util.HashMap;
import java.util.Map;

class RandomListNode {
	   int label;
	 RandomListNode next, random;
	 RandomListNode(int x) {
		 this.label = x; 
	 }
}
public class CopyListWithRandomPointer {
	 public RandomListNode copyRandomList(RandomListNode head) {
	        Map<RandomListNode,RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		 	RandomListNode dummy,p,q;
	        p = head;
	        dummy = new RandomListNode(0);
	        q = dummy;
	        while(p!=null){
	        	q.next = new RandomListNode(p.label);
	        	
	        	map.put(p, q.next);
	        	p = p.next;
	        	q = q.next;
	        }
	        p = head;
	        q = dummy;
	        while(p!=null){
	        	if(p.random==null)
	        		q.next.random = null;
	        	else
	        		q.next.random = map.get(p.random);
	        	 p = p.next;
	        	 q = q.next;
	        }
	        return dummy.next;
	    }
}
