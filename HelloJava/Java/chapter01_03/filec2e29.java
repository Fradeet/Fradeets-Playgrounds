package chapter01_03;

public class filec2e29 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int f = 0;
        for (int i = 0; i < arr.length;i++){
            int j;
            j = arr[i];

            if (j>f){
                f = j;
            }
            
        }
        System.out.println(f);
    }
}
