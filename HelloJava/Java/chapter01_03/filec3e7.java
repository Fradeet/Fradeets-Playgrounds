package chapter01_03;

class Student6{
    private String name;
    private int age;
    public Student6(){    }
    public Student6(String n){
        name = n;
        System.out.println("参数构造");
    }
    public Student6(String n,int a){
        name =n;
        age = a;
        System.out.println("两参数构造");
    }
    public void read(){
        System.out.println(name+", " + age   );
    }
}
public class filec3e7 {
    public static void main(String[] args){
        Student6 stu1 = new Student6("三");
        Student6 stu2 = new Student6("三",18);
        stu1.read();
        stu2.read();
    }
}
