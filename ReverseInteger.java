import java.util.Scanner;


public class ReverseInteger {
	 public static int reverse(int x) {
	     int temp;
	     int res = 0;;
		 while(x!=0){
			 if(Math.abs(res)>Integer.MAX_VALUE/10)
				 return 0;
	    	 temp = x%10;
	    	 x /= 10;
	    	 res = res*10 + temp;
	     }
		 return res;   
	    }
	 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int n = s.nextInt();
			System.out.println(reverse(n));
		}
	}
}
