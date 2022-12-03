package chapter10;

import java.io.File;

public class filec10e4 {
    public static void main(String[] args) throws Exception{
        File f = new File("src\\04text.txt");
        if (f.isDirectory()){
            String[] names = f.list();
            for (String name : names){
                System.out.println(name);
            }
        }
    }
}
