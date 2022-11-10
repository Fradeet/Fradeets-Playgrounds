package chapter06;

public class filec6e8 {
    public static void main(String[] args){
        System.out.println("1.Add---------");
        add();
        System.out.println("2.Del---------");
        remove();
        System.out.println("3.Alter-------");
        alter();
        System.out.println("4.sub---------");
        sub();
    }

    private static void sub() {
        StringBuffer sb = new StringBuffer();
        System.out.println("Get storage: "+sb.capacity());
        sb.append("itcast123");
        System.out.println("append add result: "+sb);
        System.out.println("Clip 7-9 char:" + sb.substring(6,9));
    }

    private static void alter() {
        StringBuffer sb = new StringBuffer("abcdef");
        sb.setCharAt(1,'p');
        System.out.println("Alter position char"+sb);
        sb.replace(1,3,"qq");
        System.out.println("Replace char: "+sb);
        System.out.println("Reverse: "+sb.reverse());
    }

    private static void remove() {
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.delete(1,5);
        System.out.println("range result: "+sb);
        sb.deleteCharAt(2);
        System.out.println("Del position"+sb);
        sb.delete(0,sb.length());
        System.out.println("Clean buffer"+sb);
    }

    private static void add() {
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");
        sb.append("hij").append("klmn");
        System.out.println("Result of append: "+sb);
        sb.insert(2,"123");
        System.out.println("Result of instrt: "+sb);
    }

}
