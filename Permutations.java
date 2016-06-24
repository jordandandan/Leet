import java.util.ArrayList;
import java.util.List;


public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return permutations;
        }

        collectPermutations(nums, 0, new ArrayList<Integer>(), permutations);
        return permutations;
    }

    private void collectPermutations(int[] nums, int start, List<Integer> permutation,
            List<List<Integer>>  permutations) {

        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }

        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<Integer>(permutation);
            newPermutation.add(i, nums[start]);//Tips: adding element to the same index will push the origin element to the next index!!! 
            collectPermutations(nums, start + 1, newPermutation, permutations);
        }
    }
}
