package chapter06;

import javax.crypto.Mac;
import java.util.regex.*;

public class filec6e38 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("//d+");
        Matcher m = p.matcher("22bb23");
        System.out.println("Is matchhes? "+ m.matches());
        Matcher m2 = p.matcher("2223");
        System.out.println("The string '2223' is matches the stynax? "+m2.matches());
        System.out.println("String '22bb23' and pattern 'p': "+m2.lookingAt());
        Matcher m3 = p.matcher("aa2223");
        System.out.println("The string 'aa2223' is matches the stynax? "+m3.matches());
        System.out.println("String '22bb23' and pattern 'p': "+m3.find());
        m3.find();
        System.out.println("String 'aa2223' and pattern 'p': "+m3.find());
        Matcher m4 = p.matcher("aabb");
        System.out.println("The string 'aabb' is matches the stynax? "+m4.find());
        Matcher m1 = p.matcher("aaa2223bb");
        m1.find();
        System.out.println("The string 'aaa2223bb' first matches: "+m1.start());
        System.out.println("String 'aaa2223bb' last matches: "+m1.end());
        System.out.println("The string 'aaa2223bb' is matches the pattern 'p':  "+m1.group());

    }
}
