package chapter07;

public class filec7e6 {
    static String[] strA = {"aaa","bbb","ccc"};
    public static void main(String[] args){
        for (String str: strA){
            str = "ddd"; // It can't work, forEach can't edit Array
        }

        System.out.println("Edit by 'forEach': "+strA[0]+", " + strA[1] + ", "+ strA[2]);
        for (int i = 0;i < strA.length  ;i++    ){
            strA[i] = "ddd";
        }
        System.out.println("Edit by 'for': "+ strA[0] +", "+  strA[1] +", "+  strA[2] );
    }
}
