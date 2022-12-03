package chapter07;
import java.util.*;

public class filec7e1{
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Zhang");
        list.add("Li");
        list.add("Wang");
        list.add("Zhao");

        System.out.println("List length列表长度: "+ list.size());

        System.out.println("The second element is第二个元素: "+list.get(2));

        list.remove(3);
        System.out.println("Deleted third element删除第三个元素: "+ list);

        //Replace
        list.set(1, "Li-2");
        System.out.println("Replace first element to 'Li-2'替换第一个元素"+list);
    }
}