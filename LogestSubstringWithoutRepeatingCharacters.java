import java.util.Arrays;
import java.util.Scanner;


public class LogestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		boolean[] exist = new boolean[256];
		int i = 0;
		int maxLen = 0;
		for(int j=0;j<s.length();j++){
			while(exist[s.charAt(j)]){
				
				exist[s.charAt(i)] = false;
				i++;
			}
			exist[s.charAt(j)] = true;
			maxLen = Math.max(j-i+1, maxLen);
		}
		
		
		return maxLen;
        
    }
	public static int lengthOfLongestSubstring2(String s){
		int[] index = new int[256];
		Arrays.fill(index, -1);
		int i = 0;
		int maxLen = 0;
		for(int j=0;j<s.length();j++){
			if(index[s.charAt(j)]>=i){
				i = index[s.charAt(j)]+1;
			}
			index[s.charAt(j)] = j;
			
			maxLen = Math.max(j-i+1, maxLen);
		}
		return maxLen;
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			String in = s.nextLine();
			System.out.println(lengthOfLongestSubstring(in));
			System.out.println(lengthOfLongestSubstring2(in));
		}
	}
}
