class Solution {
    void subset(List<List<Integer>> result,List<Integer> temp,int idx, int[] can, int target,int sum){
        if(sum>target ) return;
        if(idx==can.length ){
            if(sum==target){
                result.add(new ArrayList<>(temp));
            }
            return ;
        }
        temp.add(can[idx]); //pick
        subset(result,temp,idx+1,can,target,sum+can[idx]);
        temp.remove(temp.size()-1); // remove back tracking
        while (idx + 1 < can.length && can[idx] == can[idx + 1]) idx++; // skip duplicate
        subset(result,temp,idx+1,can,target,sum);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        subset(result,new ArrayList<>(),0,candidates,target,0);
        return result;

        
    }
}