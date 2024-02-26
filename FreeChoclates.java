public class FreeChoclates {
    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
            int init = n / c;
            int wrappers = init;
            while(wrappers >= m){
                int freeChocolates = wrappers /m ;
                init += freeChocolates;
                wrappers = wrappers % m + freeChocolates;
            }
           return init;
        }
}
