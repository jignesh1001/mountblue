class NumberLineJumps{
public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
         int vdiff = v1 - v2;
        if (vdiff <= 0) {
            // System.out.println("NO");
            return "NO";
        }
        int xdiff = x1 - x2;
        int check = xdiff % vdiff ;
        return (check == 0)? "YES" : "NO";

    }
    public static void main(String[] args) {
        String result = kangaroo(0, 4, 4, 2);
        System.out.println(result);
    }
}