class KthLargest {

    PriorityQueue<Integer> minHeap;
    int size;


    public KthLargest(int k, int[] nums) {
        size=k;
        minHeap= new PriorityQueue<>(); // min
        for(int i=0;i<nums.length;i++) addHeap(nums[i]);
        
    }

    public void addHeap(int val){
        minHeap.add(val);
        if(minHeap.size()>size) minHeap.remove();
    }
    
    public int add(int val) {
        addHeap(val);
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */