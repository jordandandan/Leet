import java.util.Scanner;


public class ValidNumber {
	public static boolean isNumber(String s) {
		s = s.trim();
		int i = 0;
		int n = s.length();
		boolean isDigit = false;
		if(i<n&&(s.charAt(i)=='-'||s.charAt(i)=='+'))
			i++;
		while(i<n&&Character.isDigit(s.charAt(i))){
			i++;
			isDigit = true;
		}
		if(i<n&&s.charAt(i)=='.'){
			i++;
			while(i<n&&Character.isDigit(s.charAt(i)))
			{
				i++;
				isDigit = true;
			}
		}
		if(isDigit&&i<n&&s.charAt(i)=='e'){
			i++;
			isDigit = false;
			if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-'))
				i++;
			while(i<n&&Character.isDigit(s.charAt(i))){
				i++;
				isDigit = true;
			}
		}
			
		
		return i==n&&isDigit;
        
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			String in = s.nextLine();
			System.out.println(isNumber(in));
		}
	}
}
