class MyStack {
	Queue<Integer> Q1 = new LinkedList<>();
	// 队列Q2用来周转
	Queue<Integer> Q2 = new LinkedList<>();
	
	// Push element x onto stack.
    public void push(int x) {
        while(!empty())
        {
        	Q2.add(Q1.poll());
        }
        Q1.add(x);
        while(!Q2.isEmpty())
        {
        	Q1.add(Q2.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(!empty()) {
        	Q1.poll();
        }
    }

    // Get the top element.
    public int top() {
        return Q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return Q1.isEmpty();
    }
}