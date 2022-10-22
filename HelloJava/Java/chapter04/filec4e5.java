package chapter04;

class Animal5{
    String name = "Wolf";
    void shout(){
        System.out.println("Shouting!");
    }
}
class Dog5 extends Animal5{
    public void shout(){
        super.shout();//Use main class snippet code
        System.out.println("Wohhhhh!");
    }
    public void PrintName(){
        System.out.println("Name"+" "+super.name);
    }
}
public class filec4e5 {
    public static void main(String[] args){
        Dog5 dog1 = new Dog5();
        dog1.shout();
        dog1.PrintName();
    }
}
