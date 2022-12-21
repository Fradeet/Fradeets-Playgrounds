package chapter10;

import java.io.FileWriter;

public class filec10e15 {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("a.txt");
        String str = "Hello!";
        fw.write(str);
        fw.write("\r\n");
        fw.close();
    }
}
