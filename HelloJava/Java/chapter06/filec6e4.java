package chapter06;

public class filec6e4 {
    public static void main(String[] args){
        String s = "itcast";
        System.out.println("替换it："+s.replace("it","cn.it"));

        String s1 = "  i t c a s t  ";
        System.out.println("去两端空格："+s1.trim());
        System.out.println("去所有空格："+s1.replace(" ",""));
    }
}
