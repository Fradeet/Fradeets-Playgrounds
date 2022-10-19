package chapter01_03;

class Resume{
    private String name;
    private String sex;
    private int age;
    Resume(){}
    public Resume(String name,String sex, int age){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void getName(){
        System.out.print(name);

    }
    public void getSex(){
        System.out.print(sex);
    }
    public void getAge(){
        System.out.print(age);
    }
    public void introduce(){
        System.out.println("姓名："+name+"\n性别："+sex+"\n年龄："+age);
    }
}
public class c3_5exescise {
    public static void main(String[] args){
        Resume r1 = new Resume("三","男",18);
        r1.introduce();
    }
}
