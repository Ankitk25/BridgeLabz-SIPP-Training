public class CompareStringBufferBuilder {
    public static void main(String[] args) {
        int N = 1_000_000;

        long start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) sbf.append("hello");
        long end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < N; i++) sbd.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) / 1e6 + " ms");
    }
}
