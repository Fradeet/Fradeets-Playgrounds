package chapter09;

public class filec9e3 {
    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("chapter09.filec9e3$Person3");//inner
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Person3 per = null;
        try{
            per = (Person3) c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        per.setName("Zhang");
        per.setAge(18);
        System.out.println(per);
    }

    private static class Person3 {
        private String name;
        private int age;
        public Person3(String name,int age){
            this.setName(name);
            this.setAge(age);
        }
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public String getName(){
            return  this.name;
        }
        @Override
        public String toString() {
            return "Name: "+ this.name+ "Age: "+ this.age;
        }
    }
}
