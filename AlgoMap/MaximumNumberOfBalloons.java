package AlgoMap;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> balloon = new HashMap<>(Map.of('a',0,'b',0,'l',0,'n',0,'o',0));

        char[] fromText = text.toCharArray();
        for(char c: fromText){
            if(balloon.containsKey(c))balloon.put(c,balloon.get(c)+1);
        }
        balloon.put('l',balloon.get('l')/2);
        balloon.put('o',balloon.get('o')/2);
        int minVal = 0;
        for(char c: balloon.keySet()){
            minVal=Math.min(minVal,balloon.get(c));
        }
        return minVal;
    }
}
