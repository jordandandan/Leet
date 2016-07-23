
public class GuessNumberHigherorLower {
	public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid = 0;
        while(start<=end){
        	mid = start + (end-start)/2;
        	if(guess(mid)==-1)
        		start = mid +1;
        	else if(guess(mid)==1)
        		end = mid-1;
        	else
        		break;
        }
        return mid;
    }

	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
