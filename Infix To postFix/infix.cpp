#include <iostream>
#include <stack>
using namespace std;

bool isOperand(char ch)
{
    return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
}

int precedence(char op)
{
    if (op == '+' || op == '-')
    {
        return 1;
    }
    else if (op == '*' || op == '/')
    {
        return 2;
    }
    else
    {
        return -1;
    }
}

int main()
{

    string infixExpresion;
    string postfixExpresion;
    stack<char> st;

    char multipleTime = 'y';

    while (multipleTime == 'y')
    {
        cout << "Enter infix Expresion --> ";
        cin >> infixExpresion;

        for (int i = 0; i <= infixExpresion.size(); i++)
        {
            int current = infixExpresion[i];
            if (isOperand(current))
            {
                postfixExpresion += current;
            }
            else if (current == '(')
            {
                st.push(current);
            }
            else if (current == ')')
            {
                while (st.top() != '(')
                {
                    postfixExpresion += st.top();
                    st.pop();
                }
                st.pop();
            }
            else
            {
                while (!st.empty() && precedence(st.top()) > precedence(current))
                {
                    postfixExpresion += st.top();
                    st.pop();
                }
                st.push(current);
            }
        }
        while (!st.empty())
        {
            postfixExpresion += st.top();
            st.pop();
        }

        cout << "Postfix Expresion --> " << postfixExpresion << endl;
        cout << "Want to decide (y/n) --> ";
        cin >> multipleTime;
        postfixExpresion ="";
    }
}