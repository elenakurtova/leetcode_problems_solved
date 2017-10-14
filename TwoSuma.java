package leetcode.twosums;

// TwoSums method return indices of the two numbers such that they add up to a specific target.

public class TwoSums {
	
	public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length-1; ++i){
            for(int j = i+1; j < nums.length; ++j){
                if (nums[i]+nums[j] == target){
                    int[] numsIndices = {i, j};
                    return numsIndices;
                }
            }
        }
        return null;
    }
}
