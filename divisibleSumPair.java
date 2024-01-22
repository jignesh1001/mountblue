import java.util.List;

public class divisibleSumPair {
        public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
        int size = ar.size();
        int count = 0;
        for(int i = 0;i<size-1;i++){
            for(int j = i+1;j<size;j++){
                if((ar.get(i) + ar.get(j) ) % k == 0){
                    count++;
                }
            }
        }
        return count;

    }

}
