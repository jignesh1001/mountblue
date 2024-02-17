import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeter {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
    sticks.sort(Collections.reverseOrder());
    int i = 0;
    while(i <= sticks.size() - 3 && sticks.get(i) >= sticks.get(i+1) + sticks.get(i+2)){
        i++;
    }
    List<Integer> result = new ArrayList<>();
    if(i <= sticks.size() - 3){
        result.add(sticks.get(i+2));
        result.add(sticks.get(i+1));
        result.add(sticks.get(i));
        return result;
    }
    else{
        result.add(-1);
        return result;
    }
}
}
