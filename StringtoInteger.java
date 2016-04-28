import java.util.Scanner;


public class StringtoInteger {
	 public static int myAtoi(String str) {
		 String temp = str.trim();
		 char[] c = temp.toCharArray();
		 int sum = 0;
		
		
		 boolean flag = false;
		 int a = 0,i=0;
		 if(i<c.length&&c[i] == '-'){
			 flag = true;
			 i++;
			 
		 }else if(i<c.length&&c[i] == '+'){
			 i++;
			 
		 }
		 while(i<c.length&&Character.isDigit(c[i])){
			
			 a = Integer.valueOf(c[i])-48;

			if(sum>Integer.MAX_VALUE/10||sum==Integer.MAX_VALUE/10&&a>=8)	 
				return flag?Integer.MIN_VALUE:Integer.MAX_VALUE;
			 
			 sum = sum*10 + a;
			 i++;
			 
		 }
		 
		 if(flag)
			 return -sum;
		 else 
			 return sum;
		 
	        
	    }
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 while(s.hasNext()){
			 String in = s.nextLine();
			 System.out.println(myAtoi(in));
		 }
	}
}
