class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int currSum=0;
        int left=0;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        // sum[i,j]  = prefix[j]-prefix[i-1];
        //prefix[i-1]=prefix[j]-sum[i,j] ;

        for(int right=0;right<nums.length;right++){
            currSum+=nums[right];
            int target = currSum-k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }

            map.put(currSum,map.getOrDefault(currSum,0)+1);


        }

        return count;

        }
        

}