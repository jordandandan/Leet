import java.util.Arrays;
import java.util.Scanner;


public class LogestSubstringWithoutRepeatingCharacters {
	/*
	 * Solution1
	 */
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
	/*
	 * Solution2
	 */
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
	/*
	 * The solution for existing k repeated letters at most
	 */
	public static int lengthOfLongestKDistinctSubstring(String s,int k){
		int numberType = 0;
		int[] map = new int[256];
		Arrays.fill(map, 0);
		int maxLen = 0;
		int i = 0;
		for(int j=0;j<s.length();j++){
		
			if(map[s.charAt(j)] == 0)
				numberType++;
			map[s.charAt(j)]++;
			while(numberType>k){
				map[s.charAt(i)]--;
				
				if(map[s.charAt(i)]==0)
					numberType--;
				i++;
			}
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
			System.out.println(lengthOfLongestKDistinctSubstring(in, 2));
		}
	}
}
