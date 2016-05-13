import java.util.Scanner;


public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
        int[] num = new int[10];

        int temp,l,r;
        int div = 1;
        int count = 1;
        int mod = 10;
        if(x<0)
        	return false;
        if(x>=0&&x<=9)
        	return true;
        while(x/div>=10){
        	div *= 10;
        	count++;
        }
        count /= 2;
        while(count!=0){
        	count--;
        	l = (x/div)%10;
        	r = (x%mod)/(mod/10);
        	if(l!=r)
        		return false;
        	mod*=10;
        	div/=10;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int in = s.nextInt();
			System.out.println(isPalindrome(in));
		}
	}
}
