import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void enqueue(int x) {
        in.push(x);
    }

    public int dequeue() {
        if (out.isEmpty()) {
            while (!in.isEmpty())
                out.push(in.pop());
        }
        if (out.isEmpty()) throw new RuntimeException("Queue is empty");
        return out.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue()); // 10
        q.enqueue(40);
        System.out.println(q.dequeue()); // 20
    }
}
