package AlgoMap;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String toUse = strs[0];
        for(String string: strs){
            if(toUse.length()>string.length()){
                toUse = string;
            }
        }
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < toUse.length(); i++){
            boolean flag=true;
            for(String s: strs){
                if(s.charAt(i)!=toUse.charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag)result.append(toUse.charAt(i));
            else break;
        }
        return result.toString();
    }
}
