package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class IntersectionofTwoArrays {
	/*
	 * o(nlogn) binarySearch
	 */
	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Set<Integer> set = new HashSet<Integer>();
		for(int k : nums2){
			if(binarySearch(nums1, k)){
				set.add(k);
			}
		}
		int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
       
        return result;
    }
	public boolean binarySearch(int[] num,int target){
		int low = 0;
		int high = num.length-1;
		
		while(low<=high){
			int mid = (low+high)/2;
			if(num[mid] == target)
				return true;
			else if(num[mid]>target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return false;
	}
	/*
	 *  O(n) two hashset
	 */
	public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
