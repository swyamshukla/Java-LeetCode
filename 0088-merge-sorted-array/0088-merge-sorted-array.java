class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int readA = m-1;
        int readB = n-1;
        int write = m+n-1;

        while(readA>=0 && readB>=0){
            if(nums1[readA]>nums2[readB]){
                nums1[write--] = nums1[readA--];
            }
            else{
                nums1[write--]=nums2[readB--];
            }
        
 
        }
        
        while(readB>=0){
            nums1[write]=nums2[readB];
            readB--;
            write--;
        }
        
    }
}