import java.util.Stack;


public class ValidParentheses {
	public boolean isValid(String s) {
        if(s==null)
        	return true;
        Stack<Character> stack = new Stack<Character>(); 
        for(int i=0;i<s.length();i++){
        	char a = s.charAt(i);
        	if(a==')'||a==']'||a=='}'){
        		if(!stack.isEmpty()&&valid(a,stack.peek())){
        			stack.pop();
        			continue;
        		}else{
        			return false;
        		}
        	}else{
        		stack.push(a);
        	}
        		
        }
        if(stack.isEmpty())
        	return true;
        else
        	return false;
    }
	public boolean valid(char a,char b){
		if(a==')'&&b=='(')
			return true;
		else if(a==']'&&b=='[')
			return true;
		else if(a=='}'&&b=='{')
			return true;
		else
			return false;
	}
}
