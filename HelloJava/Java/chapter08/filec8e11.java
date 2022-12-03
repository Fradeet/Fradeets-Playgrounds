package chapter08;

public class filec8e11 {
    public static void main(String[] args) {
        Person<?> person = new Person<String>("M1");
        System.out.println(person.getInfo()+ "..."+ person.getInfo().getClass());

        person = new Person<Integer>(666);
        System.out.println(person.getInfo()+ "..."+ person.getInfo().getClass());
    }

    private static class Person<T> {
        private final T info;

        public Person(T info) {
            this.info = info;
        }
        public T getInfo(){
            return info;
        }
    }
}
