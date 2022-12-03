package chapter07;
import java.util.*;

public class filec7e19 {
    public static void main(String[] args) {
        Map map = new TreeMap(); //HashMap
        map.put("4","Zhang");
        map.put("2","Li");
        map.put("3","Wang");
        map.put("3","Zhang");//Replace
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while(it.hasNext()){
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + ": "+ value);
        }
    }
}
