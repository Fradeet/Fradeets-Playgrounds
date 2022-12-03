package chapter07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class filec7e16 {
    public static void main(String[] args) {
        Map map = new HashMap<>(); //HashMap
        map.put("1","Zhang");
        map.put("2","Li");
        map.put("3","Wang");
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)(it.next());
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ": "+ value);
        }
    }
}
