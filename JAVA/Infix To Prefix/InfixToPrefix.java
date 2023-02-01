import java.util.Scanner;
import java.util.Stack;


public class InfixToPrefix {
    public static String infixToPrefix(String infix)
    {
        String infixReverse = reverseString(infix);
        String postfix = infixToPostfix(infixReverse);
        String prefix = reverseString(postfix);
        return prefix;
    }

    public static String reverseString(String str)
    {
        String reverse = "";
        for (int i=str.length()-1; i>=0; i--)
        {
            char current = str.charAt(i);
            if (current == '(')
            {
                current = ')';
                i++;
            }
            else if (current == ')')
            {
                current = '(';
                i++; 
            }
            reverse += current;
        }
        return String.valueOf(reverse);
    }

    public static int precedence(char ch)
    {
        switch (ch)
        {
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    
    public static String infixToPostfix(String infixExpression)
    {
        Stack<Character> st = new Stack<>();
        String postfixExpression = "";
        for (int i = 0; i < infixExpression.length(); i++) {
            char current = infixExpression.charAt(i);

            if ((current >= 'a' && current <= 'z') || (current >= 'A' && current <= 'Z')) {
                postfixExpression += current;
            }
            else if (current == '(')
            {
                st.push(current);
            }
            else if (current == ')')
            {
                while (!st.empty() && st.peek() != '(')
                {
                    postfixExpression += st.peek();
                    st.pop();
                }
                st.pop();
            }
            else
            {
                while (!st.empty() && precedence(st.peek()) >= precedence(current))
                {
                    postfixExpression += st.peek();
                    st.pop();
                }
                st.push(current);
            }
        }
        while (!st.empty())
        {
            postfixExpression += st.peek();
            st.pop();
        }
        return postfixExpression;
    }

    public static void main(String[] args) {
        String infixString;
        char multipleTime = 'y';

        while (multipleTime == 'y') {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Infix Expression --> ");
            infixString = scanner.nextLine();                
            System.out.println("Prefix Expression --> 2. " + infixToPrefix(infixString));
            System.out.print("Want to decide(y/n) --> ");
            multipleTime = scanner.next().charAt(0);
        }

    }
}
