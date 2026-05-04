class Solution {

    // int count(int[][]matrix,int row,int col){

    // }

    public int countSquares(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][]dp= new int[row+1][col+1];
        dp[0][0]=matrix[0][0];

        int sum=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                // row 1 with no columne
                if(i==0) dp[0][j]=matrix[0][j];
                else if(j==0) dp[i][0]=matrix[i][0];
                else{
                    if(matrix[i][j]==1){
                        int left = dp[i][j-1];
                        int up= dp[i-1][j];
                        int dia=dp[i-1][j-1] ;

                        dp[i][j]= Math.min(left,Math.min(up,dia)) + matrix[i][j];

                    }
                }
                sum+=dp[i][j];
            }
        }

        return sum;


        
    }
}