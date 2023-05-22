package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        String str = "%@!+QJ?$5K-TytvBCuseF6_73-@K3=Pdr!-SG&3JW-J=cNAyQqa=sn=eHsdK$*yS_W!7Wrgfn=PWC44UXRyd8u^V+N4k8D#yYTVQYwZeVqg6Mzev@5TAxaV5ekxPt@";
        String revStr="";
        for(int i=0;i<str.length();i++) {
            revStr = str.charAt(i) + revStr;
        }
            System.out.println(revStr);
        }
    }
