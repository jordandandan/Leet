package src;

public class Containerwithmostwater {
	public int maxArea(int[] height) {
		if(height.length==0)
			return 0;
		int l = 0;
		int r = height.length-1;
		int res = 0;
		while(l<r){
			res = Math.max(Math.min(height[l], height[r])*(r-l), res);
			if(height[l]<height[r]){
				int k = l;
				while(k<r&&height[k]<=height[l])
					k++;
				l = k;
			}else{
				int k = r;
				while(k>l&&height[k]<=height[r])
					k--;
				r = k;
			}
		}
		return res;
    }
}
