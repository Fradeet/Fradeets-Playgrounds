package chapter01_03;

class Student10{
    String name;
    int age;
    String school = "A大学";
    public Student10(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("姓名："+this.name+"，年龄："+this.age+"，学校："+this.school);
    }
}
public class filec3e13 {
    public static void main(String[] args){
        Student10 stu1 = new Student10("San",18);
        Student10 stu2 = new Student10("Si",19);
        Student10 stu3 = new Student10("Wu",20);
        stu1.info();
        stu2.info();
        stu3.info();

    }
}
