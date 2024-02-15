public class SeparateTheNumber {
    public static void separateNumbers(String s) {
        // Write your code here
            String subString = "";
            boolean isValid = false;
            for(int i = 1;i <= s.length()/2 ; i++){
                subString = s.substring(0,i);
                Long num = Long.parseLong(subString);
                String validString = subString;
                while(validString.length() < s.length()){
                    validString += Long.toString(++num);
                    
                }
                if(s.equals(validString)){
                    isValid = true;
                    break;
                }
            }
         System.out.println(isValid ? "YES " +subString : "NO" );
        }
}
