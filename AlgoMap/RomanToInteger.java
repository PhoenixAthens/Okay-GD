package AlgoMap;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] charFromStr = s.toCharArray();
        int num = map.get(charFromStr[0]);
        int prev = num;
        for(int i=1;i<charFromStr.length;i++){
            int val = map.get(charFromStr[i]);
            if(val > prev){
                num-=2*prev;
            }
            num+=val;
            prev = val;
        }
        return num;
    }
    public static void main(String... args){
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

    }
}
