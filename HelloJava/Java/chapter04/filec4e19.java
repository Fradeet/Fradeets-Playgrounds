package chapter04;

class Outer{
    static int m = 0;
    static class Inner{
        int n = 1;
        void show(){
            System.out.println("外部变量m："+m);//直接调用外部
        }
    }
}
public class filec4e19 {
    public static void  main(String[] args){
        Outer.Inner inner1 = new Outer.Inner();
        inner1.show();
    }
}
