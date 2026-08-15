class Solution {
    public int maxArea(int[] height) {

        int maxVal =0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int distance = right-left;
            int vol = distance * Math.min(height[left],height[right]);
            maxVal = Math.max(vol,maxVal);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

        }

        return maxVal;
        
    }
}