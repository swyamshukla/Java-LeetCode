class Solution {
    public int longestOnes(int[] nums, int k) {

        int maxLen=0;
        int left =0;
        int zero=0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]==1){
                maxLen=Math.max(maxLen,right-left+1);
            }
            else{
                if(zero<k){
                    maxLen=Math.max(maxLen,right-left+1);
                    zero++;
                }
                else{
                    while(zero==k){
                        if(nums[left]==0){
                            zero--;
                        }
                        left++;
                }
                maxLen=Math.max(maxLen,right-left+1);
                zero++;


            }
            }

        }

        return maxLen;
        
    }
}