public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer val;
        
        for(int num : nums1)
        {
            val = map.get(num);
            val = (val == null) ? 1 : (val + 1);
            map.put(num, val);
        }
        for(int num : nums2)
        {
        	val = map.get(num);
        	if(val != null && val > 0)
        	{
        		list.add(num);
        		map.put(num, val - 1);
        	}
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i< list.size(); i++)
        {
        	ans[i] = list.get(i);
        }
        return ans;
    }
}