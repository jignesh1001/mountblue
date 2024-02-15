import java.util.Stack;

public class Alternatingcharacters {
    public static int alternatingCharacters(String s) {
    Stack<Character> stack = new Stack<>();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        if (stack.isEmpty()) {
            stack.push(s.charAt(i));
        } else if (stack.peek() == s.charAt(i)) {
            count++;
        } else {
            stack.push(s.charAt(i));
        }
    }
    return count;
}
}
