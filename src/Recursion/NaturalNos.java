package Recursion;

public class NaturalNos {
    int count=0;
    void nos(){
        if(count == 25){
            return;
        }
        System.out.println(count);
        count++;
        nos();
    }

    public static void main(String[] args) {
        NaturalNos n = new NaturalNos();
        n.nos();
    }
}
