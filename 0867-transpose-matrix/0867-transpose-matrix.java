class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int [][] ans = new int[m][n];

        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                ans[col][row] = matrix[row][col];
            }
        }
        return ans;
        
    }
}