package chapter04;
class Animal4{
    public void shout(){
        System.out.println("Shout!");
    }
}
class Dog4 extends Animal4{
    public void shout(){ //Find the wrong and fix "public"
        System.out.println("Woh!");
    }
}
public class filec4e4 {
    public static void main(String[] args){
        Dog4 dog1 = new Dog4();
    }

}
