public class pangram {
    static int size = 26;

    public static String pangrams(String s) {
        // Write your code here
        
            if(s.length()< size){
                return "not pangram";
            }
            s = s.toLowerCase();
            boolean[] present = new boolean[26];
            for(int i = 0;i< s.length();i++){
                if(Character.isLetter(s.charAt(i))){
                    present[s.charAt(i) - 'a'] = true;
                }
            }
            for(int i = 0;i<size;i++){
                System.out.print(present[i] + " ");
                if(present[i] == false){
                    return "not pangram";
                }
            }
            System.out.println();
            return "pangram";
        }
      public static void main(String[] args) {
      String str = "We promptly judged antique ivory buckles for the next prize";
         System.out.println(pangrams(str));
      }

}
