import java.util.List;

public class pickingnumbers {
    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
      int[] count = new int[101];
        
        for(int i = 0; i< a.size();i++){
            count[a.get(i)]++;
        }
        int max = 0;
        
        for(int i = 1;i <= 100;i++){
            max = Math.max(max,count[i] + count[i -1]);
        }
        return max;
    }
    
}
