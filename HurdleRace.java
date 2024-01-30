import java.util.List;

public class HurdleRace {
     public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
        int maxHeight = 0;
       for(int i = 0;i<height.size();i++){
           int element = height.get(i);
           
           if(element > maxHeight){
               maxHeight = element;
           }
           
       }
        int result =  maxHeight - k;
        if(result < 0){
            return  0;
        }
        else{
            return result;
        }
    }
}
