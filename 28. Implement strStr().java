public class Solution {
    public int strStr(String haystack, String needle) {
        int lenH = haystack.length();
        int lenN = needle.length();
        // 排除特殊情况
        if(lenH == 0) {
            return (lenN == 0) ? 0 : -1;
        }
        if(lenN == 0) {
            return 0;
        }
        if(lenN > lenH) {
            return -1;
        }
        // needle的第一个字符
        char first = needle.charAt(0);
        // 只需要从haystack字符串的第[0-max]查看是否匹配
        int max = lenH - lenN;
        int start, end;
        int n;
        for(int i = 0; i <= max; i++) {
            // 找到第一个相等的字符的位置
            if(haystack.charAt(i) != first) {
                i++;
                while(i <= max && haystack.charAt(i) != first) {
                    i++;
                }
            }
            
            // 接着匹配剩下的字符
            if (i <= max) {
                start = i + 1;
                end = start + lenN - 1;
                n = 1;
                for(int h = start; h < end && n < lenN; h++, n++) {
                    if(haystack.charAt(h) != needle.charAt(n)) {
                        break;
                    }
                }
                if(n == lenN) {
                    return i;
                }
            }           
        }
        return -1;
    }
}