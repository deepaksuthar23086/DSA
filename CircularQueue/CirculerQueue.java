import java.util.Scanner;

class CircularQueue{
    int size = 5;
    int arr[] = new int[size];
    int front = -1;
    int rear = -1;

    Scanner scanner = new Scanner(System.in);

    boolean isEmpty(){
        if ((front==-1 && rear==-1)) {
            return true;
        }else{
            return false;
        }
    }

    boolean isFull(){
        if(front==0 && rear==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    void enQueue(){
        System.out.print("Enter Queue => ");
        int number = scanner.nextInt();
        if(isEmpty()){
            front =0;
            rear=(rear+1)%size;
            arr[rear]=number;
        }else if(isFull()){
            System.out.println("Queue is full ");
        }else{
            rear = (rear+1)%size;
            arr[rear] = number;
        }
    }

    boolean deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return false;
        }else{
            front = (front+1)%size;
            return true;
        }
    }
    boolean front_(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return false;
        }else{
            System.out.println("Front => " + arr[front]);
            return true;
        }
    }
    boolean rear_(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return false;
        }else{
            System.out.println("Front => " + arr[rear]);
            return true;
        }
    }
    void traversing(){
        for(int i=front; i<=rear; i++){
            System.out.println(i + ". index value => " + arr[i]);
        }
    }

}
public class Queue {
    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue();
        Scanner scanner = new Scanner(System.in);
        int exit = 1;
        while(exit==1){
            System.out.println("1. enQueue");
            System.out.println("2. deQueue");
            System.out.println("3. Front");
            System.out.println("4. Rear");
            System.out.println("5. traversing");
            System.out.println("6. Exit");

            int option = scanner.nextInt();
            
            switch (option) {
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
                    exit = 2;
                    break;
                default:
                    System.out.println("Please select right option ");
                    break;
            }

        }
    }
}
