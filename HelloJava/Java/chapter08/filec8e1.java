package chapter08;

import java.util.ArrayList;
import java.util.List;

public class filec8e1 {
    public static void main(String[] args) {
        List IntList = new ArrayList();
        IntList.add(1);
        IntList.add(2);
        IntList.add("3"); //try add a string
        for (int i=0;i<IntList.size();i++){
            Integer num = (Integer) IntList.get(i);
        }
    }
}
