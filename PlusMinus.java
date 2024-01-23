import java.util.List;

class PlusMinus{
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int size = arr.size();
    int negatives = 0;
    int positives = 0;
    int zeros = 0;
       for(int i = 0;i<size;i++){
           int element = arr.get(i);
           if( element> 0){
               positives++;
           }
           else if(element < 0){
               negatives++;
           }
           else{
               zeros++;
           }
       }
       System.out.println(String.format("%.6f",(double)positives/size));
       System.out.println(String.format("%.6f",(double)negatives/size));
       System.out.println(String.format("%.6f",(double)zeros/size));
    }
}