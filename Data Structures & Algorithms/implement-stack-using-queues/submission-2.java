

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    // Insert element
    public void push(int x) {

        q.offer(x);  // Queue ke end mein insert

        int size = q.size();

        // Purane elements ko peeche bhejo
        for (int i = 0; i < size - 1; i++) {

            q.offer(q.poll());
        }
    }

    // Remove top element
    public int pop() {

        return q.poll();
    }

    // Top element return karo
    public int top() {

        return q.peek();
    }

    // Check whether stack is empty
    public boolean empty() {

        return q.isEmpty();
    }
}
