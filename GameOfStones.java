public class GameOfStones {
    public static String gameOfStones(int n) {
        
        if(n % 7 == 0 || n % 7 == 1){
            return "Second";
        }
        else{
            return "First";
        }
        
    
}
}
