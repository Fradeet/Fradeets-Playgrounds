package chapter04;

class   animal{
    private String name;
    private int age;
    public final String COLOR = "黑色";
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
class Dog extends animal{}

public class filec4e1 {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.setName("牧羊犬");
        dog1.setAge(18);
        System.out.println(dog1.getAge()+" "+dog1.getName());
    }
}
