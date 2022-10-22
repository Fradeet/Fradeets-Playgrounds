package chapter04;
interface Animal11{
    int ID = 1;
    String Name = "牧羊犬";
    void shout();
    public void info();
    static int getId(){
        return Animal11.ID;
    }
}
interface Action11{
    public void eat();
}
class Dog11 implements Animal11,Action11{
    @Override
    public void eat() {
        System.out.println("Bones");
    }

    @Override
    public void shout() {
        System.out.println("Wollll!");
    }
    public void info(){
        System.out.println("Name:"+Name);
    }
}
public class filec4e11 {
    public static void  main(String[] main){
        System.out.println("ID"+Animal11.ID);
        Dog11 dog1 = new Dog11();
        dog1.info();
        dog1.shout();
        dog1.eat();
    }
}
