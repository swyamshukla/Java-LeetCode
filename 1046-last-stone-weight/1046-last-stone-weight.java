class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int arr : stones){
            maxHeap.add(arr);
        }

        while(maxHeap.size()>1){
            int y = maxHeap.remove();
            int x = maxHeap.remove();
            if(y-x>0){
                maxHeap.add(y-x);
            }
        }
        if(maxHeap.size()==1) return maxHeap.peek();
        return 0;


    }
}