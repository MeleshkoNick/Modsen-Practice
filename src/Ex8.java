import java.util.Stack;

public class Ex8 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isValidPair(top, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isValidPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        System.out.println(ex8.isValid("()"));
        System.out.println(ex8.isValid("()[]{}"));
        System.out.println(ex8.isValid("(]"));
        System.out.println(ex8.isValid("([])"));
    }
}