import java.time.LocalDate;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date today = new Date();
        LocalDate day = LocalDate.now();
        System.out.println(today);
        System.out.println(day.getMonth());
    }
}
