#include <iostream>
#include <stack>
#include <algorithm>

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
string reverseString(string str)
{
    reverse(str.begin(), str.end());
    int l = str.size();
    for (int i = 0; i <= l; i++)
    {
        if (str[i] == ')')
        {
            str[i] = '(';
        }
        else if (str[i] == '(')
        {
            str[i] = ')';
        }
    }
    return str;
}

string infixToPostfix(string infixExpression)
{
    stack<char> st;
    int l = infixExpression.size();
    string postfixExpression = "";
    for (int i = 0; i <= l; i++)
    {
        int current = infixExpression[i];

        if (current >= 'a' && current <= 'z' || current >= 'A' && current <= 'Z')
        {
            postfixExpression += current;
        }
        else if (current == '(')
        {
            st.push(current);
        }
        else if (current == ')')
        {
            while (!st.empty() && st.top() != '(')
            {
                postfixExpression += st.top();
                st.pop();
            }
            st.pop();
        }
        else
        {
            while (!st.empty() && precedence(st.top()) >= precedence(current))
            {
                postfixExpression += st.top();
                st.pop();
            }
            st.push(current);
        }
    }
    while (!st.empty())
    {
        postfixExpression += st.top();
        st.pop();
    }
    return postfixExpression;
}
string infixToPrefix(string infixString)
{
    string infix = reverseString(infixString);
    string postfix = infixToPostfix(infix);
    string prefix = reverseString(postfix);
    return prefix;
}
int main()
{
    string infixExpression;
    char multipleTime = 'y';

    while (multipleTime == 'y')
    {
        cout << "Enter Infix Expression --> ";
        cin >> infixExpression;
        cout << "Prefix Expresion --> " << infixToPrefix(infixExpression) << endl;
        cout << "Want to decide (y/n) --> ";
        cin >> multipleTime;
    }
}