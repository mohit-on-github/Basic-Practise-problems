package PRP;

public class StepNumber {
    public static void main(String[] args) {
        System.out.println(isStepNum(67898));
        System.out.println(isStepNum(1234347));
        System.out.println(isStepNum(1));
    }

    public static String isStepNum(int input1) {
        String numStr = Integer.toString(input1);
        boolean flag = false;
        for(int i=0;i<numStr.length()-1;i++){
            int digit  =Character.getNumericValue(numStr.charAt(i));
            int nextDigit = Character.getNumericValue(numStr.charAt(i+1));
            if(Math.abs(nextDigit-digit)==1){
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return numStr+"-"+flag;
    }
}
