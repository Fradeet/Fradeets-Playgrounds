package chapter01_03;

class Student{ //创造一个对象，下面的参数像个表格（数据库）
    String name;//对象里的参数
    int age;
    void read(){//对象里的动作
        System.out.println(name+" "+age);
    }
    int GetAge(){
        return age;
    }
}
public class filec3e1 {
    public static void main(String[] args){
        Student stu1 = new Student();//创造新对象

        stu1.name = "Ming";//输入参数
        stu1.age = 18;
        stu1.read();//调用方法
        
        //私自修改，玩一玩，尝试类中的函数及方法
        System.out.println("Ages:"+stu1.GetAge()+".Yes,is:"+stu1.age);
    }
}
