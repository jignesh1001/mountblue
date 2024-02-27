public class TaumAndBirthDay {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
           long cost = 0;
    
            if (bc > wc + z) {
                cost += (w + b) * wc + b * z;
            } else if (wc > bc + z) {
                cost += (w + b) * bc + w * z;
            } else {
                cost += b * bc + w * wc;
            }
    
            return cost;
        }
}
