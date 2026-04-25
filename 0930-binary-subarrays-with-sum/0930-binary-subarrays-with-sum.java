class Solution {

    int check(int[] nums,int goal){
        int left=0;
        int right=0;
        int currSum=0;
        int freq=0;
        if(goal<0) return 0;

        while(right<nums.length){
            currSum+=nums[right];
            while(currSum>goal){
                currSum-=nums[left++];
            }

            freq+=right-left+1;
            right++;
        }
        return freq;
    }
    
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int r1=check(nums,goal);
        int r2=check(nums,goal-1);

        return r1-r2;

    }
}