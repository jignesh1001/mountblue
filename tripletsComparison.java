import java.util.ArrayList;
import java.util.List;

public class tripletsComparison {
    
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
         int alicePoints =0;
         int bobPoints = 0;
         for(int i = 0; i<3;i++){
             if(a.get(i) > b.get(i)){
                 alicePoints++;
             }
             if(a.get(i)< b.get(i)){
                 bobPoints++;
             }
         }
        List <Integer> result = new ArrayList<>(2);
        result.add(alicePoints);
        result.add(bobPoints);
        return result;
    }
}
