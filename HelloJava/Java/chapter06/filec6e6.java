package chapter06;

import javax.sql.rowset.serial.SerialStruct;

public class filec6e6 {
    public static void main(String[] args){
        String str = "石家庄-武汉-哈尔滨";
        System.out.println("5到末尾："+str.substring(4));
        System.out.println("5到6："+str.substring(4,6));
        System.out.print("分割后的数组元素：");
        String[] strArray1 =str.split("-");
        for (int i = 0;i < strArray1.length;i++){
            if (i != strArray1.length - 1){
                System.out.print(strArray1[i]+", ");
            }
            else {
                System.out.println(strArray1[i]);
            }
        }
    }
}
