#include<iostream>
using namespace std;

class Stack{
    int arr[9];
    int top;
    public: Stack(){
        top = -1;
    }
    void push(){
        top++;
        int pushnumber;
        cout << "Enter Volue:";
        cin >> pushnumber;
        arr[top] = pushnumber;

    }
    void pop(){
        top--;
    }
    void travessing(){
        for (int i = 0; i <= top; i++)
        {
            cout << i << " index Number => " << arr[i] << endl;
        }
    }
    void peak(){
        cout << "Peak Value " << arr[top] <<endl;
    }
    void size(){
        int high;
        for(int i = 1; i <= top; i++){
            high = i+1;
        }
        cout << "Array Size => " << high << endl;
    }
    
};  
int main(){
    Stack stack;

    while (true)
    {
        cout << endl;
        cout << "1. Push" << endl;
        cout << "2. pop" << endl;
        cout << "3. travessing" << endl;
        cout << "4. Peak" << endl;
        cout << "5. size" << endl;
        cout << "6. Exit" << endl;
        int a;
        cin >> a;
        switch (a)
        {
        case 1:
            stack.push();
            break;
        case 2:
            stack.pop();
            break;
        case 3:
            stack.travessing();
            break;
        case 4:
            stack.peak();
            break;
        case 5:
            stack.size();
            break;
        case 6:
            exit(0);
        default:
            cout << "Invalid Option Please Select Right Option :" << endl;
        }

    }
    return 0;
}      
        
