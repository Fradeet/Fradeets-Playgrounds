package chapter05;

public class filec5e3 {
    public static void main(String[] args){
        try {
            int result1 = divide(4,0);
            System.out.println(result1);
        }catch (Exception e){
            System.out.println(e.getMessage());//Display error and dont exit
        }finally {
            System.out.println("exec finally");
        }
        System.out.println("Continue");
    }

    private static int divide(int x, int y) {
        return x/y;
    }

}
