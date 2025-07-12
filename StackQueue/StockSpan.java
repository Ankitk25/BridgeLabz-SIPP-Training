import java.util.Stack;

public class StockSpan {
    public static int[] span(int[] prices) {
        int[] result = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i])
                stack.pop();
            result[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] res = span(prices);
        for (int val : res) System.out.print(val + " "); // 1 1 1 2 1 4 6
    }
}
