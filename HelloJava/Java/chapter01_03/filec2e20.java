package chapter01_03;

public class filec2e20 {
    public static  void main(String []args){
    pR(3,5);
    pR(7,7);
    }
    public static void pR(int height,int width){
        for (int i = 0;i < height;i++){
            for (int j = 0;j< width;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
