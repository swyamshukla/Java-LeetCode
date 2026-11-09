
import java.util.Scanner;

public class UniquePathWays {

    static int countPaths(int r, int c , int i, int j, boolean[][] br) {
        if(r<0 || c<0 || r>=i || c>=j) return 0;
        if(r==0 && c==0) return 1;
        if(br[r][c]) return 0;
        br[r][c] =true;
        int top = countPaths(r-1, c, i, j, br);
        int bottom = countPaths(r+1, c, i, j, br);
        int left = countPaths(r, c-1, i, j, br);
        int right = countPaths(r, c+1, i, j, br);
        br[r][c]=false;

        return top+bottom+left+right;
    }

    static int uniquePaths(int m, int n) {

        boolean[][] visited = new boolean[m][n];

        return countPaths(m-1, n-1, m, n, visited);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Invalid dimensions");
        } else {
            System.out.println(uniquePaths(m, n));
        }

        sc.close();
    }
}
