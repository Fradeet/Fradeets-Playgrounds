package chapter10;

import java.io.*;

public class filec10e16 {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("src.txt");
        InputStreamReader isr = new InputStreamReader(in);
        FileOutputStream osr = new FileOutputStream("des.txt");
        OutputStreamWriter osw = new OutputStreamWriter(osr);
        int ch;
        while ((ch = isr.read())!=-1){
            osw.write(ch);
        }
        isr.close();
        osw.close();
    }
}
