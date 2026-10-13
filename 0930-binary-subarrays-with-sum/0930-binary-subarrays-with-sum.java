class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int runningSum=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            runningSum+=nums[i];
            if(map.containsKey(runningSum-goal)){
                count+=map.get(runningSum-goal);
            }
            map.put(runningSum,map.getOrDefault(runningSum,0)+1);
        }   
        return count;
    }
}