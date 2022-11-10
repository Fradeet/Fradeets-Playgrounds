package chapter06;

import java.util.Random;

public class filec6e17 {
    public static  void main(String[] main){
        Random r = new Random(13);
        for (int x = 0;x <10;x++){
            System.out.println(r.nextInt(100));
        }
    }
}
