
class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1; // or throw an exception indicating empty stack
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1; // or throw an exception indicating empty stack
    }

    // Example usage:
    // public static void main(String[] args) {
    //     MinStack stack = new MinStack();
    //     stack.push(-2);
    //     stack.push(0);
    //     stack.push(-3);
    //     System.out.println(stack.getMin());   // Output: -3
    //     stack.pop();
    //     System.out.println(stack.top());      // Output: 0
    //     System.out.println(stack.getMin());   // Output: -2
    // }
}
