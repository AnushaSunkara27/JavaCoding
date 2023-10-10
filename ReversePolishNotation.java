import java.util.Stack;

public class ReversePolishNotation {
    private static boolean isNumeric(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int evaluateRPN(String[] tokens) {
        if(tokens.length == 0) { return 0; }
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(String token: tokens) {
            if(isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else if (token.equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 + num1);
            } else if (token.equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 * num1);
            } else if (token.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            } else if (token.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evaluateRPN(tokens));
    }
}
