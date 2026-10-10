class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        

        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(mat[row][col] == 1){
                    int rowCount = 0;
                    int colCount = 0;
                    for(int j=0; j<n; j++){
                        if(mat[row][j]==1){
                        rowCount++;
                        }
                    }
                     for(int i=0; i<m; i++){
                        if(mat[i][col]==1){
                        colCount++;
                        }
                    }
                
               if(rowCount==1 && colCount==1){
                count++;
               }

                }

            }
        }
return count;
        
    }
}