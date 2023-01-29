#include <iostream>
#include <stack>

using namespace std;
int precedence(char ch)
{
    if (ch == '^')
    {
        return 3;
    }
    else if (ch == '*' || ch == '/')
    {
        return 2;
    }
    else if (ch == '+' || ch == '-')
    {
        return 1;
    }
    else
    {
        return -1;
    }
}
string reveres(string r)
{
    string Reverse;
    for (int i = r.size(); i >= 0; i--)
    {
        char correcter = r[i];
        if (correcter == ')')
        {
            correcter = '(';
        }
        else if (correcter == '(')
        {
            correcter = ')';
        }
        Reverse += correcter;
    }
    return Reverse;
}
int main()
{
    string infixExpression, prefixExpression;
    stack<char> st;
    char multipleTime = 'y';

    while (multipleTime == 'y')
    {
        cout << "Enter Infix Expression --> ";
        cin >> infixExpression;
        reveres(infixExpression);
        for (int i = 0; i <= infixExpression.size(); i++)
        {
            int current = infixExpression[i];

            if (current >= 'a' && current <= 'z' || current >= 'A' && current <= 'Z')
            {
                prefixExpression += current;
            }
            else if (current == '(')
            {
                st.push(current);
            }
            else if (current == ')')
            {
                while (!st.empty() && st.top() != '(')
                {
                    prefixExpression += st.top();
                    st.pop();
                }
                st.pop();
            }
            else
            {
                while (!st.empty() && precedence(st.top()) >= precedence(current))
                {
                    prefixExpression += st.top();
                    st.pop();
                }
                st.push(current);
            }
        }
        while (!st.empty())
        {
            prefixExpression += st.top();
            st.pop();
        }
        cout << "Prefix Expresion --> " << reveres(prefixExpression) << endl;
        cout << "Want to decide (y/n) --> ";
        cin >> multipleTime;
        prefixExpression = "";
    }
}