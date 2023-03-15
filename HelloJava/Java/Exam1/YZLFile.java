package Exam1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class YZLFile {
    public static void main(String[] args) throws Exception{
        InputStream inS = new FileInputStream("JavaIcon.png");
        OutputStream ouS = new FileOutputStream("Temp\\JavaIconCopy.png");
        int len = 256;
        byte[] lens = inS.readNBytes(len);
        while ((lens) != -1) {
            ouS.write(lens);
        }
    }
}
