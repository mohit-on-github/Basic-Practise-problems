// Infinite recursion
// Stack overflow Exception

package Recursion;

public class RecursionInfinite {
    public static void main(String[] args) {
        f();
    }
    static void f(){
        System.out.println(1);
        f();
    }
}
