import java.util.Arrays;


public class PermutationSequence {
	public String getPermutation(int n, int k) {
        if(n==0)
        	return null;
        int[] num = new int[n];
        for(int i=0;i<n;i++)
        	num[i] = i+1;
        k--;
        while(k>0){
        	nextPermutaion(num);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=num.length-1;i++)
        	sb.append(num[i]).append(',');
        String ret = sb.toString();
        return ret.substring(0,ret.length()-1);
    }

	private void nextPermutaion(int[] num) {
		// TODO Auto-generated method stub
		int i = num.length-1;
		for(;i>=1;i--){
			if(num[i]>num[i-1])
				break;
		}
		if(i==0){
			for(int k=0;k<num.length/2;k++){
				swap(num,k,num.length-1-k);
			}
		}
		else{
			int ii = i;
			i--;
			for(int j=num.length-1;j>i;j--){
				if(num[j]>num[i])
					swap(num,i,j);
			}
			for(int k=0;k<(num.length-ii)/2;k++){
				swap(num,ii+k,num.length-1-k);
			}
		}
	}

	private void swap(int[] num, int k, int i) {
		// TODO Auto-generated method stub
		int temp = num[i];
		num[i] = num[k];
		num[k] = temp;
	}
}
