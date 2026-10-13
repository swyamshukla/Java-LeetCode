import java.util.*;

class Solution {

    int count(List<Integer> nums, int target, int sum, int idx, Integer[][] dp){

        // ✅ valid
        if(sum == target) return 0;

        // ❌ invalid
        if(idx < 0) return Integer.MIN_VALUE;

        if(dp[idx][sum] != null) return dp[idx][sum];

        int skip = count(nums, target, sum, idx - 1, dp);

        int pick = Integer.MIN_VALUE;
        if(sum + nums.get(idx) <= target){
            int res = count(nums, target, sum + nums.get(idx), idx - 1, dp);
            if(res != Integer.MIN_VALUE){
                pick = 1 + res;
            }
        }

        return dp[idx][sum] = Math.max(pick, skip);
    }

    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        int n = nums.size();
        Integer[][] dp = new Integer[n][target + 1];

        int ans = count(nums, target, 0, n - 1, dp);

        return ans < 0 ? -1 : ans;
    }
}