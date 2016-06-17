package src;

public class CountNumberswithUniqueDigits {
	/*
	 * 10
	 * 10 + 9*9
	 * 10 + 9*9 + 9*9*8
	 */
	public int countNumbersWithUniqueDigits(int n) {
		if(n==0)
			return 1;
		int res = 10;
		int uniqueNum = 9;
		int availableNum = 9;
		while(n>1&&availableNum>0){
			uniqueNum = uniqueNum * availableNum;
			res += uniqueNum;
			n--;
			availableNum--;
			
		}
		return res;
    }
}
