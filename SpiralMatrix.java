import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
        
        int m = matrix.length;
        if(m==0)
        	return list;
        int n = matrix[0].length;
        int row = 0;
        int col = -1;
       
        
        while(true){
        	for(int i=0;i<n;i++)
        		list.add(matrix[row][++col]);
        	if(--m==0)
        		break;
        	for(int i=0;i<m;i++)
        		list.add(matrix[++row][col]);
        	if(--n==0)
        		break;
        	for(int i=0;i<n;i++)
        		list.add(matrix[row][--col]);
        	if(--m==0)
        		break;
        	for(int i=0;i<m;i++)
        		list.add(matrix[--row][col]);
        	if(--n==0)
        		break;
        }
        return list;
    }
}
