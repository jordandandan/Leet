
public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int tmp = 1;
		int[] res = new int[nums.length];
		res[0] = 1;
		//left to right
		for(int i=1;i<nums.length;i++){
			res[i] = res[i-1] * nums[i-1];
		}
		//right to left
		for(int i=nums.length-1;i>=0;i--){
			res[i] *= tmp;
			tmp *= nums[i];
		}
		return res;
	}
}
