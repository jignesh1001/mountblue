import java.util.List;

public class Birthday {
    
    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
       int  size = s.size();
       
       int count = 0;
    for (int j = 0; j < size - m + 1; j++) {
        int sum = 0;
        for (int i = j; i < j+m ; i++) {
            sum = sum +  s.get(i);
        }
        if (sum == d) {
            count++;
        }
        
    }
    return count;
    }
}

// https://www.hackerrank.com/contests/mountblue-technologies/challenges/the-birthday-bar/submissions/code/1373270542