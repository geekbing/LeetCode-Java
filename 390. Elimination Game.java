public class Solution {
    public int lastRemaining(int n) {
        // 剩下的序列个数
        int remain = n;
        // 是从左向右还是从右向左删除元素
        boolean left = true;
        // 剩下的序列的第一个元素
        int head = 1;
        // 剩下的序列的元素之间的间隔
        int step = 1;
        
        while(remain > 1)
        {
            if(left || remain % 2 == 1)
    	    {
                head += step;  
    	    }
    	    step *= 2;
    	    left = !left;
    	    remain /= 2;
        }
        return head;
    }
}