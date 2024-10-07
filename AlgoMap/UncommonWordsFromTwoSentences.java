package AlgoMap;

import java.util.*;

public class UncommonWordsFromTwoSentences {
    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] split_s1 = s1.split(" ");
        String[] split_s2 = s2.split(" ");
        HashMap<String, Integer> mapCount = new HashMap<>();
        int val;
        for(String s: split_s1){
            val = mapCount.getOrDefault(s,0);
            mapCount.put(s,val+1);
        }
        for(String s: split_s2){
            val = mapCount.getOrDefault(s,0);
            mapCount.put(s,val+1);
        }
//        for(String s: mapCount.keySet()){
//            if(mapCount.get(s)>1)mapCount.remove(s);
//        }
        ArrayList<String> list = new ArrayList<>();
        for(String s: mapCount.keySet()){
            if(mapCount.get(s)==1)list.add(s);
        }
        String[] ans = list.toArray(new String[list.size()]);
        return ans;
    }
    public static String[] uncommonFromSentences_2(String s1, String s2) {
        HashSet<String> setOf = new HashSet<>();
        setOf.addAll(Arrays.stream(s1.split(" ")).toList());
        setOf.addAll(Arrays.stream(s2.split(" ")).toList());
        System.out.println(setOf);
        return null;
    }
    public static void main(String... args){
        System.out.println(Arrays.toString(uncommonFromSentences_2("this apple is sweet", "this apple is sour")));
    }
}
