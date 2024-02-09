public class ViralAdvertising {
    public static int viralAdvertising(int n) {
        // Write your code here
          int shared = 5,liked = 2,cumlative = 2;
            for(int i = 1; i< n ;i++){
                shared = liked * 3;
                liked = shared / 2;
                cumlative += liked;
                
            }
            return cumlative;
        }
}
