class Solution {
    public boolean check(int[] nums) {
        int drop=0;
        boolean sort =false;
        if(nums[0]<nums[nums.length-1]){
            sort=true;
        }

        for(int i=0;i<nums.length-1;i++){ 
            if(nums[i]>nums[i+1]) drop++;
        }

        return (sort)? drop==0:drop==1 || drop==0  ;
        
    }
}