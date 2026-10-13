class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hash = new HashMap<>();
        // hash.put(0,-1);

        for(int i=0;i<nums.length;i++){

        int val = target-nums[i];
        if(hash.containsKey(val)){
            int key = hash.get(val);
            return new int[]{key,i};
        }
        hash.put(nums[i],i);
        
        }   

        return new int[]{};
    }
}