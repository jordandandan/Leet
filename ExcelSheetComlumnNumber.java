package src;

public class ExcelSheetComlumnNumber {
	public int titleToNumber(String s) {
		int sum = 0;
		for(int i=0;i<s.length();i++){
			sum = sum*10 + (s.charAt(i)-'A') + 1;
		}
		return sum;
    }
}
