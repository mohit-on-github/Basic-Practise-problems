package Regex.ip;

import java.io.IOException;
import java.util.Scanner;

/*
Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Output

true
true
true
false
false

 */

public class IPValidator {

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
            format();
        }


    }
    public static void format() throws ClassNotFoundException{
        Class.forName("abcd");

    }
}
