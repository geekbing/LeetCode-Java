public class Solution {
    public int convertToNum(int num) {
		if((num & 192) == 128){ 	// 10开头
			return 0;
		}
		else if((num & 128) == 0){	// 0开头
			return 1;
		}	
		else if((num & 224) == 192){// 110开头
			return 2;
		}
		else if((num & 240) == 224){// 1110开头
			return 3;
		}
		else if((num & 248) == 240){// 11110开头
			return 4;
		}
		return -1;					// 不合法的数字
	}

    public boolean validUtf8(int[] data) {
        int count = 0;
		int len = data.length;
		int start, end;
		int i = 0;
		while(i < len){
			if(convertToNum(data[i]) == -1 || convertToNum(data[i]) == 0){
				return false;
			}
			count++;
			start = i + 1;
			end = i + convertToNum(data[i]) - 1;
			if(end >= len) {
				return false;
			}
			for(int index = start; index <= end; index++) {	
				if(convertToNum(data[index]) != 0){
					return false;
				}
				else{
					count++;
				}
			}
			i = end + 1;
		}
		return count == len;
    }
}