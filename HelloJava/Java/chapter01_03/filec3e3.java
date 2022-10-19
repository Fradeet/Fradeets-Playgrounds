package chapter01_03;

class Student2{
    String name;
    int age;
    void read(){
        System.out.println(name+" "+age);

    }
}

public class filec3e3 {
    public static void main(String[]args){
        Student2 stu = new Student2();
        stu.name = "ZhangSan";
        stu.age = 18;
        stu.read();
    }
}
