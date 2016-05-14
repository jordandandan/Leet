import java.util.Scanner;


public class LongestPalindromicSubstring_5 {
	public static String longestPalindrome(String s) {
		int len = s.length();
		int max = 1;
		int start = 0;
		boolean[][] flag = new boolean[len][len];
		for(int i=0;i<len;i++)
			for(int j=0;j<len;j++){
				if(i>=j)
					flag[i][j] = true;
				else
					flag[i][j] = false;
			}
		for(int j=1;j<len;j++)
			for(int i=0;i<j;i++){
				if(s.charAt(i) == s.charAt(j)){
					flag[i][j] = flag[i+1][j-1];
					if(flag[i][j] == true && j-i+1>max){
						start = i;
						max = j-i+1;
					}
						
				}
				else
					flag[i][j] = false;
					
			}
		return s.substring(start, start+max);
    }
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(longestPalindrome(s));
	}
}
