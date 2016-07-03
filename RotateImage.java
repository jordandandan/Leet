package src;

public class RotateImage {
	public void rotate(int[][] matrix) {
        int n = matrix.length;
        if(n==1)
        	return;
        for(int i=0;i<n/2;i++)
        	for(int j=0;j<Math.ceil((double)n/2.0);j++){
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[n-j-1][i];
        		matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
        		matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
        		matrix[j][n-i-1] = temp;
        	}
    }
}
