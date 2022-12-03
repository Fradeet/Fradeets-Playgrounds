package chapter07;

import java.util.ArrayList;

public class filec7e5 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Zhang");
        list1.add("Li");
        list1.add("Wang");
        list1.add("Zhao");
        for (Object obj : list1){ //forEach: the simple loop
            System.out.println(obj);
        }
    }
}
