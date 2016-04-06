
public class SpiralMatrix_59 {
	 public static int[][] generateMatrix(int n) {
		 
		 int[][] ans = new int[n][n];
		 if(n==0)
			 return ans;
		 int[][] dir = {{0,1,0,-1},{1,0,-1,0}};
		 int[] space = new int[1000];
		 space[0] = n-1;
		 int dim = n-1;
		 n--;
		 for(int i=1;i<=2*dim;i+=2){
			 space[i] = n;
			 space[i+1] = n;
			 n--;
		 }
		
		 int temp_dir = 0;
		 int count = 1;
		 
		 int x=0;
		 int y=0;
		 ans[0][0] = count;
		 count++;
		 for(int i=0;i<=2*dim;i++){
			 int s = space[i];
			 
			 for(int j=0;j<s;j++){
				 
				 x += dir[0][temp_dir];
				 y += dir[1][temp_dir];
				 ans[x][y] = count;
				 count++;
			 }
			 
			 temp_dir = (temp_dir + 1)%4;
			 
		 }
		 
		 return ans;
	        
	    }
	 public static void main(String args[]){
		 int n = 4;
		 int[][] ans = null; 
			 ans  = generateMatrix(n);
		 for(int i=0;i<n;i++){
			 for(int j=0;j<n;j++)
				 System.out.print(ans[i][j]+" ");
			 System.out.println();
		 }
			 
	 }
}
