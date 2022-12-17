package Looping;

import java.util.*;

class Series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int a=0;
        int b=0;
        int n=0;
        int c=0;
        System.out.println("Enter no of series you want to print");
        int t=in.nextInt();
//        (a + 2^0 * b), (a + 2^0 * b 2^1 * b),........... , (a + 2^0 * b + 2^1 * b +.....+ 2^n-1 * b)
        System.out.println("Enter the value for a,b,n");
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            while(c==i){
                int term= a+(int)Math.pow(2, 0)*b;
                for(int j=1;j<=n;j++){
                    System.out.print(term+" ");
                    term=(term)+(int)Math.pow(2, j)*b;
                }
                c++;
            }
            System.out.println();
        }
        in.close();

    }
}