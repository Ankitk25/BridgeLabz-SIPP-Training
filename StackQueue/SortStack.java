import java.util.Stack;

public class SortStack {
    public static void sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int top = s.pop();
            sort(s);
            insert(s, top);
        }
    }

    private static void insert(Stack<Integer> s, int value) {
        if (s.isEmpty() || s.peek() <= value) {
            s.push(value);
        } else {
            int temp = s.pop();
            insert(s, value);
            s.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        sort(stack);
        while (!stack.isEmpty()) System.out.print(stack.pop() + " "); // 1 2 3 4
    }
}
