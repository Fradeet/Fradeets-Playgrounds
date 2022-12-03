package chapter10;

import java.io.File;

public class filec10e1 {
    public static void main(String[] args) {
        File f = new File("%HOMEPATH%\\a.txt");
        File f1 =  new File("src\\HelloJava.txt");
        System.out.println(f);
        System.out.println(f1);
    }
}
