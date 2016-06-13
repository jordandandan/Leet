import java.util.Stack;


public class ImplementQueueusingStacks {
	   Stack<Integer> stack = new Stack<Integer>();
	    // Push element x to the back of queue.
	    public void push(int x) {
	        Stack<Integer> tmp_stack = new Stack<Integer>();
	        while(!stack.isEmpty()){
	        	tmp_stack.push(stack.pop());
	        }
	        stack.add(x);
	        while(!tmp_stack.isEmpty()){
	        	stack.add(tmp_stack.pop());
	        }
	        
	    }

	    // Removes the element from in front of queue.
	    public void pop() {
	        stack.pop();
	    }

	    // Get the front element.
	    public int peek() {
	        return stack.peek();
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	        return stack.isEmpty();
	    }
}
