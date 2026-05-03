class Solution {

    long check(int[] coins,int amount,int idx,long[][]dp){

        if(idx<0) {
            if(amount!=0) return Integer.MAX_VALUE;
            return 0;
        }

        if(dp[idx][amount]!=-1) return dp[idx][amount];
       
       long skip = check(coins,amount,idx-1,dp);
       long pick=Integer.MAX_VALUE;
        if(amount-coins[idx]>=0){
        pick = 1 + check(coins,amount-coins[idx],idx,dp);
        }
        return dp[idx][amount]=Math.min(pick,skip);

    }
    public int coinChange(int[] coins, int amount) {
        long[][] dp  = new long[coins.length][amount+1];  

        for(long[]arr:dp) Arrays.fill(arr,-1);

        int ans=(int) check(coins,amount,coins.length-1,dp);
        return (ans==Integer.MAX_VALUE)? -1 :ans;

    }
}