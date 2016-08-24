public class Solution {
    public String reverseString(String s) {
        // 将字符串转换为字符数组
        char charArr[] = s.toCharArray();
        
        // 颠倒字符数组
        for(int i = 0, len = charArr.length; i < len / 2; i++)
        {
            char temp = charArr[i];
            charArr[i] = charArr[len - 1 - i];
            charArr[len - 1 - i] = temp;
        }
        
        // 将字符数组组合成字符串返回
        return new String(charArr);
    }
}