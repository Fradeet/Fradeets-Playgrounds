package Exam1;

public class YeZhiLiangStudent {
    String name;
    int grade;

    public YeZhiLiangStudent() {
    }
    public YeZhiLiangStudent(String name,int grade) {
        this.grade = grade;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getName(){
        return this.name;
    }
    public int getGrade(){
        return this.grade;
    }

    public  void setInfo(String name,int grade){
        this.grade = grade;
        this.name = name;
    }
}

