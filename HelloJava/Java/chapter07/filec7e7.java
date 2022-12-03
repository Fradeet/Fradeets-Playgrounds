package chapter07;
import java.util.*;

public class filec7e7 {
    public static void  main(String[] args){
        HashSet hset = new HashSet();
        hset.add("Zhang");
        hset.add("Li");
        hset.add("Wang");
        hset.add("Li");
        Iterator it = hset.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
