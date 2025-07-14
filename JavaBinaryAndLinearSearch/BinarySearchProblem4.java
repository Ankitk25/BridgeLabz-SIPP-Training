public class BinarySearchProblem4 {
    public static int[] findFirstLast(int[] arr, int target) {
        int first = -1, last = -1;
        int left = 0, right = arr.length - 1;

        // First occurrence
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        left = 0; right = arr.length - 1;
        // Last occurrence
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 2, 3, 4};
        int[] result = findFirstLast(input, 2);
        System.out.println("First: " + result[0] + ", Last: " + result[1]);
    }
}