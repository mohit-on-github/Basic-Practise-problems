package NestedLoop;

public class Pattern1 {

//    public static void main(String[] args) {
//        int n=2;
//        for (int i =2;i<=6;i++) {
//            for (int j=n ; j<n+5 ;j++) {
//                System.out.print(j+" ");
//            }
//
//            n++;
//            System.out.println();
//        }
//    }
//
//                    Or

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }
}
