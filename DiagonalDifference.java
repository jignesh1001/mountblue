import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int sumLeftToRight = 0;
        int sumRightToLeft = 0;
        int n = arr.size();
        for(int i = 0;i<n;i++){
            sumLeftToRight += arr.get(i).get(i);
            sumRightToLeft += arr.get(i).get(n-i-1);
        }
         int diff = Math.abs(sumRightToLeft - sumLeftToRight);
          return diff;
    }
}
