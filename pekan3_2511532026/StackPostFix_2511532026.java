package pekan3_2511532026;
import java.util.*;

public class StackPostFix_2511532026 {

    public static int PostFixEvaluate_2511532026(String expression) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner input = new Scanner(expression);

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                s.push(input.nextInt());
            } else {
                String operator = input.next();
                
                int operand2 = s.pop();
                int operand1 = s.pop();

                if (operator.equals("+")) {
                    s.push(operand1 + operand2);
                } else if (operator.equals("-")) {
                    s.push(operand1 - operand2);
                } else if (operator.equals("*")) {
                    s.push(operand1 * operand2);
                } else {
                    s.push(operand1 / operand2);
                }
            }
        }

        input.close(); 
        return s.pop();
    }

    public static void main(String[] args) {
        System.out.println("hasil postfix = " + 
            PostFixEvaluate_2511532026("5 2 4 * + 7 -"));
    }
}