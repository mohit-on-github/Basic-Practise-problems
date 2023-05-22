package Strings;

public class RotateToMin {
    public static void main(String[] args) {
        System.out.println(minSequence(65183));
    }
//    62185
//    21856
//    18562
    public static int minSequence(int inp){ /* 62185 */
        String str = Integer.toString(inp);
        int min = str.charAt(0);
        for(int i = 0 ;i < str.length(); i++){
            int ch = Character.getNumericValue(str.charAt(i));
            if(ch < min){
                min = ch;
            }
        }
        char mini = Integer.toString(min).charAt(0);
        String first = str.substring(str.indexOf(mini),str.length()-1);
        String second = str.substring(0,str.indexOf(mini));
        return Integer.parseInt(first+second);
    }
}
