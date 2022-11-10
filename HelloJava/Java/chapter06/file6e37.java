package chapter06;

import java.util.regex.*;

public class file6e37 {
    public static void main(String[] args){
        Pattern p1 = Pattern.compile("a*b");
        Matcher m1 = p1.matcher("aaaaab");
        Matcher m2 = p1.matcher("aaabbb");
        System.out.println(m1.matches());
        System.out.println(m2.matches());
        Pattern p2 = Pattern.compile("[/]+");
        String[] str = p2.split("San//Li//Wang//Zhao//Qian");
        for (String s:str){
            System.out.print(s+"\t");
        }
    }
}
