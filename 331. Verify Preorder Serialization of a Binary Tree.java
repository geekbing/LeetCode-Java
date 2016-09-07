public class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] arr = preorder.split(",");
		Stack<String> stack = new Stack<String>();
		for(int i = 0, len = arr.length; i < len; i++) {
			if(arr[i].equals("#")){
				if(i == len - 1) {
					if(stack.empty()){
						return true;
					}
					return false;
				}
				if(stack.empty()) {
					return false;
				}
				stack.pop();
			}
			else {
				stack.push(arr[i]);
			}
		}
		return false;
    }
}