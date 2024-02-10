public class catAndMouse {
    static String getMouse(int x, int y, int z) {
        int distAtoC = Math.abs(z-x);
        int distBtoC = Math.abs(z-y);
        
        if(distAtoC < distBtoC){
            return "Cat A";
        }
        else if(distBtoC < distAtoC){
            return "Cat B";
            
        }
        else {
            return "Mouse C";
        }

    }
}
