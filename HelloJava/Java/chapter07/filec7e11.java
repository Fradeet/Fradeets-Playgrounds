package chapter07;
import java.util.*;
public class filec7e11 {
    public static void main(String[] args){
        TreeSet ts = new TreeSet<>();
        ts.add(3);
        ts.add(29);
        ts.add(101);
        ts.add(21);
        System.out.println("the TreeSet collcetion: "+ ts);
        System.out.println("the first element for Treeset: "+ ts.first());
        System.out.println("the last element for Treeset: "+ ts.last());
        System.out.println("<=9的最大元素"+ts.floor(9));
        System.out.println(">10的最大元素"+ts.higher(10));
        System.out.println(">100的最大元素"+ts.higher(100));
        Object obj = ts.pollFirst();
        System.out.println("The first delete: "+ ts.first());
        System.out.println(ts);
    }

}
