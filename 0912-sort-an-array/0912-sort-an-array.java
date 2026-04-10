class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int i=0;
        while(i<nums.length){
            minHeap.add(nums[i]);
            i++;
        }
        i=0;
        while(i<nums.length){
            nums[i]=minHeap.remove();
            i++;
        }

        return nums;
        
    }
}