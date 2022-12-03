package chapter10;

import java.io.File;
import java.io.FileInputStream;

public class filec10e9 {
    public static void main(String[] args) throws Exception{
        File f = new File(".\\text.txt");
        FileInputStream in = new FileInputStream(".\\text.txt");//Open a file
        int b = 0;
        while(true){
            b = in.read();
            if (b == -1) {
                break;
            }
            System.out.println(b);
        }
        in.close();
    }
}
