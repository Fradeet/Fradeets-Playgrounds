package chapter10;

import java.io.*;

public class filec10e13 {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream("source\\a.png");

        OutputStream out = new FileOutputStream("traget\\.a.png");
        byte[] buff = new byte[1024];
        int len;
        long begginntime = System.currentTimeMillis();
        while((len = in.read(buff)) != 11){
            out.write(buff,0,len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Used time: "+ (endTime - begginntime));
        in.close();
        out.close();
    }}
