
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatUtility {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateFormatTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(DateFormatUtility.formatDate(today, "dd-MM-yyyy"));
        System.out.println(DateFormatUtility.formatDate(today, "MMMM dd, yyyy"));
    }
}
