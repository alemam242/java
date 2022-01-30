import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DATE {
    public static void main(String[] args) {
        // non formatted date
        Date date = new Date();
        System.out.println(date);

        // formatted date
        DateFormat newdate = new SimpleDateFormat("DD/MM/YYYY");
        String d = newdate.format(date);
        System.out.println("Current date: " + d);
    }
}
