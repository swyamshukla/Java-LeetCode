import java.util.ArrayList;

public class Subsequence {
    
    static void subset(ArrayList<String> arr,String str,int i,String temp){
        if(i==str.length()){
            arr.add(temp);
            return ;
        }
        subset(arr, str, i+1,temp+str.charAt(i));
        subset(arr, str, i+1,temp);

    }
    static void subsetBacktracking(ArrayList<String> arr, String str,int i, String temp){

        arr.add(temp+str.charAt(i));
        


    }

    // pick AND skip pattern 
    // 1. Add at every end of recursion call
    
    /*
    if (i == str.length()) {
            Include empty subset "" or check if (temp.length() != 0) if you don't want ""
            arr.add(temp);
            return;
        }
    */




    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        // print all the subset of string str = 'abc'
        String str = "abc";
        subset(arr,str,0,"");
        System.out.println(arr);

        
    }
}
