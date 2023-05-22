package Strings;

public class TicTacString {
    public static String ticTac(String inpStr) {
        int first=0;
        if(inpStr.contains("<Tic>") && inpStr.contains("<Tac>")) {
            String midStr = inpStr.substring(inpStr.indexOf("<Tic>") + 5, inpStr.lastIndexOf("<Tac>"));
            midStr = midStr.trim();
            System.out.println(midStr);
            String strArr[] = midStr.split(" ");
            for (String x: strArr){
                first++;
            }
            System.out.println(first);
            midStr = midStr.replaceAll("\\s","").toUpperCase();
            System.out.println(midStr);

        }
        else {
            return "0";
        }
        return "0";
    }

    public static void main(String[] args) {
        int count=1;
        String s1 = "apple <Tic> id a <Tac> fruit";
        String s2 = "<Tic> apple is a fruit<Tac>";
        String s3 = "apple <Tic> id a <Tac> fruit";
        String s4 = "There were <Tic> 9846 apple <Tac> in a bag";
        String s5 = "apple <Tic> and <Tac> fruit";
        String s6 = "apple is <Tic> <Tac> a fruit";
        String s7 = "<Tic> apple is a fruit <Tac>";
        System.out.println("original : "+ s4);
        System.out.println("output : "+ticTac(s4));
    }
}
