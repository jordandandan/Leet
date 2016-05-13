import java.util.Scanner;


public class LongestPalindromicSubstring {
	/*
	 * LCS can't resolve this problem
	 * e.g. abcdba the LCS with its reverse string is ab but not null
	 */
	 public static String longestCommonSubstring(String s){
		 String reverse = "";
		 char[] array = s.toCharArray();
		 for(int i=s.length()-1;i>=0;i--){
			 reverse += array[i];
		 }
		 
		 int len = s.length();
		
		
		 int max = -1,x=0,y=0;
		 int[][] dp = new int[len+1][len+1];
		 for(int i=0;i<=len;i++)
			 dp[i][0] = 0;
		 for(int j=0;j<=len;j++)
			 dp[0][j] = 0;
		 for(int i=1;i<=len;i++)
			 for(int j=1;j<=len;j++){
				 if(s.charAt(i-1)==reverse.charAt(j-1))
					 dp[i][j] = dp[i-1][j-1] + 1;
				 else dp[i][j] = 0;//不连续的时候还要跟左边的c[i][j-1]、上边的c[i-1][j]值比
				 if(dp[i][j]>max){
					 max = dp[i][j];
					 x = i;
					 y = j;
				 }
			 }
		 x--;
		 y--;
		 String ans = "";
		 
		 while(x>=0&&y>=0){
			 
			 if(s.charAt(x)==reverse.charAt(y)){
				 ans+=s.charAt(x);
				 x--;
				 y--; 
			 }
			 else 
				 break;
			
		 }
		 return ans;
	 }
	 public static String longestPalindrome(String s){
		 int len = s.length();
		 boolean[][] palin = new boolean[len][len];
		 String result = "";
		 int max = -1;
		 for(int i=len-1;i>=0;i--)
			 for(int j=i;j<len;j++ ){
				 palin[i][j] = s.charAt(i)==s.charAt(j)&&((j-i<3)||palin[i+1][j-1]);
				 if(palin[i][j]&&j-i+1>max){
					 max = j-i+1;
					 result = s.substring(i,j+1);
				 }
			 }
		 return result;
	 }
	 public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			String in = s.nextLine();
			System.out.println(longestPalindrome(in));
		}
		 
	}
}
