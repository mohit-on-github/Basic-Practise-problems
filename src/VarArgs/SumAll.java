package VarArgs;

public class SumAll {
    static int add(int ...n) {
        if(n.length==0) return Integer.MIN_VALUE;

        else {
            int sum = 0;
            for (int x : n) {
                sum = sum + x;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(add( ));
        System.out.println(add(54,24,54,54,245,546,5));
    }
}
