package chapter04;
abstract class Animal14{
    abstract void shout();
}
class Cat14 extends Animal14{
    @Override
    void shout() {
        System.out.println("Miao~");
    }
}
class Dog14 extends Animal14{
    @Override
    void shout() {
        System.out.println("Wow~");
        }
    }

public class filec4e14 {
    public static void main(String[] arg){
        Animal14 ani1 = new Cat14();
        Animal14 ani2 = new Dog14();
        ani1.shout();
        ani2.shout();
    }
}
