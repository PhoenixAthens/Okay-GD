package RangeSumQuery2D;

public class RangeSum {

    class NumMatrix {

        int[][] MatrixPrefixSum;

        public NumMatrix(int[][] matrix) {
            MatrixPrefixSum = new int[matrix.length + 1][matrix[0].length + 1];
            for (int i = 1; i < MatrixPrefixSum.length; i++) {
                for (int j = 1; j < MatrixPrefixSum[0].length; j++) {
                    MatrixPrefixSum[i][j] = matrix[i - 1][j - 1] +
                    MatrixPrefixSum[i - 1][j] +
                    MatrixPrefixSum[i][j - 1] -
                    MatrixPrefixSum[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return (
                MatrixPrefixSum[row2 + 1][col2 + 1] -
                MatrixPrefixSum[row1][col2 + 1] -
                MatrixPrefixSum[row2 + 1][col1] +
                MatrixPrefixSum[row1][col1]
            );
        }
    }
    /**
     * Your NumMatrix object will be instantiated and called as such:
     * NumMatrix obj = new NumMatrix(matrix);
     * int param_1 = obj.sumRegion(row1,col1,row2,col2);
     */
}
