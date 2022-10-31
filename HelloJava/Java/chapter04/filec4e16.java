package chapter04;
class Animal16{
    public void shout(){
        System.out.println("Miao~");
    }
}
class   Dog16 extends Animal16{
    @Override
    public void shout() {
        System.out.println("Wow!");
    }
    public void eat(){
        System.out.println("Bones");
    }
}

public class filec4e16 {
    public static void  main(String[] args){
        Animal16 ani1 = new Dog16();
        Dog16 dog1 = (Dog16) ani1;
        dog1.shout();
        dog1.eat();
    }
}
