package VarArgs;

public class MaxNO {
    static int max(int ...num) {
        int max_num = num[0];
        for (int x:num) {
            if(x>max_num) {
                max_num = x;
            }
        }
        return max_num;
    }

    public static void main(String[] args) {
        System.out.println("Maximum no: "+max(546,546,63,879,82));
    }
}
