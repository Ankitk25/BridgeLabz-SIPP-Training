public class ConcatStringBuffer {
    public static String concatenate(String[] words) {
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Java", "is", "awesome!"};
        System.out.println(concatenate(words)); // Javaisawesome!
    }
}
