package chapter05;

public class filec5e2 {
    public static void main(String[] args){
        try {
            int result1 = divide(4,0);
            System.out.println(result1);
        }catch (Exception e){
            System.out.println(e);//Display error and dont exit
        }
    }

    private static int divide(int x, int y) {
        return x/y;
    }

}
