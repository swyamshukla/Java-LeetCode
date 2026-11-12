/**
 * CountSum
 */
public class CountSum {
    static int sum(int[] arr,int idx,int sum,int target){
        if(idx==arr.length){
            return  sum==target ? 1: 0;
        }
        int pick = sum(arr, idx+1, sum+arr[idx], target);
        int skip = sum(arr, idx+1, sum, target);

        return pick+skip;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,1}, 0, 0, 2));;
    }
}