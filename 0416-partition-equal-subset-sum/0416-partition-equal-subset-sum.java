class Solution {

boolean checkPartition(int[] nums,int idx,int totalSum,int currSum,Boolean[][]dp){

    // if(totalSum/2==currSum) return true;
    if(totalSum/2==currSum) return true; 

    if(idx<0) return false;


    if(dp[idx][currSum]!=null) return dp[idx][currSum];

    boolean pick =false;
    if(currSum + nums[idx] <= totalSum/2){
    pick = checkPartition(nums, idx-1, totalSum, currSum + nums[idx], dp);
}
    boolean skip = checkPartition(nums,idx-1,totalSum,currSum,dp);

    return dp[idx][currSum]=pick||skip;

    }



    public boolean canPartition(int[] nums) {
        int totalSum = findSum(nums);
        if(totalSum % 2 != 0) return false;

        int m=nums.length;
        int n=totalSum/2;
        Boolean[][] dp = new Boolean[m][n+1];
         
         
        return checkPartition(nums,nums.length-1,totalSum,0,dp);


    }


    int findSum(int[] nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum;
    }
}