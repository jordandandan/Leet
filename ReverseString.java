package src;

public class ReverseString {
	public String reverseString(String s) {
        int len = s.length();
        char[] a = s.toCharArray();
		char temp;
        for(int i=0,j=len-1;i<=j;i++,j--){
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
        return String.valueOf(a);
    }
}
