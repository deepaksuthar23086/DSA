import java.util.Stack;

import javax.sound.sampled.Line;

import java.util.Scanner;

public class InfixToPostfix {
    public static int precedence(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String infixExpression, postfixExpression = "";
        Stack<String> st = new Stack<>();
        char multipleTime = 'y';

        while (multipleTime == 'y') {

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter infix Expression --> ");
                infixExpression = scanner.nextLine();

                for (int i = 0; i <= infixExpression.length(); i++) {
                    char current = infixExpression.charAt(i);

                    if (current >= 'a' && current <= 'z' || current >= 'A' && current <= 'Z') {
                        postfixExpression += current;
                    } else if (current == '(') {
                        st.push(Character.toString(current));
                    } else if (current == ')') {
                        while (!st.empty() && st.peek() != "(") {
                            postfixExpression += current;
                            st.pop();
                        }
                        st.pop();
                    } else {
                        while (!st.empty() && precedence(infixExpression.charAt(i)) >= precedence(current)) {
                            postfixExpression += st.peek();
                            st.pop();
                        }
                        st.push(Character.toString(current));
                    }
                    System.out.println(st.peek());
                    System.out.println(postfixExpression);
                }
                
                while (!st.empty()) {
                    postfixExpression += st.peek();
                    st.pop();
                }
                System.out.println("Postfix Expression" + postfixExpression);
                System.out.print("Want to decide (y/n) --> ");
                multipleTime = scanner.next().charAt(0);
            }
        }
    }
}