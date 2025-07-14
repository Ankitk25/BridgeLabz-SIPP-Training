public class SearchWordInSentences {
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {"I love Java", "Python is cool", "C++ is fast"};
        System.out.println(findSentence(sentences, "Java")); // I love Java
    }
}
