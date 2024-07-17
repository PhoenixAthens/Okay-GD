package Searching2DMatrix;

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int startO = 0;
        int endO = matrix.length - 1;
        int startI = 0;
        int endI = matrix[0].length - 1;
        int midO = 0;
        while (startO <= endO) {
            midO = startO + (endO - startO) / 2;
            if (
                target >= matrix[midO][startI] && target <= matrix[midO][endI]
            ) break;
            else if (target > matrix[midO][endI]) {
                startO = midO + 1;
            } else {
                endO = midO - 1;
            }
        }
        while (startI < endI) {
            int midI = startI + (endI - startI) / 2;
            if (target == matrix[midO][midI]) {
                return true;
            } else if (target > matrix[midO][midI]) {
                startI = midI + 1;
            } else {
                endI = midI - 1;
            }
        }
        return target == matrix[midO][startI];
    }
}
