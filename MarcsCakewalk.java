import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MarcsCakewalk {
    public static long marcsCakewalk(List<Integer> calorie) {
    // Write your code here
        long miles = 0;
        // Collections.sort(calorie);
        // Collections.reverse(calorie);
        Collections.sort(calorie,Collections.reverseOrder());
        for(int i = 0;i<calorie.size();i++){
            miles = (long)(miles + (calorie.get(i) * Math.pow(2,i)));
        }
        System.out.println(miles);
        return miles;
    }
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(5,10,7);
        marcsCakewalk(numbers);
    }
}
