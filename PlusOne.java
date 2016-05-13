import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PlusOne {
	 public static int[] plusOne(int[] digits) {
		 int len = digits.length;
		digits[len-1]+=1;
		boolean add = false;
		int[] digit = new int[len+1];
		if(digits[len-1]==10){
			add = true;
			digits[len-1] = 0;
			for(int i=len-2;i>=0;i--){
				if(add){
					digits[i]++;
					add = false;
				}
					
				if(digits[i]==10){
					add = true;
					digits[i] = 0;
				}
					
			}
			if(add){
				
				digit[0] = 1;
				for(int i=0;i<len;i++){
					digit[i+1] = digits[i];
				}
				return digit;
			}
		}
		 return digits;
	        
	    }
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 while(s.hasNext()){
			 String in = s.nextLine().trim();
			 String[] a = in.split(" ");
			 int[] digit = new int[a.length];
			 for(int i=0;i<a.length;i++){
				 digit[i] = Integer.parseInt(a[i]);
			 }
			 digit = plusOne(digit);
			 for(int i=0;i<digit.length;i++)
				 System.out.print(digit[i]);
		 }
	}
}
