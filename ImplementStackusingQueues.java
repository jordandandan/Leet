import java.util.LinkedList;
import java.util.Queue;


public class ImplementStackusingQueues {
	Queue<Integer> queue = new LinkedList<Integer>();
	 public void push(int x) {
	        queue.add(x);
	        int size = queue.size();
	        while(size--!=0){
	        	queue.add(queue.poll());
	        }
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	        queue.poll();
	    }

	    // Get the top element.
	    public int top() {
	        return queue.peek();
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return queue.isEmpty();
	    }
}
