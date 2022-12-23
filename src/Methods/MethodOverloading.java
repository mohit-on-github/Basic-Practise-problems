package Methods;

import java.util.Scanner;

public class MethodOverloading {
    // finding max number
    public static void main(String[] args) {

        //call max method compile time polymorphism
        System.out.println("The max number is "+max(10,20));

        System.out.println("The max number is "+max(50,40,70));

        System.out.println("The max number is "+max(2.10f,3.20f));


    }
    public  static int max(int x,int y){
        return  x>y?x:y;
    }
    public  static float max(float x, float y) {
        return  x>y?x:y;
    }
    public  static int max( int x, int y, int z) {
        return  x>y && x>z ? x: (y>z ? y:z);
    }
}
