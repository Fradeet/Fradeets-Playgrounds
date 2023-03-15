package Exam1;

class YeZhiLiangEmployee {
    String name;
    int birthMonth;
    public YeZhiLiangEmployee(){
        return;
    }
    public float getSalary(int month){
        return 0;
    }
}

class YeZhiLiangSalariedEmployee extends YeZhiLiangEmployee{
    int monthSalary;

    public YeZhiLiangSalariedEmployee(int monthSalary){
        this.monthSalary = monthSalary;
    }

    @Override
    public float getSalary(int month) {
        return monthSalary;
    }
}

class YeZhiLiangHourlyEmployee extends YeZhiLiangEmployee{
    int hoursSalary;
    int workHours;

    public YeZhiLiangHourlyEmployee(int hoursSalary,int workHours){
        this.hoursSalary = hoursSalary;
        this.workHours = workHours;
    }

    @Override
    public float getSalary(int month) {

        if (workHours <=160) {
            return hoursSalary*160;
        }else{
            return (float) ((workHours-160)*1.5*hoursSalary + 160*hoursSalary);
        }
    }
}

class YeZhiLiangSalesEmployee extends YeZhiLiangEmployee{
    int monthSales;
    double tiChengRate;//提成
    public YeZhiLiangSalesEmployee(int monthSales, double tiChengRate){
        this.monthSales = monthSales;
        this.tiChengRate = tiChengRate;
    }
    @Override
    public float getSalary(int month) {
        return (float) (monthSales*tiChengRate);
    }
}