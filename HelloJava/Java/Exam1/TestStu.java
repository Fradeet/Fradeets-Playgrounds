package Exam1;

public class TestStu {
    public static void main(String[] args) {
        YeZhiLiangStudent stu1 = new YeZhiLiangStudent();
        YeZhiLiangStudent stu2 = new YeZhiLiangStudent("Er",78);

        stu1.setName("Yi");
        stu1.setGrade(70);

        //stu2.setName("Er");
        //stu2.setGrade(80);

        System.out.println("1: "+stu1.getName()+" "+ stu1.getGrade());
        System.out.println("2: "+stu2.getName()+" "+ stu2.getGrade());
    }
}
