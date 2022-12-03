package chapter07;

import java.util.HashSet;
class Student{
    private String id;
    private String name;
    public Student(String id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": "+ name;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {//Its same obj?
        if (this == obj){
            return  true;
        }
        if (!(obj instanceof Student)){//Its Student obj?
            return false;
        }
        Student stu = (Student) obj;
        boolean b = this.id.equals(stu.id);
        return b;
    }
}
public class filec7e9 {
    public static void main(String[] args){
        HashSet hs = new HashSet<>();
        Student stu1 = new Student("1","Zhang");
        Student stu2 = new Student("2","Li");
        Student stu3 = new Student("3","Li");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}
