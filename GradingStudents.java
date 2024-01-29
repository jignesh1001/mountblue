
import java.util.*;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
          List<Integer> roundedGrades = new ArrayList<>();
            for (int grade : grades) {
                if (grade >= 38 && grade % 5 >= 3) {
                    grade += 5 - (grade % 5);
                }
                roundedGrades.add(grade);
            }
            return roundedGrades;
    
        }
    
}
