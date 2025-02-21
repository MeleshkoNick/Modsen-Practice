import java.util.Stack;

public class Ex9 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        System.out.println(ex9.longestValidParentheses("(()"));
        System.out.println(ex9.longestValidParentheses(")()())"));
        System.out.println(ex9.longestValidParentheses(""));
    }
}