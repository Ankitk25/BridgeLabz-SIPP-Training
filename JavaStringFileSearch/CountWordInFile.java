import java.io.*;

public class CountWordInFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String target = "Java";
        int count = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            for (String word : line.split("\s+")) {
                if (word.equals(target)) count++;
            }
        }
        reader.close();
        System.out.println("Occurrences of word '" + target + "': " + count);
    }
}
