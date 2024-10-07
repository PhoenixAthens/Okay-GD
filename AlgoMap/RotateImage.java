package AlgoMap;

public class RotateImage {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
            for(int j=i;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        int limit = matrix[0].length;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<limit/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][limit-1-j];
                matrix[i][limit-1-j] = temp;
            }
    }
}
