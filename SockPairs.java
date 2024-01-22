import java.util.HashMap;
import java.util.Map;

public class SockPairs {

    public static int countSockPairs(int[] sockColors) {
        Map<Integer, Integer> sockCount = new HashMap<>();
        int pairCount = 0;

        // Count the occurrences of each color
        for (int color : sockColors) {
            sockCount.put(color, sockCount.getOrDefault(color, 0) + 1);
        }

        // Calculate the number of pairs for each color
        for (int count : sockCount.values()) {
            pairCount += count / 2;
        }

        return pairCount;
    }

    public static void main(String[] args) {
        int[] sockColors = {1, 2, 1, 2, 3, 4, 5, 4, 3};
        int result = countSockPairs(sockColors);
        System.out.println("The number of pairs of socks is: " + result);
    }
}
