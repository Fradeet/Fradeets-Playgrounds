package chapter05;

public class filec5e7 {
    public  static  void PrintAge(int age) throws Exception{
        if (age<= 0){
            throw new Exception("正整数！");
        }
        else{
            System.out.println("Age:"+age);
        }
    }
    public static void main(String[] args){
        int age = -1;
        try{
            PrintAge(age);
        }
        catch (Exception e){
            System.out.println("异常："+e.getMessage());
        }
    }
}
