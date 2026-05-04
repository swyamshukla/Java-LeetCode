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
        // Arrays.fill(dp,-1);
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            dp[i]= cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}