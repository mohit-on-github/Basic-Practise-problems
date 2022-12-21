package Regex.NumConversion;

public class Logic {
    public static String no = "";
    public static void binary() {
        if (no.matches("[01]+")) {
            System.out.println(no + " is a binary number i.e " + Long.parseLong(no, 2) + " in decimal");
        } else {
            System.out.println(no + " is not a binary number");
        }
    }
    public static void hexaDecimal() {
        if (no.matches("[a-fA-F0-9]+")) {
            System.out.println(no + " is a hexadecimal number i.e " + Long.parseLong(no, 16));
        }
        else {
            System.out.println(no + " is not a hexadecimal number");
        }
    }
}
