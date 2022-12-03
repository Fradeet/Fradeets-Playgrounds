package chapter09;
class A{}
public class filec9e1 {
    public static void main(String[] args) {
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;
        try{
            c1 = Class.forName("chapter09.A");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        c2 = new A().getClass();
        c3 = A.class;
        System.out.println("Class name: "+ c1.getName());
        System.out.println("Class name: "+ c2.getName());
        System.out.println("Class name: "+ c3.getName());
    }
}
