package chapter10;

import java.io.FileReader;

public class filec10e14 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("readme.txt");
        int ch;
        while((ch = reader.read()) != -1){
            System.out.print((char) ch);
        }
        reader.close();
    }
}
