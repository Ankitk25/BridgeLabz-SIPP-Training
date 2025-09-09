
import java.util.*;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("John", "Alice", "Bob");

        employees.stream()
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
}
