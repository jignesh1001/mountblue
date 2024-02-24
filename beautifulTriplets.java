import java.util.*;
public static int beautifulTriplets(int d, List<Integer> arr) {
    int count = 0;
    Set<Integer> set = new HashSet<>();
    for (int num : arr) {
        set.add(num);
    }

    for (int num : arr) {
        if (set.contains(num + d) && set.contains(num + 2 * d)) {
            count++;
        }
    }

    return count;
}