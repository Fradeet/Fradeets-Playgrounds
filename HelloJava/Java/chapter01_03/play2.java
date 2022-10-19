package chapter01_03;

class student6{
private String name;
private int age;
    {
        System.out.println("HelloObj!");
    }
    static {
        System.out.println("HelloClass!");
    }
public student6() {
    System.out.println("调用了无参的构造方法");
}
public student6 (String name,int age) {
    this();
//调用无参的构造方法
    this.name = name;
    this.age = age;
}
public String read(){
        return "我是："+name+",年龄："+age;
        }
}


public class play2{
        public static void main(String[]args){
            //chapter01_03.student6 stu=new chapter01_03.student6("张三",18);//实例化Student.对象
            //System.out.println(stu.read());
}
}