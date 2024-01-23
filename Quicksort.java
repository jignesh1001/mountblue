import java.util.*;

class Quicksort{
public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
    int size = arr.size();
    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();
    List<Integer> equal = new ArrayList<>();
    int pivot = arr.get(0);
    for(int i = 0;i<size;i++){
        int element = arr.get(i);
        if(element < pivot){
            left.add(element);
        }
        if(element > pivot){
            right.add(element);
        }
        if(element == pivot){
            equal.add(element);
        }
    }
    
    List<Integer> result = new ArrayList<>();
    
    result.addAll(left);
    result.addAll(equal);
    result.addAll(right);
    
    return result;
    }
}