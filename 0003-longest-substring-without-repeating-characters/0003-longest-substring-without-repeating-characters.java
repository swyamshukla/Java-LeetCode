class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder str = new StringBuilder();
        int maxLen=0;
        for(char ch :s.toCharArray()){
            while(str.toString().contains(String.valueOf(ch))){
                str.deleteCharAt(0);
            }
            str.append(ch);
            maxLen=Math.max(maxLen,str.length());
        }

        return maxLen;
        
    }
}