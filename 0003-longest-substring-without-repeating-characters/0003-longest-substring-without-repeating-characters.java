class Solution {
    public int lengthOfLongestSubstring(String s) {
        // StringBuilder str = new StringBuilder();
        String str=new String();
        int maxLen=0;
        int i=0;

        for(char ch :s.toCharArray()){
            while(str.contains(String.valueOf(ch))){
                str = str.substring(i+1);
            }
            str=str+String.valueOf(ch);
            maxLen=Math.max(maxLen,str.length());
        }

        return maxLen;
        
    }
}