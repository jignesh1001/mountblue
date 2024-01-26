import java.util.List;

public class BonAppetit {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
        int size = bill.size();
        int sum = 0;
    
        for(int i = 0;i<size;i++){
            int element = bill.get(i);
            sum += element ;
            
        }
        int annaEated = sum - bill.get(k);
        int refundedAmount = b - (annaEated /2);
        if(refundedAmount != 0){
            System.out.println(refundedAmount);
        }
        else{
            System.out.println("Bon Appetit");
        }

    }

}
