#include<iostream>
#define n 5

using namespace std;

class Queue{
    int arr[n];
    int rear;
    int front;

    public:
    Queue(){
        rear = -1;
        front = -1;
    }

    void enqueue(){
        int number;
        cout << "Enter queue => " << endl;
        cin >> number;
        if((front==-1 && rear==-1)){
            rear++;
            front++;
            arr[rear]=number;
        }else if((front==0 && rear==n-1)){
            cout << "Queue is full " << endl;
        }else{
            rear++;
            arr[rear]=number;
        }
    }

    bool dequeue(){
        if(isEmpty()){
            return true;
        }else{
            front++;
            return false;
        }
    }

    bool front_(){
        if(isEmpty()){
            return false;
        }else{
            cout << "Element of front => " << arr[front] << endl;
            return true;
        }
    }

    bool rear_(){
        if(isEmpty()){
            return false;
        }else{
            cout << "Element of rear => " << arr[rear] << endl;
            return true;
        }
    }

    bool isEmpty(){
        if(front==-1 && rear ==-1){
            cout << "Not element of queue " << endl;
            return true;
        }else{
            cout << "Queue is not empty " << endl;
            return false;
        }
    }

    bool isFull(){
        if(front==0 && rear==n-1){
            cout << "Queue is full " << endl;
            return true;
        }else{
            cout << "Queue is not full " << endl;
            return false;
        }
    }

    void traversing(){
        for(int i=front; i<=rear; i++){
            cout << i << ". Index value => " << arr[i] << endl;
        }
    }
};
int main(){
    Queue queue ;

    while(1){
        cout << endl;
        cout << "1. Enqueue " << endl;
        cout << "2. Dequeue " << endl;
        cout << "3. Front " << endl;
        cout << "4. Rear " << endl;
        cout << "5. isEmpty " << endl;
        cout << "6. isFull " << endl;
        cout << "7. Traversing " << endl;
        cout << "8. Exit " << endl <<endl;
        
        int option;
        
        cin >> option;

        switch (option)
        {
        case 1:
            queue.enqueue();
            break;
        case 2:
            queue.dequeue();
            break;
        case 3:
            queue.front_();
            break;
        case 4:
            queue.rear_();
            break;
        case 5:
            queue.isEmpty();
            break;
        case 6:
            queue.isFull();
            break;
        case 7:
            queue.traversing();
            break;
        case 8:
            exit(0);
        default:
            cout << "Please select right option " << endl;
            break;
        }
    }
}