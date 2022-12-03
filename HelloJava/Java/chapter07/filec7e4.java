package chapter07;
import java.util.*;

public class filec7e4 {
    public static void main(String[] args){
        ArrayList list1 = new ArrayList();
        list1.add("Zhang");
        list1.add("Li");
        list1.add("Wang");
        list1.add("Zhao");
        Iterator it = list1.iterator();
        while (it.hasNext()) { //Print all elements
            Object obj = it.next();
            if ("Zhang".equals(obj)) {
                list1.remove(obj); //Remove the element, but it's wrong.
            }
        }
        System.out.println(list1);
    }
}
