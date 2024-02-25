import java.util.*;
public class LuckBalance {
    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here
        int sum=0;        
        List<Integer> list=new ArrayList<>();
        for (List<Integer> l : contests) 
            if(l.get(1)==1)
            list.add(l.get(0));
        
        if(list.size()-k>0) {
            Comparator<Integer> comp=Comparator.comparingInt(Integer::valueOf);
            Collections.sort(list,comp);
        for(int i=list.size()-k;i<list.size();i++)
            sum+=list.get(i);
        for(int i=0;i<list.size()-k;i++)
            sum-=list.get(i);
        for (List<Integer> l : contests) 
            if(l.get(1)==0)
                sum+=l.get(0);
        }
        else
            for (List<Integer> l : contests) 
                sum+=l.get(0);
        
        return sum;
        }
}
