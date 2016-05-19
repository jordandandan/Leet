import java.util.Stack;


public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
        if(tokens.length==1)
        	return Integer.valueOf(tokens[0]);
		Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
		for(int i=0;i<tokens.length;i++){
        	if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
        		int x = Integer.valueOf(stack.pop());
        		int y = Integer.valueOf(stack.pop());
        		stack.push(eval(y,x,tokens[i]));
        	}else{
        		stack.push(Integer.valueOf(tokens[i]));
        	}
        }
		return stack.peek();
    }
	public int eval(int x,int y,String operate){
		if(operate.equals("+")){
			return x+y;
		}else if(operate.equals("-")){
			return x-y;
		}else if(operate.equals("*")){
			return x*y;
		}else
			return x/y;
	}
}
