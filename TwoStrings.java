import java.util.*;
public static String twoStrings(String s1, String s2) {
// Write your code here
  Set<Character> set1 = new HashSet<>();
  Set<Character> set2 = new HashSet<>();
    
    for(char c :s1.toCharArray()){
        set1.add(c);
    }
    for(char c :s2.toCharArray()){
        set2.add(c);
    }
    set1.retainAll(set2);
    if(!set1.isEmpty()){
        return "YES";
        
    }{
        return "NO";
    }
}
