package PRP;

public class ModifiedSentence {
    public static void main(String[] args) {
        System.out.println( returnTheModifiedSentence("AbcDX hjgy" ));
        System.out.println( returnTheModifiedSentence("EXam Time" ));
        System.out.println( returnTheModifiedSentence("GO iNDIa" ));
    }

    public static String returnTheModifiedSentence(String input1) {
        String str = new String(input1);
        String[] arr = str.trim().split(" ");
        String reStr = "";
        char ch;
        for(String s : arr){
            int len = s.length();
            String word = "";
            for (int i=0; i<s.length();i++){
                if( ( (int)s.charAt(i) + len) > (int) 'z')
                    ch = 'z';
                else if ( ( (int)s.charAt(i) + len) > (int) 'Z' && ( (int)s.charAt(i) + len) < (int) 'a'  )
                    ch = 'Z';
                else
                    ch = (char)((int)s.charAt(i) + len);
                 word = word + ch;
            }
            reStr = reStr + word + " ";
        }
        return reStr.trim();
    }
}
