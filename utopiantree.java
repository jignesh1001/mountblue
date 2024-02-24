public class utopiantree {
    public static int utopianTree(int n) {
        // Write your code here
            int h = 1;
            if( n <= 0){
                return 1;
            }
            for(int i = 1;i <= n; i++){
                if(i % 2 == 0){
                    h = h + 1;
                }
                else{
                    h = h * 2;
                }
            }
            return h;
            
        }
    public static void main(String args[]){
      System.out.println(utopianTree(4));        
    }    
}
