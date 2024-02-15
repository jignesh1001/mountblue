public class HalloweenSale {
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
            int count = 0;
            while(s >= p){
                s -= p;
                count++;
                p = Math.max(m,p-d);
            }
          return count;
        }
    public static void main(String[] args) {
       System.out.println(howManyGames(20, 3, 6, 80)); 
    }
}
