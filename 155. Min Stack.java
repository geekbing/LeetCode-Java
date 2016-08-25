public class MinStack {

    private Stack<Integer> s, minS;
	
	/** initialize your data structure here. */
    public MinStack() {
    	s = new Stack<Integer>();
    	minS = new Stack<Integer>();
    }
    
    public void push(int x) {
        s.push(x);
        if(minS.empty() || x <= minS.peek())
        {
        	minS.push(x);
        }
    }
    
    public void pop() {
        if(s.pop().intValue() == minS.peek().intValue())
        {
        	minS.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */