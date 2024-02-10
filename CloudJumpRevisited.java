public class CloudJumpRevisited {
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
         int position = 0;
        while(true){
            position = (position + k) % c.length;
            if(c[position] == 0){
                energy--;
            }
            else{
                energy = energy - 3;
            }
            if(position == 0){
                return energy;
            }
        }
        
    }
}
