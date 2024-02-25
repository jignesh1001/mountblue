public class AppendandDelete {
    public static String appendAndDelete(String s, String t, int k) {
        StringBuilder texto = new StringBuilder(s);
        for(int i = 0 ; i < k ; i++){
            if(texto.length() > 0) texto.deleteCharAt(texto.length()-1);
            int diff = Math.abs(texto.length()-t.length());
            if(diff > k-i-1 ) return "No";
            if(
                texto.length() <= t.length() 
                && texto.toString().equals(t.substring(0, texto.length()))
                && (diff == k-i-1 || (diff == 0 && (k-i-1)%2 == 0))
            ){ return "Yes";}
        }
        return "No";
    }

}
