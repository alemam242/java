import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TIME {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // Formated time
        DateTimeFormatter newtime = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currenttime = time.format(newtime);
        System.out.println(currenttime);
    }
}
