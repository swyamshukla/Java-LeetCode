package Recursion;

import java.util.ArrayList;

public class RecursionAllPattern {

static void subsequence(
    int i,
    String s,
    String temp
) {
    // Base case
    if (i == s.length()) {
        System.out.println(temp);
        return;
    }

    // PICK
    subsequence(i+1, s, temp+s.charAt(i));
    // SKIP
    subsequence(i+1, s, temp);
}


static boolean isSubsequenceSum(
    int i,
    int[] arr,
    int sum,
    int target
) {
     // Base case
    if(sum==target){
        return true;
    }
    if(i==arr.length){
        return false;
    }
    // PICK
    boolean pick=isSubsequenceSum(i+1, arr, sum+arr[i], target);
    // SKIP
    if(pick) return true;
    boolean skip=isSubsequenceSum(i+1, arr, sum, target);

    return pick || skip;
}

static boolean findOne(
    int i,
    int[] arr,
    int sum,
    int target,
    ArrayList<Integer> temp
) {
    // Your implementation
    if(sum==target){
        return true;
    }
    if(i==arr.length){
        return false;
    }

    temp.add(arr[i]);
    boolean pick= findOne(i+1, arr, sum+arr[i], target, temp);
    if(pick) return true;
    temp.remove(temp.size()-1);

    boolean skip= findOne(i+1, arr, sum, target, temp);


    return pick || skip ;
}

static void printAll(
    int i,
    int[] arr,
    int sum,
    int target,
    ArrayList<Integer> temp
) {
    // Your implementation
    if(sum==target){
        System.out.println(temp);
        return;
    }
    if(i==arr.length || sum>target){
        return;
    }
    temp.add(arr[i]);
    printAll(i+1, arr, sum+arr[i], target, temp);
    temp.remove(temp.size()-1);
    printAll(i+1, arr, sum, target, temp);

}

static int countSubsequence(
    int i,
    int[] arr,
    int sum,
    int target
) {
    // BASE CASE
    if(i==arr.length){
        if(sum==target){
            return  1;
        }
        return 0;
    }
    // PICK

    int pick = countSubsequence(i+1, arr, sum+arr[i], target);

    // SKIP
    int skip = countSubsequence(i+1, arr, sum, target);


    return pick+skip;

}

static boolean subsetSum(
    int i,
    int[] arr,
    int target
) {
    // BASE CASE
    if(target==0){
        return  true;
    }
    if (i==arr.length) {
        return false;
    }

    // PICK
    boolean pick = subsetSum(i+1, arr, target-arr[i]);
    if(pick) return true;
    // SKIP
    boolean skip = subsetSum(i+1, arr, target);

    return skip;
}

static void combinationSum(
    int i,
    int[] arr,
    int target,
    ArrayList<Integer> temp
) {
    // BASE CASE
    if(target==0){
        System.out.println(temp);
        return ;
    }
    // PICK
    temp.add(arr[i]);
    combinationSum(i, arr, target-arr[i], temp);
    // BACKTRACK
    temp.remove(temp.size()-1);
    combinationSum(i+1, arr, target, temp);

    // SKIP
}

public static void main(String[] args) {
        
    }
}


/*
    int[] arr = {1, 2, 1};
    int target = 2;
*/

