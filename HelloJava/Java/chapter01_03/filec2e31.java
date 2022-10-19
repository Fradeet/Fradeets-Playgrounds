package chapter01_03;

public class filec2e31 {
    public static void main(String[] args){
        //修改过，从最小开始排序
        int[] arr = {4,5,6,7,2,45,6};
        
        for(int i = 0 ; i< arr.length;i++){
            for(int j = arr.length-i-1;j>=1;j--){
                int x = arr[j];
                int y = arr[j-1];
                if(x<y){
                    int temp = y;
                    arr[j-1] = x;
                    arr[j] = temp;
                }
            }
        }
        for (int i= 0;i < arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
