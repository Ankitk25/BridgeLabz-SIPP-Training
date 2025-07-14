public class StringBufferProblem2 {
    public static void main(String[] args) {
        long start, end;
        String str = "hello";

        StringBuffer buffer = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            buffer.append(str);
        }
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start));

        StringBuilder builder = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            builder.append(str);
        }
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start));
    }
}