import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    
    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for(Integer num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int result =0;
         for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
              result = entry.getKey();   
            }
        }
       return result;

    }
}
