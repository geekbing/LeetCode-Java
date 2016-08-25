public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer val;
        for(int num : nums)
        {
            val = map.get(num);
            val = (val == null) ? 1 : (val + 1);
            map.put(num, val);
        }
        int halfLen = nums.length / 2;
        for(int k : map.keySet())
        {
            if(map.get(k) > halfLen)
            {
                return k;
            }
        }
        return 0;
    }
}