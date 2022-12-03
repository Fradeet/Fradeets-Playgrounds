package chapter10;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class filec10e11 {
    public static void main(String[] args) throws Exception{
        OutputStream op = new FileOutputStream(".\\text.txt",true);
        String str = "Welcome!";
        byte[] b = str.getBytes();
        for (int i=0;i<b.length;i++){
            op.write(b[i]);
        }
        op.close();
    }
}
