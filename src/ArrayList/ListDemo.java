package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<>(20);

        ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(50,60,70,80,90));

        arrList1.add(10);
        arrList1.add(0,56);
        arrList1.addAll(1,arrList2);
        System.out.println(arrList1);

        System.out.println(arrList1.contains(50));

        System.out.println(arrList1.indexOf(70));

        arrList1.add(5,70);

        System.out.println(arrList1.lastIndexOf(70));

        arrList1.set(4,65);             //replace

        System.out.println(arrList1);

//        print all elements
//        for (int i=0;i<arrList1.size();i++) {
//            System.out.println(arrList1.get(i));
//        }

//            or
//
//        for (int x:arrList1){
//            System.out.println(arrList1.get(i));
//        }
//            or

        Iterator<Integer> it = arrList1.iterator();
//        List iterator is for both direction transversal
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
