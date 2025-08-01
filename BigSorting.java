import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
    // Write your code here
       Collections.sort(unsorted,new Comparator<String>(){
           public int compare(String a ,String b){
               if(a.length() > b.length()) return 1;
               else if(a.length() < b.length()) return -1;
               else {
                   BigInteger b1 = new BigInteger(a);
                   BigInteger b2 = new BigInteger(b);
                   return b1.compareTo(b2);  
               }
           }
       });
        return unsorted;

    }
}
