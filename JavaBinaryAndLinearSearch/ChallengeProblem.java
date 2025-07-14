import java.io.*;
import java.util.*;

public class ChallengeProblem {
    public static void main(String[] args) {
        // StringBuilder vs StringBuffer
        String str = "hello";
        long start, end;

        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) sb.append(str);
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start));

        StringBuffer sbuf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) sbuf.append(str);
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start));

        // FileReader and InputStreamReader word count
        try (BufferedReader reader1 = new BufferedReader(new FileReader("largefile.txt"));
             BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream("largefile.txt")))) {
            int words1 = 0;
            String line;
            while ((line = reader1.readLine()) != null) {
                words1 += line.split("\s+").length;
            }
            System.out.println("FileReader word count: " + words1);

            int words2 = 0;
            while ((line = reader2.readLine()) != null) {
                words2 += line.split("\s+").length;
            }
            System.out.println("InputStreamReader word count: " + words2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}