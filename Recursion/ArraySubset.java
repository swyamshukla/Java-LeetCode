import java.util.ArrayList;

public class ArraySubset {
    
    static void subset(int[] arr,int idx,ArrayList<Integer> li, ArrayList<ArrayList<Integer>> res){

        if(idx==arr.length){
            res.add(new ArrayList<>(li));return;
        }

        li.add(arr[idx]);
        subset(arr, idx+1, li,res);
        li.remove(li.size()-1); // backtracking 
        subset(arr, idx+1, li,res);


    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        subset(arr, 0, new ArrayList<>(), res);
        System.out.println(res);


    }
}
