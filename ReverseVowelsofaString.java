package src;

public class ReverseVowelsofaString {
	public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        char tmp;
        while(left<right){
        	while(left<right&&!isVowel(arr[left]))
        		left++;
        	while(left<right&&!isVowel(arr[right]))
        		right--;
        	tmp = arr[left];
        	arr[left] = arr[right];
        	arr[right] = tmp;
        }
        return String.valueOf(arr);
    }

	private boolean isVowel(char tmp) {
		char c = Character.toLowerCase(tmp);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			return true;
		else
			return false;
		
	}
}
