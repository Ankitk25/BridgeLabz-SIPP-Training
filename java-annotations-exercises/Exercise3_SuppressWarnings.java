import java.util.ArrayList;
import java.util.List;

public class Exercise3_SuppressWarnings {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList rawList = new ArrayList();
        rawList.add("hello");
        rawList.add(123);

        List<String> strings = rawList;
        System.out.println("Raw list contents: " + rawList);
        System.out.println("Strings view (unsafe): " + strings);
    }
}