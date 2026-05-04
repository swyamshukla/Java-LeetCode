class Solution {
    int pallindrome(String s,int left,int right,int[][]dp){
        if(left>right) return 0;
        if(left==right) return 1;

        if(dp[left][right]!=-1) return dp[left][right];
        

        if(s.charAt(left)==s.charAt(right)){
            return 2+ pallindrome(s,left+1,right-1,dp);
        }
        return dp[left][right]= Math.max(pallindrome(s,left+1,right,dp),pallindrome(s,left,right-1,dp));
    }
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];

        for(int[] t:dp){
            Arrays.fill(t,-1);
        }

        return pallindrome(s,0,s.length()-1,dp);


    }
}