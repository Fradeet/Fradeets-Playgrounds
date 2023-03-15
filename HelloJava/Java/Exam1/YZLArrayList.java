package Exam1;

import java.util.ArrayList;
import java.util.Iterator;

public class YZLArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("一");
        list.add("二");
        list.add("三");
        list.add("四");
        list.add("五");
        list.add("六");
        list.add("七");
        list.add("八");
        list.add("九");
        list.add("十");
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object lis = it.next();
            System.out.println(lis);
        }

    }
}
