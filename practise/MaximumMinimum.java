package practise;
import java.util.ArrayList;
import java.util.List;

public class MaximumMinimum {
    public static void maximin(List<Integer> arr){
        int size = arr.size();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<size;i++){
            int element = arr.get(i);
            max = Math.max(max,element);
            min = Math.min(min,element);
        }
        System.out.println(max+" "+min);
    }
    public static void main(String[] args) {
        List<Integer> sampleList = new ArrayList<>();
        sampleList.add(12);
        sampleList.add(23);
        sampleList.add(89);
        sampleList.add(90);
        sampleList.add(25);
        maximin(sampleList);

    }
}
