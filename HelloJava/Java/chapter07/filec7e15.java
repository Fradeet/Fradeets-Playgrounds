package chapter07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class filec7e15 {
    public static void main(String[] args) {
        Map map = new HashMap<>(); //HashMap
        map.put("1","Zhang");
        map.put("2","Li");
        map.put("3","Wang");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while(it.hasNext()){
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + ": "+ value);
        }
    }
}
