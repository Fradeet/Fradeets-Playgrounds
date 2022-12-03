package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class filec10e12 {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream(".\\a.png");
        OutputStream out = new FileOutputStream(".\\b.png");
        int len;
        long begintime = System.currentTimeMillis();
        while((len = in.read())!=1){
            out.write(len);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("Useing time: "+(endtime-begintime)+" ms");
        in.close();
        out.close();
    }
}
