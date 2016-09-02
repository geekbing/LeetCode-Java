public class Solution {
    public int calculate(String s) {
        s = s.trim().replaceAll(" +", "");
        ArrayList<String> expList = new ArrayList<String>();
        Stack<Character> operStack = new Stack<Character>();
        char now;
        int cur;
        int left;
        for(int i = 0, len = s.length(); i < len; i++) {
            now = s.charAt(i);
            if('0' <= now && now <= '9') {
                // 获取当前整数
                cur = s.charAt(i) - '0';
                while(i + 1 < len && '0' <= s.charAt(i + 1) && s.charAt(i + 1) <= '9') {
                    cur = cur * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                if(operStack.empty()) {
                    expList.add("" + cur);
                }
                else {
                    left = Integer.parseInt(expList.get(expList.size() - 1));
                    switch(operStack.pop()) {
                        case '*':
                            expList.set(expList.size() - 1, left * cur + "");
                            break;
                        case '/':
                            expList.set(expList.size() - 1, left / cur + "");
                            break;
                        default:
                            break;
                    }
                }
            }
            else if(now == '+') {
                expList.add("+");
            }
            else if(now == '-') {
                expList.add("-");
            }
            else if(now == '*') {
                operStack.push('*');
            }
            else if(now == '/') {
                operStack.push('/');
            }
        }
        int result = 0;
        int sign = 1;
        for(int i = 0, len = expList.size(); i < len; i++) {
            if(expList.get(i) == "+") {
                sign = 1;
            }
            else if(expList.get(i) == "-") {
                sign = -1;
            }
            else {
                result += Integer.parseInt(expList.get(i)) * sign;
            }
        }
        return result;
    }
}