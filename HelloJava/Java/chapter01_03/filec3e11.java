package chapter01_03;

class Student7{
    private String name;
    private int age;
    public Student7(){
        System.out.println("无参构造");
    }
    public Student7(String n,int x){
        this();
        this.name = n;
        this.age = x;
    }
    public  String read(){
        return name+", "+age;
    }


}
public class filec3e11 {
    public static void main(String[] arg){
        Student7 stu = new Student7("三",18);
        System.out.println(stu.read());
    }
}
