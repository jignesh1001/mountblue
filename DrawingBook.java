public class DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
            if (p == 1 || p == n || n == 0 || p == 0) {
                return 0;
            }
            int totalTurnsRequired = n / 2;
            int targetTurnsRequired = p / 2;
            int targetTurnsRequiredFromBack = totalTurnsRequired - targetTurnsRequired;
            
            return Math.min(targetTurnsRequired, targetTurnsRequiredFromBack);
    
        }
}
