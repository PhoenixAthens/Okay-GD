package AlgoMap;
import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> listFromSaw = new ArrayList<>();
        int cardinality = matrix.length * matrix[0].length;
        int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        while(listFromSaw.size()<cardinality){
            for(int i=left;i<=right;i++){
                listFromSaw.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                listFromSaw.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left;i--){
                listFromSaw.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                listFromSaw.add(matrix[i][left]);
            }
            left++;
        }
        while(listFromSaw.size()>cardinality){
            listFromSaw.removeLast();
        }
        return listFromSaw;
    }
    public static void main(String... args){
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralMatrix.spiralOrder(matrix));
    }
}
