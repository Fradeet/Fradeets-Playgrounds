package chapter01_03;

class Student1{
    String name;
    int age;
    void read(){
        System.out.println(name + " "+ age);
    }
}

public class filec3e2 {
    public static void main(String[]args){
        Student1 stu1 = new Student1();
        Student1 stu2 = null;
        stu2 = stu1; //两个相同的对象
        stu1.name = "XiaoMing";
        stu1.age = 16;
        stu2.age = 50;
        stu1.read();
        stu2.read();
    }
}
