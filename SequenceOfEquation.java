import java.util.ArrayList;
import java.util.List;

public class SequenceOfEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
      List<Integer> ans = new ArrayList<>();
        
        for(int x = 1;x <= p.size();x++){
            int indexOfX = p.indexOf(x) + 1;
            ans.add(p.indexOf(indexOfX) + 1);
        }
        return ans;
    }
}
