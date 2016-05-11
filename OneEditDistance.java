import java.util.Scanner;


public class OneEditDistance {
    public static boolean isOneEditDistance(String s, String t) {
		int len1 = s.length();
		int len2 = t.length();
		if(Math.abs(len1-len2)>1)
			return false;
		if(len1>len2)
			return isOneEditDistance(t, s);
		int diff = len2 - len1;
		int i = 0;
		while(i<len1&&s.charAt(i)==t.charAt(i))
			i++;
		if(i==len1)
			return diff>0;
		if(diff==0)
			i++;
		while(i<len1&&s.charAt(i)==t.charAt(i+diff))
			i++;
		return i==len1;
		
        
    }
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			String s1 = s.nextLine();
			String s2 = s.nextLine();
			System.out.println(isOneEditDistance(s1,s2));
		}
		
		
	}
}
