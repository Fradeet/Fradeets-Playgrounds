package chapter06;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class filec6e26 {
    public static void main(String[] arg){
        LocalTime time1 = LocalTime.now();
        LocalTime of  = LocalTime.of(9,23,23);
        System.out.println("Get hour from LocalTime: "+ time1.getHour());
        System.out.println("Time format: "+time1.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Is the of time behind now time? "+ of.isBefore(time1));
        System.out.println("Time phase: "+LocalTime.parse("12:15:30"));
        System.out.println("Get LocalTime: "+ time1.withNano(0));
    }
}
