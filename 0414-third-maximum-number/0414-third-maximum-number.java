class Solution {
    public int thirdMax(int[] nums) {


        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        boolean flag=false;

        for(int val: nums){
            if(firstMax<val){
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=val;
            }
            else if(secondMax<val && val!=firstMax){
                thirdMax=secondMax;
                secondMax=val;
            }
            else if(thirdMax<=val && val!=firstMax && val!=secondMax){
                thirdMax=val;
                flag=true;
            }

        }

        return thirdMax==Long.MIN_VALUE && !flag ? (int)firstMax : (int)thirdMax; 





        // ArrayList<Integer> arr  = new ArrayList<>();
        // HashSet<Integer> hash = new HashSet<>();

        // for(int val: nums){
        //     if(!hash.contains(val)){
        //         arr.add(val);
        //         hash.add(val);
        //     }
        // }
        // Collections.sort(arr);

        // return (arr.size()>=3)? arr.get(arr.size()-3) : arr.get(arr.size()-1);
        
    }
}