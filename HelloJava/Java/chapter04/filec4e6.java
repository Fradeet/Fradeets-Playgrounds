package chapter04;

class Animal6{
    private String name;
    private int age;
    public Animal6(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String info(){
        return "Name:"+this.name+", Age:"+this.age;
    }
}

class Dog6 extends Animal6{
    private String color;
    public Dog6(String name, int age,String color) {
        super(name, age);
        this.color = color;
    }
    //Rewrite class's info()
    public String info(){
        return super.info()+", Color:"+this.color;
    }
}
public class filec4e6 {
    public static void main(String[] main){
        Dog6 dog1 = new Dog6("牧羊犬",10,"red");
        System.out.println(dog1.info());
    }
}
