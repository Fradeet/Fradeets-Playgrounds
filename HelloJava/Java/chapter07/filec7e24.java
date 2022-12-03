package chapter07;
import java.util.Arrays;

public class filec7e24 {
    public static void main(String[] args) {
        int[] arr = {9,8,3,5,2};
        System.out.print("Before: ");
        printArray(arr);
        Arrays.sort(arr);
        System.out.print("After sort: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0;x < arr.length;x++){
            if (x != arr.length -1){
                System.out.print(arr[x] + ",");
            }
            else {
                System.out.print(arr[x]+ "] ");
            }
        }
    }
}
