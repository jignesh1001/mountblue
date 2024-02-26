import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GemStones {
    public static int gemstones(List<String> arr) {
    // Write your code here
     int gemstonesCount = 0;
        Set<Character> gemstoneChars = new HashSet<>();
        for(char c: arr.get(0).toCharArray()){
            gemstoneChars.add(c);
        }
        for(char c:gemstoneChars){
            boolean isGemstone = true;
            for(int i = 1;i < arr.size();i++){
                if(arr.get(i).indexOf(c) == -1){
                    isGemstone = false;
                    break;
                }
            }
            if(isGemstone){
                gemstonesCount++;
            }
        }
        return gemstonesCount++;
    }
}
