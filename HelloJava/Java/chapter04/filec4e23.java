package chapter04;
interface Animal23{
    void shout();
}
public class filec4e23 {
    public static void main(String[] args){
        String name = "Hua";
        animalShout(new Animal23(){
            @Override
            public void shout() {
                System.out.println(name+" Miao~");
            }
        });
    }
public static void animalShout(Animal23 an){
        an.shout();
}
}
