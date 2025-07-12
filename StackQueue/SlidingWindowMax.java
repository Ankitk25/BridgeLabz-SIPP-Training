import java.util.*;

public class SlidingWindowMax {
    public static List<Integer> maxInWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peek() <= i - k) dq.poll();
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            dq.offer(i);
            if (i >= k - 1) res.add(nums[dq.peek()]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        List<Integer> ans = maxInWindow(nums, 3);
        System.out.println(ans); // [3, 3, 5, 5, 6, 7]
    }
}
