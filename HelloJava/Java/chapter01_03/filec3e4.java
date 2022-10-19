package chapter01_03;

class Student3{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("No.");
            return;

            }
        else {
            this.age = age;
        }
    }
    public void read(){
        System.out.println(name+" "+age);
    }
}

public class filec3e4 {
    public static void main(String[] args){
        Student3 stu1 = new Student3();
        stu1.setAge(1);
        stu1.setName("Mi");
        stu1.read();
    }
}
