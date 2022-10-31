package chapter04;

public class filec4e17 {
    public static void main(String[] args){
        Animal17 a1 = new Dog17();
        System.out.println("Animal a1 = new Dog():"+(a1 instanceof Animal17));
        System.out.println("Animal a1 = new Dog():"+(a1 instanceof Dog17));
        Animal17 a2 = new Animal17();
        System.out.println("Animal a2 = new Animal():"+(a2 instanceof Animal17));
        System.out.println("Animal a2 = new Animal():"+(a2 instanceof Dog17));
    }

    private static class Animal17 {
        void shout(){
            System.out.println("Shout...");
        }
    }

    private static class Dog17 extends Animal17 {
        @Override
        void shout() {
            System.out.println("Wow!");
        }
        void eat(){
            System.out.println("Bones");
        }
    }
}
