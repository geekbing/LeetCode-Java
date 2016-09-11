public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
		int total = 0;
		int remain = 0;
		for(int i = 0, len = gas.length; i < len; i++){
			total += gas[i] - cost[i];
			remain = remain + gas[i] - cost[i];
			if(remain < 0){
				remain = 0;
				start = i + 1;
				continue;
			}
		}
		if(total >= 0) {
			return start;
		}
		return -1;
    }
}