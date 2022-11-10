package chapter06;
import java.text.SimpleDateFormat;
import  java.util.*;
public class filec6e32 {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf.format((new Date())));
    }
}
