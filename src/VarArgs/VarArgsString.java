package VarArgs;

public class VarArgsString {
    static void showList(int start, String ...s){
        for (int i=0;i<s.length;i++) {
            System.out.println(start+". "+s[i]);
            start++;
        }
    }

    public static void main(String ...args) {                    //varargs
        showList(5,"Ram","Raj","John","Payel");
    }
}
