import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
         int size = arr.size();
         int [] count = new int[size];
            for(int i = 0;i< size;i++){
                count[arr.get(i)]++;
            }
            int maxCount = 0;
            int maxType = 0;
            for(int i = 1;i<size;i++){
                if(count[i]>maxCount){
                    maxCount = count[i];
                    maxType = i;
                }
            }
            return maxType;
        }

     public static int migratoryBirdsUsingMap(List<Integer>arr){
        Map<Integer,Integer> countOfBirds = new HashMap<>();
        for(int birdType : arr){
            countOfBirds.put(birdType,countOfBirds.getOrDefault(birdType,0)+1);
            // getdefaultvalue returns value associated with given key or defaultvalue provided
            // here if value is not present it will return zero which will then be incremented by 1
            // therefore each new value will be like countOfBirds.put(birdType,1);
        } 
        int maxType = 0;
        int maxCount = 0;
        for(Map.Entry<Integer,Integer> entry:countOfBirds.entrySet()){
            if(entry.getValue() > maxCount || (entry.getValue() == maxCount) && entry.getKey() < maxType){
               maxType = entry.getKey();
               maxCount = entry.getValue();
            }
        }
        return maxType;
     }   

     public static void main(String[] args) {
        List<Integer> birds = new ArrayList<>() ;
        birds.add(12);
        birds.add(12);
        birds.add(1200);
        birds.add(1);
        birds.add(3);
        birds.add(2);
        birds.add(12);
        birds.add(5);
        birds.add(5);
        int result = migratoryBirds(birds);
        System.out.println(result);
     }
}

//https://www.hackerrank.com/contests/mountblue-technologies/challenges/migratory-birds/submissions/code/1373275173
