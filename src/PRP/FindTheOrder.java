package PRP;

public class  FindTheOrder {
    public static void main(String[] args) {
        System.out.println(findOrder("ACZa" , "CAZa"));
        System.out.println(findOrder("tbGB", "tGBb"));
        System.out.println(findOrder("ILkQwfg","QwILkfg"));

    }

    public static String findOrder(String input1, String input2) {
        String order = "";
        int count = 0;
       if(input1.charAt(0) > input1.charAt(1)){
            for (int i=1;i<input1.length()-1;i++) {
                if(input1.charAt(i) > input1.charAt(i+1)){
                    order = "decreasing";
                }
                else {
                    return "invalid";
                }
            }
        }
       else {
           for (int j=1;j<input1.length()-1;j++) {
               if(input1.charAt(j) < input1.charAt(j+1)){
                   order = "increasing";
               }
               else {
                   return "invalid";
               }
           }
       }
       for (int a=0;a<input1.length();a++){
           if(input1.charAt(a) != input2.charAt(a)){
               count++;
           }
       }
       return order+":"+count;
    }
}
