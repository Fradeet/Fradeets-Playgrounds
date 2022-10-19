package chapter01_03;

public class Learnc2e5q1 {
    public static void main(String[] args){
    int totalNum = 0;
    //遍历奇数
    for (int i =1;i<99;i+=1){
        //仅奇数
        if(i%2!=0){
            totalNum = totalNum + i;
        }
    }
    System.out.println(totalNum);
    }
}