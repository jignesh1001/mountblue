import java.util.List;

public class MaxMin {
        public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int size = arr.size();
    long totalSum = 0;
    long minElement = Long.MAX_VALUE;
    long maxElement = Long.MIN_VALUE;
    
    for(int i = 0;i<size;i++){
        long element = arr.get(i);
        totalSum += element;
        minElement = Math.min(minElement,element);
        maxElement = Math.max(maxElement,element);
    }
    long minSum = totalSum - maxElement ;
    long maxSum = totalSum - minElement;
    
    System.out.println(minSum + " " + maxSum);
    }

}
