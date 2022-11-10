package chapter04;

import java.util.Arrays;

class Employee {
    private String name;
    private int birthMonth;

    public double getSalary(int month){
        return 0;
    }
    public int getBirth(){
        return birthMonth;
    }
    public String getName(){
        return name;
    }
    public void writeInfo(String ename,int ebirthMonth){
        name  = ename;
        birthMonth = ebirthMonth;
    }


}
class SalariedEmployee extends Employee{
    private int monthSalary;

    public  SalariedEmployee(String name1, int birth1, int mS1){
        writeInfo(name1,birth1);
        monthSalary = mS1;
    }
    public double getSalary(int month) { //覆写，验证生日月
        if (month == getBirth()) { //直接访问父类方法
            return this.monthSalary + 100;
        }
        else {
            return this.monthSalary;
        }
    }

}
class HourlyEmployee extends Employee{
    private int hourSalary;
    private int workHour;
    public  HourlyEmployee(String name1,int birth1,int hS,int wH){
        writeInfo(name1, birth1);
        hourSalary = hS;
        workHour = wH;
    }
    public double getSalary(int month) { //覆写，验证生日月
        double Salary = 0;

        if (workHour <= 160){
            Salary = hourSalary*workHour;
        }else {
            Salary = hourSalary*160 + (workHour - 160)*hourSalary*1.5;
        }
        if (month == super.getBirth()) { //直接访问父类属性

            return Salary + 100;
        }
        else {
            return Salary;
        }
    }
}
class SalesEmployee extends Employee{
    private int monthSales;
    private int rate;
    public  SalesEmployee(String name1,int birth1,int mS1,int rate){
        writeInfo(name1,birth1);
        monthSales = mS1;
        this.rate = rate;
    }
    public double getSalary(int month) { //覆写，验证生日月
        if (month == super.getBirth()) { //直接访问父类属性
            return this.monthSales*rate + 100;
        }
        else {
            return this.monthSales*rate;
        }
    }

    class BasePlusSalesEmployee  {
        private int baseSalary;
        public  BasePlusSalesEmployee(String name1,int birth1,int bS1){
            this.baseSalary = bS1;
            writeInfo(name1,birth1);
            this.baseSalary = bS1;
            //super.name = name;// 向上继承

        }
        public int getSalary(int month) { //覆写，验证生日月
            if (month == getBirth()) { //直接访问父类属性
                return monthSales*rate + 100+baseSalary;
            }
            else {
                return monthSales*rate+baseSalary;
            }
        }
    }
}
public class Exam5 {
    public static void main(String[] arg){
        double[] employeeSalary = new double[4];//数组
        Employee emp1 = new Employee();
       SalariedEmployee employee1 = new SalariedEmployee("Ming",12,12);
        HourlyEmployee employee2 = new HourlyEmployee("Wang",12,12,12);
        SalesEmployee employee3 =  new SalesEmployee("Hong",12,12,12);
        SalesEmployee.BasePlusSalesEmployee employee4 = employee3.new BasePlusSalesEmployee("Jing",12,12);
        employeeSalary[0] = employee1.getSalary(12);
        employeeSalary[1] = employee2.getSalary(12);
        employeeSalary[2] = employee3.getSalary(12);
        employeeSalary[3] = employee4.getSalary(12);
        System.out.println(Arrays.toString(employeeSalary));
    }
}