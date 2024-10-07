package AlgoMap;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        char[] arr = s.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for(int row=0;row<numRows;row++){
            for(int i=0;i<Integer.MAX_VALUE;i+=(numRows-1)*2) {
                int idx = row + i;
                if (idx >= arr.length) break;
                buffer.append(arr[idx]);

                if (row == 0 || row == numRows - 1) continue;
                idx = i + (numRows - 1) * 2 - row;
                if (idx >= arr.length) break;
                buffer.append(arr[idx]);
            }
        }
        return buffer.toString();
    }
}
