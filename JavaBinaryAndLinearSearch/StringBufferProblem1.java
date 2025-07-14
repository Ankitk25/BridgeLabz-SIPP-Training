public class StringBufferProblem1 {
    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] input = {"Java", "is", "fun"};
        System.out.println("Concatenated: " + concatenateStrings(input));
    }
}