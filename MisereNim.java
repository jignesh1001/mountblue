import java.util.List;

public class MisereNim {
    public static String misereNim(List<Integer> s) {
    // Write your code here
         int count = 0, n = s.size();
          for(int i = 0;i<n;++i){
              if(s.get(i) == 1) count++;
          }
        if(count == n){
            if(count % 2 == 0){
                return "First";
                
            }
            else{
                return "Second";
            }
        }
        int ans = 0;
        for(int i = 0;i<n;++i){
            ans = (ans^s.get(i));
        }
        if(ans == 0){
            return "Second";
        }
        else{
            return "First";
        }
    }

}
