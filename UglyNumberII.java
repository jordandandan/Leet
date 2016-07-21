import java.util.PriorityQueue;


public class UglyNumberII {
	/*
	 * using Link List
	 */
	public class ListNode{
		private int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
		}
	}
	public int nthUglyNumber(int n) {
        ListNode curr = new ListNode(1);
        ListNode _2 = curr,_3 = curr,_5 = curr;
        int min = Integer.MAX_VALUE;
        for(int i=2;i<=n;i++){
        	min = Math.min(_2.val*2, Math.min(_3.val*3, _5.val*5));
        	curr.next = new ListNode(min);
        	curr = curr.next;
        	_2 = _2.val*2==min?_2.next:_2;
        	_3 = _3.val*3==min?_3.next:_3;
        	_5 = _5.val*5==min?_5.next:_5;
        }
        return curr.val;
        
    }
	/*
	 * using priority queue
	 */
	public int nthUglyNumber1(int n) {
        PriorityQueue<Long> queue = new PriorityQueue<Long>();
        queue.add(1l);
        for(int i=1;i<=n;i++){
        	Long tmp = queue.poll();
        	while(!queue.isEmpty()&&queue.peek()==tmp)
        		queue.poll();
        	queue.add(tmp*2);
        	queue.add(tmp*3);
        	queue.add(tmp*5);
        }
        return queue.peek().intValue();
    }
	
}
