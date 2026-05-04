class Solution {

    int lca(String word1,String word2,int len1,int len2,int[][]dp){
        if(len1<0||len2<0 ) return 0;
        if(dp[len1][len2]!=-1) return dp[len1][len2];
        if(word1.charAt(len1)==word2.charAt(len2)){
            return 1 + lca(word1,word2,len1-1,len2-1,dp);
        }
        return dp[len1][len2]= Math.max(lca(word1,word2,len1,len2-1,dp),lca(word1,word2,len1-1,len2,dp));

    }

    public int minDistance(String word1, String word2) {

        int[][] dp= new int[word1.length()][word2.length()];
        for(int[] arr:dp) Arrays.fill(arr,-1);

        int caught = lca(word1,word2,word1.length()-1,word2.length()-1,dp);
        



        return word1.length()+word2.length()-2*caught;

    
        
    }
}