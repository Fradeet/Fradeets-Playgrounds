package chapter06;
import java.text.*;
import java.util.*;

public class filec6e33 {
    public static void main(String[] args) throws Exception{
        String strDate = "2021-03-02 17:26:11.234";
        String pat = "yyyy-MM-dd HH:mm:ss.SSS";
        SimpleDateFormat  sdf2 = new SimpleDateFormat(pat);
        Date d = sdf2.parse(strDate);
        System.out.println(d);
    }
}
