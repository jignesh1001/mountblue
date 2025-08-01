import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {
       public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
      int n = a.size();
        k = k % n;
        List<Integer> rotated = new ArrayList<>();
        for(int i = n - k;i < n;i++){
            rotated.add(a.get(i));
        }
        for(int i = 0;i < n - k;i++){
            rotated.add(a.get(i));
        }
    List <Integer> result = new ArrayList<>();
     for(int query : queries){
         result.add(rotated.get(query));
     }
    return result;
}

}
