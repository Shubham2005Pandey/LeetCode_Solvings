class MyQueue {
    private Stack<Integer> s;

    public MyQueue() {
        s = new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        int x = s.pop();

        if(s.empty()) {
            return x;
        }

        int ans = pop();

        s.push(x);

        return ans;
    }
    
    public int peek() {
        int x = s.pop();

        if(s.empty()) {
            s.push(x);
            return x;
        }

        int ans = peek();

        s.push(x);

        return ans;
    }
    
    public boolean empty() {
        return s.empty();
    }
}