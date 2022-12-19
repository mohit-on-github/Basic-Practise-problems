package NestedLoop;

public class Pattern2 {

//    public static void main(String[] args) {
//        for(int i=0;i<=20;i=i+5){
//            for (int j=1;j<=5;j++) {
//                System.out.print(i+j+" ");
//            }
//            System.out.println();
//        }
//    }

//                    or

    public static void main(String[] args) {
        int count =0;
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++) {
                ++count;

                System.out.print(count+" ");

            }
            System.out.println();
        }
    }
}
