package chapter09;

public class filec9e2 {
    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("chapter09.filec9e2$Person2");//inner
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Person2 per = null;
        try{
            per = (Person2) c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        per.setName("Zhang");
        per.setAge(18);
        System.out.println(per);
    }

    private static class Person2 {
        private String name;
        private int age;

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
