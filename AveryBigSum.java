import java.util.List;

public class AveryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
      int size = ar.size();
        long sum = 0;
        for(int i = 0;i < size;i++){
            long element = ar.get(i);
            sum = sum + element;
        }
        return sum;
    }
}
