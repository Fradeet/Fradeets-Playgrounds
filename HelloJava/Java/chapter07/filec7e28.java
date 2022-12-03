package chapter07;
import java.lang.reflect.Array;
import java.util.Arrays;

public class filec7e28 {
    public static void main(String[] args) {
        String[] arr = {"program", "creek", "is" ,"a", "java" ,"site"};
        Arrays.sort(arr, (m,n) -> Integer.compare(m.length(), n.length()));
        System.out.println("Lambda only one: "+ Arrays.toString(arr));
        Arrays.sort(arr, (String m, String n) -> {
            if (m.length() > n.length()){
                return -1;
            }
            else return 0;
        });
        System.out.println("Multiple Lambda: "+ Arrays.toString(arr));
    }
}
