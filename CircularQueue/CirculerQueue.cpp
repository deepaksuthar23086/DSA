#include<iostream>
#define Size 5

using namespace std;

class CircularQueue{
    int arr[Size];
    int front;
    int rear;
    
    public:
    CircularQueue(){
        front = -1;
        rear = -1;
    }

    bool isFull(){
        if(front==0 && rear==Size-1){
            return true;
        }else{
            return false;
        }
    }

    bool isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }else{
            return false;
        }
    }

    void enQueue(){
        int number;
        cout << "Enter Queue => ";
        cin >> number;
        if((front=-1 && rear==-1)){
            front=0;
            rear=(rear+1)%Size;
            arr[rear]=number;
        }else if(rear==Size-1){
            front=(front-1)%Size;
            arr[front]=number;
        }else{
            rear=(rear+1)%Size;
            arr[rear]=number;
        }
    }

    void deQueue(){
        if(isEmpty()){
            cout << "Queue is empty " << endl;
        }else if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front=(front+1)%Size;
        }
    }

    bool front_(){
        if(isEmpty()){
            cout << "Queue is empty " << endl;
            return false;
        }else{
            cout << "Front value => " << arr[front] << endl;
            return true;
        }
    }
    
    bool rear_(){
        if(isEmpty()){
            cout << "Queue is empty " << endl;
            return false;
        }else{
            cout << "Rear value => " << arr[rear] << endl;
            return true;
        }
    }

    void traversing(){
        for(int i=front; i<=rear; i++){
            cout << i << ". Index value " << arr[i] << endl;
        }
    }
};

int main(){
    CircularQueue circularQueue;

    while(1){
        cout << "1. EnQueue " << endl;
        cout << "2. DeQueue " << endl;
        cout << "3. Front " << endl;
        cout << "4. Rear " << endl;
        cout << "5. Traversing " << endl;
        cout << "6. Exit " << endl << endl;

        int option;
        cin >> option;

        switch (option)
        {
        case 1:
            circularQueue.enQueue();
            break;
        case 2:
            circularQueue.deQueue();
            break;
        case 3:
            circularQueue.front_();
            break;
        case 4:
            circularQueue.rear_();
            break;
        case 5:
            circularQueue.traversing();
            break;
        case 6:
            exit(0);
        default:
            cout << "Please select right option " << endl;
            break;
        }
    }

    return 0;
}