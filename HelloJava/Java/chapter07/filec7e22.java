package chapter07;
import java.lang.reflect.Array;
import java.util.*;

public class filec7e22 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"C","Z","B","K");
        System.out.println("Before sorts (original): "+ list);
        Collections.reverse(list);
        System.out.println("Reverse: "+ list);
        Collections.sort(list);
        System.out.println("Sort: "+ list);
        Collections.shuffle(list);
        System.out.println("Shuffle: "+list);
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);
    }
}
