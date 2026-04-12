class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i],hash.get(nums[i])+1);
            }
            else{
                hash.put(nums[i],1);
            }
        }

        // List<Pair> list = new ArrayList<>();

        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b)->a.freq-b.freq);

        for(int ele :hash.keySet()){
            minHeap.add(new Pair(ele,hash.get(ele)));
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }


        // for(int key: hash.keySet()){
        //     list.add(new Pair(key,hash.get(key)));
        // }
        // Collections.sort(list,(a,b)->b.freq-a.freq);

        int[] result = new int[k];


        for(int i=0;i<k;i++){
            result[i]=minHeap.remove().key;
        }
        return result;
    }
}


class Pair{
    int key;
    int freq;
    Pair(int key,int freq){
        this.key=key;
        this.freq=freq;
    }
}