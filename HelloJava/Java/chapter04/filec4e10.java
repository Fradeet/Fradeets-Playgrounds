package chapter04;
abstract class Animal10{
    abstract void shout();
}
class Dog10 extends Animal10{
    @Override
    void shout() {
        System.out.println("Wollllllll!");
    }
}

public class filec4e10 {
    public static void main(String[] main){
        Dog10 dog1 = new Dog10();
        dog1.shout();
    }
}
