public class LinearSearchProblem2 {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {"I love Java", "Python is cool", "C++ is powerful"};
        String word = "Java";
        System.out.println("Found: " + findSentenceWithWord(sentences, word));
    }
}