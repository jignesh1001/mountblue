import java.util.ArrayList;
import java.util.List;

public class BasketBallTracker {

    public static void main(String[] args) {
        List<Integer> scores = List.of(15, 20, 18, 25, 22, 17, 19, 21, 16, 23);

        List<Integer> result = breakingRecords(scores);

        // Display results
        System.out.println("Times Broke Most Points Record: " + result.get(0));
        System.out.println("Times Broke Least Points Record: " + result.get(1));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int size = scores.size();
        int best = scores.get(0);
        int low = scores.get(0);
        int beatenBest = 0, beatenLow = 0;

        for (int i = 1; i < size; i++) {
            int element = scores.get(i);
            if (element > best) {
                best = element;
                beatenBest++;
            }
            if (element < low) {
                low = element;
                beatenLow++;
            }
    
        }

        List<Integer> result = new ArrayList<>();
        result.add(beatenBest);
        result.add(beatenLow);

        return result;
    }
}
