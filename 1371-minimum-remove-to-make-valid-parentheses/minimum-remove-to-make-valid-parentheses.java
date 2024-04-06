import java.util.Stack;

class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ans.length());
                ans.append(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    ans.append(ch);
                }
            } else {
                ans.append(ch);
            }
        }

        // Remove unmatched open parentheses
        while (!stack.isEmpty()) {
            int index = stack.pop();
            ans.deleteCharAt(index);
        }

        return ans.toString();
    }
}
