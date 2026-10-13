class Solution {
    public int lengthOfLongestSubstring(String s) {
        // StringBuilder str = new StringBuilder();
        // String str=new String();

        HashSet<Character> hash = new HashSet<>();


        int maxLen=0;
        int left=0;
        int right=0;

        while(right<s.length()){
            char ch= s.charAt(right);
            while(hash.contains(ch)){
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(ch);

            maxLen = Math.max(maxLen,right-left+1);


            right++;

        }


        return maxLen;
        
    }
}