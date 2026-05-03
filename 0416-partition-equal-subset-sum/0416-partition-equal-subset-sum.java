class Solution {

    boolean checkPartition(int[] nums, int idx, int currSum, int target, Boolean[][] dp){

        if(currSum == target) return true;

        if(idx < 0) return false;

        if(dp[idx][currSum] != null) return dp[idx][currSum];

        boolean pick = false;
        if(currSum + nums[idx] <= target){
            pick = checkPartition(nums, idx-1, currSum + nums[idx], target, dp);
        }

        boolean skip = checkPartition(nums, idx-1, currSum, target, dp);

        return dp[idx][currSum] = pick || skip;
    }

    public boolean canPartition(int[] nums) {
        int totalSum = findSum(nums);

        if(totalSum % 2 != 0) return false;

        int target = totalSum / 2;
        int n = nums.length;

        Boolean[][] dp = new Boolean[n][target + 1];

        return checkPartition(nums, n-1, 0, target, dp);
    }

    int findSum(int[] nums){
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        return sum;
    }
}
