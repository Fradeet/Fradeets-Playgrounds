package chapter10;

import java.io.File;

public class filec10e6 {
        public static void main(String[] args) throws Exception{
            File f = new File("C:\\Users\\ASUS\\Zotero");
            FileDir(f);
                }

            public static void FileDir(File dir){
        File[] files = dir.listFiles();
        for (File file:files){
            if (file.isDirectory()){
                FileDir(file);// loop and loop again while the end of directory.
            }
        }
    }
}
