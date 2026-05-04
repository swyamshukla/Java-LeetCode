class Solution {

    int check(int[] cost,int idx,int[] dp){
        if(idx>=cost.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int oneStep =cost[idx]+check(cost,idx+1,dp);
        int twoStep =cost[idx]+check(cost,idx+2,dp);
        return dp[idx]=Math.min(oneStep,twoStep);
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(check(cost,0,dp),check(cost,1,dp));
    }
}