public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums)
        {
            if(map.get(num) != null)
            {
                return true;
            }
            else
            {
                map.put(num, 1);
            }
        }
        return false;
    }
}