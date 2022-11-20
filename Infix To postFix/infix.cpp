	                                                                                                                                                                                                                                                                                                                                                                                                       
	                                                                                                                                                                                                                                                                                                                                                                                                       #include<iostream>
#include<stack>
using namespace std;
bool isoprend(char ch){
    return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
}
int precedence(char op){
    if(op == '+' || op == '-'){
        return 1;
    }else if(op == '*' || op == '/'){
        return 2;
    }else{
        return -1;
    }
}
int main(){
    
    string infixExpretion;
    string postfixExpretion;
    stack <char> st;
    
    cout << "Enter infix Expretion :";
    cin >> infixExpretion;

    for(int i = 0; i <= infixExpretion.size(); i++){
        int current = infixExpretion[i];
        if(isoprend(current)){
            postfixExpretion += current;
        }else if(current == '('){
            st.push(current);
        }else if(current == ')'){
            while (st.empty() && st.top() != '(')
            {
                postfixExpretion += st.top();
                st.pop();
            }if(!st.empty()){
                st.pop();
            }
            
        }else{
            while(!st.empty() && precedence(st.top()) > precedence(current)){
                postfixExpretion += st.top();
                st.pop();
            }
            st.push(current);
        }
    }
    while (!st.empty())
    {
        postfixExpretion += st.top();
        st.pop();
    }
        
    cout << postfixExpretion;
}
