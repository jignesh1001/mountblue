import java.util.ArrayList;
import java.util.List;

public class AcmIcpc {
    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
     int maxTopics = 0;
     int teamCount = 0;
        int n = topic.size();
        
        for(int i = 0;i<n;i++){
            for(int j = i + 1;j < n;j++){
                int knownTopics = 0;
                for(int k = 0;k < topic.get(i).length();k++){
                    if(topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1'){
                        knownTopics++;
                    }
                }
                if(knownTopics > maxTopics){
                    maxTopics = knownTopics;
                    teamCount = 1;
                }else if(knownTopics == maxTopics){
                    teamCount++;
                }
            }
        }
        List <Integer> ans = new ArrayList<>();
        ans.add(maxTopics);
        ans.add(teamCount);
        return ans;
    }
}
