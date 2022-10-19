package chapter01_03;

class Student9{
    String name;
    int age;
    static String school = "A大学";
    public Student9(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        //System.out.println(this.name+", "this.age+", "+school);
    }
}
public class filec3e14 {
    public static void main(String[] args){
        Student9 stu1 = new Student9("San",18);
        Student9 stu2 = new Student9("Si",19);
        Student9 stu3 = new Student9("Wu",20);
    }
}
