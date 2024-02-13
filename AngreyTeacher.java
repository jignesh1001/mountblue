import java.util.List;

public class AngreyTeacher {
    public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
        int count = 0;
        for(int i = 0;i<a.size();i++){
            if(a.get(i) <= 0){
                count++;
            }
        }
        
        return (count >= k)?"NO":"YES";
      
    }
}
