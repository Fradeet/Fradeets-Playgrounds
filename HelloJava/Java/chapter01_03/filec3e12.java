package chapter01_03;

class Student8{
    String name;
    {
        System.out.println("构造块");
    }
    public Student8(){
        System.out.println("Student类构造方法");
    }
}
public class filec3e12 {
    public static void main(String[] args){
        Student8 stu = new Student8();
        Student8 stu2 = new Student8();
    }
}
