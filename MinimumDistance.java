import java.util.List;

public class MinimumDistance {
    public static int minimumDistances(List<Integer> a) {
    // Write your code here
       int minDistance = Integer.MAX_VALUE;
        for(int i = 0;i<a.size();i++){
            for(int j = i + 1;j<a.size();j++){
                if(a.get(i).equals(a.get(j)) &&  j - i <= minDistance ){
                    minDistance = j - i;
                }
            }
        }
        if(minDistance == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return minDistance;
        }
        
    }

}
