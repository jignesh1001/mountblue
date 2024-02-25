public class HackerrankInString {
    
    public static String hackerrankInString(String s) {
        // Write your code here
            String target = "hackerrank";
            int targetIndex = 0;
            
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == target.charAt(targetIndex)){
                    targetIndex++;
                    if(targetIndex == target.length()){
                        return "YES";
                    }
                }
                
            }
             return "NO";
    
        }
}
