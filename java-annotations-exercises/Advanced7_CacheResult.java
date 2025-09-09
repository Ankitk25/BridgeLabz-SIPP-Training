import java.lang.annotation.*;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class MathStuff {
    private final Map<Integer, Long> cache = new HashMap<>();

    @CacheResult
    public long fib(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        long result;
        if (n <= 1) {
            result = n;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        cache.put(n, result);
        return result;
    }
}

public class Advanced7_CacheResult {
    public static void main(String[] args) {
        MathStuff ms = new MathStuff();

        long start = System.currentTimeMillis();
        System.out.println("fib(40) = " + ms.fib(40));
        long end = System.currentTimeMillis();
        System.out.println("First run took ~" + (end - start) + " ms");

        long start2 = System.currentTimeMillis();
        System.out.println("fib(40) again = " + ms.fib(40));
        long end2 = System.currentTimeMillis();
        System.out.println("Second run took ~" + (end2 - start2) + " ms");
    }
}