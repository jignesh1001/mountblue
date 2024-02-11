public class BeautifulDays {
    
    static int getReverse(int num){
        int reverse = 0;
        while(num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        return reverse;
    }
    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
        int count = 0;
        for(int start = i; start <= j;start++){
            int reverse = getReverse(start);
            if(Math.abs(start - reverse) % k == 0){
                count++;
            }
        }
        return count;

    }
}
