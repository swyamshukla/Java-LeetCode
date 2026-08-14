class Solution {
    void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public void rotate(int[] arr, int k) {
         int n = arr.length;
        k %= n;
        


        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }
}