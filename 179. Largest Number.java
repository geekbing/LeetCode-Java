public class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0){
			return "";
		}
		String[] arr = new String[nums.length];
		for(int i = 0, len = nums.length; i < len; i++){
			arr[i] = Integer.toString(nums[i]);
		}
		// 排序
		Arrays.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				String str1 = o1.concat(o2);
				String str2 = o2.concat(o1);
				return str2.compareTo(str1);
			}
		});
		String ans = "";
		for(String item : arr){
			ans = ans.concat(item);
		}
		if(ans.charAt(0) == '0'){
		    return "0";
		}
		return ans;
    }
}