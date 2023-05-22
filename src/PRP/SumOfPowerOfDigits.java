package PRP;

public class SumOfPowerOfDigits {
    public static void main(String[] args) {
        System.out.println( sumOfPowerOfDigits(582109) );
        System.out.println( sumOfPowerOfDigits(12345) );
        System.out.println( sumOfPowerOfDigits(572) );
    }

    public static int sumOfPowerOfDigits(int input1){
        String numStr = Integer.toString(input1);
        int len = numStr.length();
        int sum = 0;
        for (int i=0;i<len-1;i++){
          int digit =  Character.getNumericValue(numStr.charAt(i));
          int nextDigit =  Character.getNumericValue(numStr.charAt(i+1));
          sum = sum+ (int) Math.pow(digit,nextDigit);
        }
        return sum+(int) Math.pow(Character.getNumericValue(numStr.charAt(len-1)),len);
    }
}
