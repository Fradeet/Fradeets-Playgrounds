package Exam1;

public class TestEmployee {
    public static void main(String[] args) {
        YeZhiLiangEmployee emp = new YeZhiLiangEmployee();
        YeZhiLiangSalariedEmployee emp1 = new YeZhiLiangSalariedEmployee(3000);
        YeZhiLiangHourlyEmployee emp2 = new YeZhiLiangHourlyEmployee(15,170);
        YeZhiLiangSalesEmployee emp3 = new YeZhiLiangSalesEmployee(7000,0.3);

        emp.getSalary(10);
        float s1 = emp1.getSalary(10);
        float s2 = emp2.getSalary(10);
        float s3 = emp3.getSalary(10);

        System.out.println(s1+ " "+s2+ " "+ s3);
    }
}
