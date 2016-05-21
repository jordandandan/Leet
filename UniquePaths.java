
public class UniquePaths {
	/*
	 * bottom-top solution
	 */
	 public static int uniquePaths(int m, int n) {
		 if(m==n&&m==1)
		        return 1;
	        int[][] dp = new int[m+1][n+1];
	        for(int i=0;i<m;i++)
	        	dp[i][n] = 1;
	        for(int i=0;i<n;i++){
	        	dp[m][i] = 1;
	        }
	        for(int r = m-1;r>=0;r--)
	        	for(int c = n-1;c>=0;c--)
	        		dp[r][c] = dp[r+1][c] + dp[r][c+1];
	        return dp[1][1];
	    }
	 /*
	  * top-bottom solution using memoization
	  */
	 public int uniquePaths2(int m,int n){
		 int[][] dp = new int[m+1][n+1];
		 for(int i=0;i<=m;i++){
			 for(int j=0;j<=n;j++)
				 dp[i][j] = -1;
		 }
		 return backtrack(0,0,m,n,dp);
	 }
	 public int backtrack(int r,int c,int m, int n, int[][] dp){
		 if(r==m-1&&c==n-1)
			 return 1;
		 if(r>=m||c>=n)
			 return 0;
		 if(dp[r+1][c]==-1)
			 dp[r+1][c] = backtrack(r+1, c, m, n, dp);
		 if(dp[r][c+1]==-1)
			 dp[r][c+1] = backtrack(r, c+1, m, n, dp);
		 
		 return dp[r][c+1] + dp[r+1][c];
	 }
	 public static void main(String[] args){
		 System.out.print(uniquePaths(1, 2));
	 }
}
