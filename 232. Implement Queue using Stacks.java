class MyQueue {
    private Stack<Integer> S1 = new Stack<Integer>();
    // S2主要用来周转
    private Stack<Integer> S2 = new Stack<Integer>();
	
    // Push element x to the back of queue.
    public void push(int x) {
        while(!empty())
        {
        	S2.push(S1.pop());
        }
        S1.push(x);
        while(!S2.isEmpty())
        {
        	S1.push(S2.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!empty())
        {
        	S1.pop();
        }
    }

    // Get the front element.
    public int peek() {
    	if(!empty())
    	{
    		return S1.peek();
    	}
        return 0;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return S1.empty();
    }
}