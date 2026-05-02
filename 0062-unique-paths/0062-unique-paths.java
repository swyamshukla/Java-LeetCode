class Solution {
    int ways(int m,int n){
        if(m==1 || n==1) return 1;
        return ways(m-1,n)+ways(m,n-1);
    }
    
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n];

        //row fill by 1 of dp
        for(int row=0;row<m;row++){
            dp[row][0]=1;
        }
        for(int col=0;col<n;col++){
            dp[0][col]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
        
    }
}