public class Solution {
    public List<List<Integer>> helper(int[] nums, int len) {
		List<List<Integer>> ans = new LinkedList<List<Integer>>();
		if(len == 0) {
			return ans;
		}
		if(len == 1) {
			LinkedList<Integer> first = new LinkedList<Integer>();
			first.add(nums[0]);
			ans.add(first);
			return ans;
		}
		List<List<Integer>> res = helper(nums, len - 1);
		for(List<Integer> item : res) {
			for(int i = 0, leng = item.size(); i <= leng; i ++) {
                List<Integer> temp = new LinkedList<Integer>(item);
				temp.add(i, nums[len - 1]);
				ans.add(temp);
			}
		}
		return ans;
	}

    public List<List<Integer>> permute(int[] nums) {
        return helper(nums, nums.length);
    }
}