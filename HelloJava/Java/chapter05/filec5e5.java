package chapter05;

public class filec5e5 {
    public static  void main(String[] args){
        try {
            int result1 = divide(4,2);
            System.out.println(result1);
        }catch (Exception e){
            e.printStackTrace();//Display error and dont exit
        }
        //System.out.println("Continue");
    }
    private static int divide(int x, int y)throws Exception {
        return x/y;
    }
}

