package AlgoMap;

import java.util.Arrays;

public class DividePlayersIntoTeamsOfEqualSize {
    public long dividePlayers(int[] skill) {
        Arrays.parallelSort(skill);
        long sum = skill[0]+skill[skill.length-1];
        int prod = skill[0]*skill[skill.length-1];
        int start = 1;
        int end = skill.length-2;
        while(start<end){
            if((skill[start]+skill[end])!=sum)return -1;
            prod+=skill[start++]*skill[end--];
        }
        return prod;
    }
}
