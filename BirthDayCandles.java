import java.util.List;

public class BirthDayCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        int size = candles.size();
        int maxElement = 0;
        int count = 0;
        for(int i =0 ;i<size;i++){
            int element = candles.get(i);
            if(element > maxElement){
                maxElement = element;
                count = 1;
            }
            else if(element == maxElement){
                count++;
            }
        }
        return count;

    }
}


// https://www.hackerrank.com/contests/mountblue-technologies/challenges/birthday-cake-candles/submissions/code/1373286110