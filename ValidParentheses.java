
import java.util.*;
public class ValidParentheses {
    public static boolean isValid(String s) {
        boolean result = false;
        if (s.equals(""))
            result = true;
        else {
            Stack<String> stack = new Stack<String>();
            String stringArray[] = s.split("(?!^)");
            stack.push(stringArray[0]);
            for (int i = 1; i < stringArray.length; i++) {
                if (stack.empty() == false) {
                    if (pair(stack.peek(), stringArray[i])) 
                        stack.pop();
                    else
                        stack.push(stringArray[i]); 
                } else {
                    stack.push(stringArray[i]); 
                }
                  
            }
            result = stack.empty();
        }
        return result;
    }

    private static boolean pair(String left, String right) {
        boolean result = false;
        if (left.equals("(") && right.equals(")")) result = true;
        else if (left.equals("{") && right.equals("}")) result = true;
        else if (left.equals("[") && right.equals("]")) result = true;
        return result;
    }

    public static void main (String[] args) {
        System.out.println(isValid(""));

    }
}