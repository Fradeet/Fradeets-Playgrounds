package chapter06;

import java.util.stream.StreamSupport;

public class filec6e3 {
    public static void main(String[] args){
        String str = "abcd";
        System.out.print("转换数组：");
        char[] charArray1 = str.toCharArray();
        for (int i = 0;i < charArray1.length;i++){
            if (i != charArray1.length - 1){
                System.out.print(charArray1[i]+", ");
            }
            else {
                System.out.println(charArray1[i]);
            }
        }
    System.out.println("转换为String"+String.valueOf(12));
    System.out.println("大写"+str.toUpperCase());
    System.out.println("小写"+str.toLowerCase());
    }
}
