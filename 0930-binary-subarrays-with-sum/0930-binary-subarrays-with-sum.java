class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // USNNG PREFIX + HASMAP
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        int freq=0;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(hash.containsKey(currSum-goal)){
                freq+=hash.get(currSum-goal);
            }
            hash.put(currSum,hash.getOrDefault(currSum,0)+1);
        }
        return freq;



        
    }
}