package chapter06;

public class file6e10 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0;i<100000000;i++){
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Running time is："+(endTime - startTime));
    }
}
