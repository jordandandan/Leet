import java.util.ArrayList;
import java.util.List;


public class Triangle {
	//top-down method
	 public int minimumTotal(List<List<Integer>> triangle) {
		 List<List<Integer>> ixSum = new ArrayList<List<Integer>>(triangle.size()); 
		    for (int i = 0; i < triangle.size(); ++i) {
		      List<Integer> lines = triangle.get(i);
		      ixSum.add(new ArrayList<Integer>(lines.size()));
		      if (i == 0) {
		        ixSum.get(0).add(lines.get(0)); 
		      } else {
		        for (int j = 0; j < lines.size(); ++j) {
		          if (j == 0) {
		            ixSum.get(i).add((ixSum.get(i - 1).get(0) + lines.get(0)));
		          } else if (j == (lines.size() - 1)) {
		
		            ixSum.get(i).add((ixSum.get(i - 1).get(j - 1) + lines.get(j)));
		          } else {
		            if (ixSum.get(i - 1).get(j) > ixSum.get(i - 1).get(j - 1)) {
		              ixSum.get(i).add(ixSum.get(i - 1).get(j - 1) + lines.get(j));
		            } else {
		              ixSum.get(i).add(ixSum.get(i - 1).get(j) + lines.get(j));
		            }
		          }
		        }
		      }
		    }
		    int min = Integer.MAX_VALUE;
		    for (int e : ixSum.get(ixSum.size()-1)) {
		      if (e < min) {
		        min = e;
		      }
		    }
		    ixSum = null;
		    return min;
	    }
	 //bottom-up method
	 public int minimumTotal1(List<List<Integer>> triangle){
		 for(int i=triangle.size()-2;i>=0;i--){
			 for(int j=0;j<i+1;j++){
				 int a = triangle.get(i+1).get(j);
				 int b = triangle.get(i+1).get(j+1);
				 int temp = triangle.get(i).get(j);
				 triangle.get(i).set(j, a>b?(b+temp):(a+temp));
			 }
		 }
		 return triangle.get(0).get(0);
	 }
	
}
