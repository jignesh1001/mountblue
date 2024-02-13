public class SherlockAndSquares {
    public static int squares(int a, int b) {
        // Write your code here
            int count = 0;
          for(int i = (int) Math.sqrt(a);i<=(int) Math.sqrt(b);i++){
              if(i*i >= a && i*i <= b){
                  count++;
              }
          }
            return count;
        }
    
}
