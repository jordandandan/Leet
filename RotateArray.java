
public class RotateArray {
	public void rotate(int[] nums, int k) {
        if(nums.length==0||k==0)
        	return;
        k %= nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

	private void reverse(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		while(start<end){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
