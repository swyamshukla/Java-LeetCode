class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> hash = new HashSet<>();


        int write=0;
        int read=0;
        hash.add(nums[0]);
        while(read<nums.length){
            if(!hash.contains(nums[read])){
                write++;
                nums[write]=nums[read];
                hash.add(nums[read]);
            }

            read++;
        }
        return hash.size();
        
    }
}