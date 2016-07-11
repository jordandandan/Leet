import java.util.Stack;


public class VerifyPreorderSerializationofaBinaryTree {
	public boolean isValidSerialization(String preorder) {
		 if(preorder==null)
	        	return false;
			if(preorder=="")
	        	return true;
	        String[] pre = preorder.trim().split(",");
	        Stack<String> stack = new Stack<String>();

	        for(int i=0;i<pre.length;i++){
	        	while(pre[i].equals("#")&&!stack.isEmpty()&&stack.peek().equals("#")){
	        		stack.pop();
	        		if(stack.isEmpty())
	        			return false;
	        		stack.pop();
	        	}
	        	stack.push(pre[i]);
	        }
	        return stack.size()==1&&stack.peek().equals("#");
    }
}
