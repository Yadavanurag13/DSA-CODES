package Array;

public class setMatrixZero {
    public void setZeroes(int[][] matrix) {
        int m=matrix[0].length;
        int n=matrix.length;
        int col0=1;
        //In brute force approch
        // int col[n]=0 ->matrix[0][...]
        //int row[n]=0 -> matrix[...][0]

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    //mark ith row
                    matrix[i][0]=0;
                    //mark jth col
                    if(j!=0)
                    matrix[0][j]=0;
                    else
                    col0=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if(matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}
