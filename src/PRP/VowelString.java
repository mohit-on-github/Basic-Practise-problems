package PRP;

public class VowelString {
    public static void main(String[] args) {
        String [] str1 = {"oreo", "sirish", "apple"};
        String [] str2 = {"Mango","banana"};
        String [] str3 = {"Ate","Ace","Girl"};
        System.out.println( findStringVowelFirstAndLast(3,str3) );


    }

    public static String findStringVowelFirstAndLast(int input1, String[] input2) {
        char[] ch = {'a','e','i','o','u'};

        String resStr = "";
        for (String s : input2){
            String each = s.toLowerCase();
            boolean first = false;
            boolean last = false;
            for (int i=0; i<ch.length;i++){
                if(each.charAt(0) == ch[i]){
                    first = true;
                    break;
                }

            }
            for (int j=0; j<ch.length;j++){
                if(each.charAt(each.length()-1) == ch[j]){
                    last = true;
                    break;
                }

            }
           if( first == true && last == true){
               resStr = resStr + each;
           }
        }
        if(resStr.isEmpty())
            return "no match found.";
        else
            return resStr;
    }
}
