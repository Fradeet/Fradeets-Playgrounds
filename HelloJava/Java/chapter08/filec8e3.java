package chapter08;

import java.util.ArrayList;
import java.util.List;

public class filec8e3 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();//Use the '<>'
        intList.add(1);
        intList.add(2);
        //intList.add("3");//It has error
        for (int i=0;i< intList.size();i++){
            Integer num = intList.get(i);
        }
    }
}
