package src;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 1;
        if(n==0)
        	return res[0];
        if(n==1)
        	return res[1];
        for(int i=2;i<=n;i++){
        	for(int j=0;j<i;j++){
        		res[i]+= res[j]*res[i-j-1];//catalan number f(n) = f(0)*f(n-1)+f(1)*f(n-2)+...+f(n-1)*f(0)
        	}
        }
        return res[n];
    }
}
