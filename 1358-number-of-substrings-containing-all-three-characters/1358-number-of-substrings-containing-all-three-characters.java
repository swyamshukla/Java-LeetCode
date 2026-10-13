class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int left=0;
        int[] abc = new int[3];
        int right=0;

        while(right<s.length()){

            abc[s.charAt(right)-'a']++;

                while(abc[0]>=1 && abc[1]>=1 && abc[2]>=1){
                            abc[s.charAt(left)-'a']--;
                            count+= s.length()-right;
                            left++;
                }

            right++;

        }

        return count;
    }
}