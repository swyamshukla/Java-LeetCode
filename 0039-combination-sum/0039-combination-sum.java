class Solution {

    void subset(List<List<Integer>> res,List<Integer> temp,int[] can, int idx,int target,int sum){
        if(sum>target) return;
        if(idx==can.length || sum==target){
            if(sum==target){
                    res.add(new ArrayList<>(temp));
            }
            return;
        }
        
        temp.add(can[idx]); // pick
        subset(res,temp,can,idx,target, sum+can[idx]);   
        if(temp.size()!=0) temp.remove(temp.size()-1); // skip 
        subset(res,temp,can,idx+1,target, sum);   


    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        subset(res,new ArrayList<>(),candidates,0,target,0);
        return res;
    }
}