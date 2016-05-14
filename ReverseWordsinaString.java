import java.util.Scanner;


public class ReverseWordsinaString {
	 public static String reverseWords(String s) {
		String temp = s.trim();
		String[] a = temp.split(" +");
		String ans = "";
		for(int i=a.length-1;i>=1;i--){
			ans += a[i];
			ans += " ";
		}
		ans += a[0];
		return ans;
	        
	    }
	 public static String reverseWordsII(String s){
		char[] c = s.toCharArray();
		 reverse(c,0,c.length);
		
		for(int i=0,j=0;j<=c.length;j++){
			if(j==c.length||c[j]==' ')
			{
				reverse(c,i,j);
				i = j + 1;
                
			}
		}
		s = String.valueOf(c);
		return s;
	 }
	 public static char[] reverse(char[] s,int begin,int end){
		 for(int i=0;i<(end-begin)/2;i++){
			 char temp = s[begin+i];
			 s[begin+i] = s[end-i-1];
			 s[end-i-1] = temp;
		 }
		 return s;
	 }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 
		 String in;
		 while(s.hasNext()){
			 in = s.nextLine();
			
			System.out.print(reverseWords(in));
			System.out.print(reverseWordsII(in));
		 }
		
	}
}
