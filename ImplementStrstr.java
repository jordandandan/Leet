import java.util.Scanner;


public class ImplementStrstr {
	 public static int strStr(String haystack, String needle) {
		 if(haystack.isEmpty()&&needle.isEmpty())
			 return 0;
		 if(haystack == null || needle == null)
			 return 0;
		 int length = haystack.length();
		 for(int i=0;i<length;i++){
			 if(haystack.substring(i,length).startsWith(needle))
				 return i;
		 }
		 	return -1;
	    }
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 String haystack;
		 String needle;
		 while(s.hasNext()){
			 haystack = s.nextLine();
			 needle = s.nextLine();
			 System.out.println(strStr(haystack,needle));
		 }
	}
}
