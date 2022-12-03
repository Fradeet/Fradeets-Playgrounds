package chapter08;

import java.util.ArrayList;
import java.util.List;

public class filec8e2 {
    public static void main(String[] args) {
        IntList intList = new IntList();
        intList.add(1);
        intList.add(2);
        //intList.add("E"); //Has error
        for (int i=0;i<intList.size();i++){
            Integer num = intList.get(i);
        }
    }

    private static class IntList {
        private List intList = new ArrayList<>();
        public boolean add(Integer e) {
            return intList.add(e);
        }

        public int size() {
            return intList.size();
        }

        public Integer get(int index) {
            return (Integer) intList.get(index);
        }
    }
}
