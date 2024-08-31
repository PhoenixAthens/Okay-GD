package AlgoMap;
import java.util.ArrayList;
import java.util.List;
public class summaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i!=nums.length-1 && nums[i]+1==nums[i+1]){
                StringBuffer buffer = new StringBuffer();
                buffer.append(nums[i]);
                do {
                    i++;
                } while (i != nums.length - 1 && nums[i + 1] == nums[i] + 1);
                buffer.append('-');
                buffer.append('>');
                buffer.append(nums[i]);
                result.add(buffer.toString());
            }else{
                result.add(String.valueOf(nums[i]));
            }
        }
        return result;
    }
    public static void main(String... args){
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
}
