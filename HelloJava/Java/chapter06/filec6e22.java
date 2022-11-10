package chapter06;

import java.util.*;

public class filec6e22 {
    public static void main(String []args   ){
        Calendar calendar1 = Calendar.getInstance();
        int year = calendar1.get(Calendar.YEAR);
        int month = calendar1.get(Calendar.MONTH)+1;
        int date = calendar1.get(Calendar.DATE);
        int hour = calendar1.get(Calendar.HOUR);
        int minute = calendar1.get(Calendar.MINUTE);
        int second = calendar1.get(Calendar.SECOND);
        System.out.println(("Current time:"+year +month+ date+ hour+ minute+ second));
    }
}
