package chapter04;

import java.util.Arrays;

class Employee {
    private String name;
    private int birthMonth;

    public int getSalary(int month) { //验证生日月
        return 0;
    }


    class SalariedEmployee {
        private int monthSalary;
        public  SalariedEmployee(String name1,int birth1,int mS1){
            name = name1;
            birthMonth = birth1;
            monthSalary = mS1;
        }
        public int getSalary(int month) { //覆写，验证生日月
            if (month == birthMonth) { //直接访问父类属性
                return this.monthSalary + 100;
            }
            else {
                return this.monthSalary;
            }
        }

    }
    class HourlyEmployee {
        private int hourSalary;
        private int workHour;
        public  HourlyEmployee(String name1,int birth1,int hS,int wH){
            name = name1;
            birthMonth = birth1;
            hourSalary = hS;
            workHour = wH;
        }
        public int getSalary(int month) { //覆写，验证生日月
            if (month == birthMonth) { //直接访问父类属性
                return this.hourSalary*workHour + 100;
            }
            else {
                return this.hourSalary*workHour;
            }
        }
    }
    class SalesEmployee {
        private int monthSales;
        private int rate;
        public  SalesEmployee(String name1,int birth1,int mS1,int rate){
            name = name1;
            birthMonth = birth1;
            monthSales = mS1;
            this.rate = rate;
        }
        public int getSalary(int month) { //覆写，验证生日月
            if (month == birthMonth) { //直接访问父类属性
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
                name = name1;
                birthMonth = birth1;
                this.baseSalary = bS1;
                //super.name = name;//TODO 向上继承

            }
            public int getSalary(int month) { //覆写，验证生日月
                if (month == birthMonth) { //直接访问父类属性
                    return monthSales*rate + 100+baseSalary;
                }
                else {
                    return monthSales*rate+baseSalary;
                }
            }
        }
    }
}
public class Exam5 {
    public static void main(String[] arg){
        int[] employeeSalary = new int[4];//数组
        Employee emp1 = new Employee();
        Employee.SalariedEmployee employee1 = emp1.new SalariedEmployee("Ming",12,12);
        Employee.HourlyEmployee employee2 = emp1.new HourlyEmployee("Wang",12,12,12);
        Employee.SalesEmployee employee3 = emp1. new SalesEmployee("Hong",12,12,12);
        Employee.SalesEmployee.BasePlusSalesEmployee employee4 = employee3.new BasePlusSalesEmployee("Jing",12,12);
        employeeSalary[0] = employee1.getSalary(12);
        employeeSalary[1] = employee2.getSalary(12);
        employeeSalary[2] = employee3.getSalary(12);
        employeeSalary[3] = employee4.getSalary(12);
        System.out.println(Arrays.toString(employeeSalary));
    }
}