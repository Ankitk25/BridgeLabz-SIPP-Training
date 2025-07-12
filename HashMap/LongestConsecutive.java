import java.util.*;

public class LongestConsecutive {
    public static int findLongest(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int maxLen = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int len = 1;
                while (set.contains(num + len)) len++;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(findLongest(arr)); // 4
    }
}
