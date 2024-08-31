package AlgoMap;

public class isSubSequence {
    public boolean isSubsequence(String s, String t) {
        if(t.length() <= s.length()){
            return s.equals(t);
        }
        char[] fromS = s.toCharArray();
        char[] fromT = t.toCharArray();
        int j = 0;
        for(int i=0; i < fromT.length && j < fromS.length; i++){
            if(fromS[j]==fromT[i])j++;
        }
        return j==s.length();

    }
    public static void main(String... args){

    }
}
