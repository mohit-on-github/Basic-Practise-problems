package VarArgs;

public class VarArgs {

    static void show(int ...A) {
        for (int x:A){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        show();
        show(10,20,30,40);
        show(87,54,21,32,42);
    }
}
