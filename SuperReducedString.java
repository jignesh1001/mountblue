import java.util.Stack;

public class SuperReducedString {
    static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == s.charAt(i)) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.length() == 0 ? "Empty String" : sb.toString();
    }
    public static void main(String []args){
        String result = SuperReducedStringUsingStack("aabbccdd");
        System.out.println(result);
    }
    
    static String SuperReducedStringUsingStack(String str){
        Stack<Character> characterStack = new Stack<>();
        for(char c : str.toCharArray()){
            if(characterStack.isEmpty())
              characterStack.push(c);
            else if(c == characterStack.peek()){
                characterStack.pop();
            }
            else
               characterStack.push(c);
        }
        StringBuilder resultBuilder = new StringBuilder();
        for(Character character :characterStack)
            resultBuilder.append(character);

        return resultBuilder.length() == 0 ? "empty string":resultBuilder.toString();
    }
}

// https://www.hackerrank.com/contests/mountblue-technologies/challenges/reduced-string/submissions/code/1373244898