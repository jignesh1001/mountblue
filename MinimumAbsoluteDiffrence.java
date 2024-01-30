import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDiffrence {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        int minimumDiff = Integer.MAX_VALUE;
        for(int i = 0;i<arr.size() -1;i++){
            int element = arr.get(i);
            int secondElement = arr.get(i+1);
            int minimumDiffR = Math.abs(element-secondElement);
            if(minimumDiffR < minimumDiff){
                minimumDiff = minimumDiffR;
                
            }
            }
        
        
        return minimumDiff;
    }
}
