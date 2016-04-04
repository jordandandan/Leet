package src;

import java.util.Scanner;

public class ValidPalindrome {
	 public static boolean isPalindrome(String s) {
	     if(s==null)
	    	 return true;
	     if(s.length()<=1)
	    	 return true;
	     int f = 0;
	     int b = s.length()-1;
	     while(true){
	    	 if(f>=b)
	    		 break;
	    	 if(!(Character.isLetter(s.charAt(f))||Character.isDigit(s.charAt(f)))){
	    		 f++;
	    		 continue;
	    	 	}
	    	 if(!(Character.isLetter(s.charAt(b))||Character.isDigit(s.charAt(b)))){
	    		 b--;
	    		 continue;
	    	 	}
	    	 if(Character.toLowerCase(s.charAt(f))!=Character .toLowerCase(s.charAt(b))){
	                return false;
	            }

	    	 if(f >= b-2)
	    		 break;
	    	 f++;
	    	 b--;
	     }
	     	
	     
		 return true;
	  }
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			String s = scanner.nextLine();
			
			if(isPalindrome(s)){
				System.out.print("y");
			}
			else
				System.out.print("n");

		}
	}
}
