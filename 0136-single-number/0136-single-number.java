class Solution {
    public int singleNumber(int[] nums) {

        if(nums.length<=2) return nums[nums.length-1];

        Arrays.sort(nums);

        int odd=0;
        int even=1;
        while(even<nums.length){
            if(nums[odd]!=nums[even]) return nums[odd];
            odd+=2;
            even+=2;
        }

        return nums[odd];
        
    }
}