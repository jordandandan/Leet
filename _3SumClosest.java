import java.util.Arrays;


public class _3SumClosest {
	int sumres=0, mindiff=Integer.MAX_VALUE;
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
        int start=i+1, end= nums.length-1;
        while(start<end){
            int sum=nums[i]+nums[start]+nums[end];
            int diff=Math.abs(sum-target);
            if(diff<mindiff){
                mindiff=diff;
                sumres=sum;
            }
            if(sum<target){
                start++;
            }
            else if(sum>target){
                end--;
            }
            else return sum;
        }
    }
       return sumres;
    }
}
