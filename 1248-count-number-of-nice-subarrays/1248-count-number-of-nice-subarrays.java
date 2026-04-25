class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                // even
                nums[i]=0;
            }
            else nums[i]=1;
        }

        int runSum=0;
        int count=0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        for(int i=0;i<nums.length;i++){
            runSum+=nums[i];
            if(hash.containsKey(runSum-k)){
                count+=hash.get(runSum-k);
            }
            hash.put(runSum,hash.getOrDefault(runSum,0)+1);
        }
        return count;
        


    }
}