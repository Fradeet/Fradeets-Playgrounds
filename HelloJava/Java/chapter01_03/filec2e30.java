package chapter01_03;

public class filec2e30 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7};
        int score = 4;
        int[] arr2 = new int[arr.length+1];
    
        for(int i =0;i<3;i++){
            arr2[i] = arr[i];
        }
        arr2[2] = score;
        for(int i = 3;i<arr2.length;i++){
            arr2[i] = arr[i-1];
        }

        System.out.print("之前: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }


        System.out.print("\n之后: ");
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]+",");
        }
    }
}
