package chapter09;

import java.lang.reflect.Constructor;

public class filec9e4 {
    public static void main(String[] args) {
        Class<?> c = null;
        try{
            c= Class .forName("chapter09.filec9e4$Person4");//inner class
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Person4 per = null;
        Constructor<?> cons[] = null;
        cons = c.getConstructors();
        try{
            per = (Person4) cons[0].newInstance("San",30);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(per);
    }

    private static class Person4 {
        private String name;
        private int age;
        public Person4(String name,int age){
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
            return "Name: "+ this.name+ " Age: "+ this.age;
        }
    }
    }
