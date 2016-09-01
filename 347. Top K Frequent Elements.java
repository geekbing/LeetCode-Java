public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer val;
		for(int num : nums) {
			val = map.get(num);
			val = (val == null) ? 1 : (val + 1);
			map.put(num, val);
		}
		ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
		for(int i = 0, len = nums.length; i <= len; i++) {
			bucket.add(new ArrayList<Integer>());
		}
		for(int key : map.keySet()) {
			int count = map.get(key);
			bucket.get(count).add(key);
		}
		List<Integer> ans = new ArrayList<Integer>();
		for(int i = nums.length; i > 0; i--) {
			if((bucket.get(i) != null) && (ans.size() < k)) {
				ans.addAll(bucket.get(i));
			}
		}
		return ans;
    }
}