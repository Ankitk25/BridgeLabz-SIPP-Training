import java.io.*;

public class FileReaderProblem2 {
    public static void main(String[] args) {
        String wordToFind = "Java";
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String word : line.split("\s+")) {
                    if (word.equals(wordToFind)) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences of '" + wordToFind + "': " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}