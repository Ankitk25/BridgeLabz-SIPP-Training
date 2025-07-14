public class LinearSearchProblem1 {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, -3, 4};
        System.out.println("First negative index: " + findFirstNegative(input));
    }
}