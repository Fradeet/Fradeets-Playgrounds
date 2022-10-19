package chapter01_03;

public class filec2e21 {
    public static void main(String[] args){
        int area = getArea(3,5);
        System.out.println("The area is "+area);
    }

    private static int getArea(int x, int y) {
        int temp =  x*y;
        return  temp;
    }
}
