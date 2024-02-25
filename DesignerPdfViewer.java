
import java.util.*;

public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
        int maxHeight = 0;
        for(char c :word.toCharArray()){
            int index = c - 'a';
            if(h.get(index) > maxHeight){
                maxHeight = h.get(index);
            }
        }
         return maxHeight * word.length();
    }