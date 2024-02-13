import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static String sort(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static String gridChallenge(List<String> grid) {
      ArrayList<String> al = new ArrayList<>();
        for(int i = 0;i<grid.size();i++){
            String s = sort(grid.get(i));
            al.add(s);
        }
        int size = al.get(0).length();
        for(int i = 1;i<al.size();i++){
            for(int j = 0;j<size;j++){
                if(al.get(i-1).charAt(j) > al.get(i).charAt(j)){
                    return "NO";
                }
            }
        }
       return "YES";
    }
}
