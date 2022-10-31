package chapter04;

class Outer22{
    static int m = 0;//只有静态访问
    static  class Inner22{
        int n = 1;
        void show(){
            System.out.println("外部类静态变量m:"+m);
        }
    }
}
public class filec4e22 {
    public static void main(String[] args){
        Outer22.Inner22 inner = new Outer22.Inner22();
        inner.show();
    }
}
