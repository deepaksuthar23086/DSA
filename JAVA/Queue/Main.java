import java.util.Scanner;
class Queue{
    int [] arr=new int[5];
    int front=-1;
    int rear=-1;
    Scanner scanner = new Scanner(System.in);
    void enQueue(){
        System.out.print("Enter Queue => ");
        int number = scanner.nextInt();
        if((front==-1 && rear==-1)){
            rear++;
            front++;
            arr[rear]=number;
        }else if((front==0 && rear==4)){
            System.out.println("Queue is full ");
        }else{
            rear++;
            arr[rear]=number;
        }
    }
    boolean deQueue(){
        if(isEmpty()){
            return true;
        }else{
            front++;
            return false;
        }
    }
    boolean isEmpty(){
        if((front==-1 && rear==-1)){
            System.out.println("Queue is not empty");
            return true;
        }else{
            System.out.println("Queue is Empty ");
            return false;
        }
    }
    boolean isFull(){
        if((front==0 && rear==4)){
            System.out.println("Queue is full ");
            return true;
        }else{
            System.out.println("Queue is not full ");
            return false;
        }
    }
    boolean front(){
        if(isEmpty()){
            return false;
        }else{
            System.out.println("Element of front => " + arr[front] );
            return true;
        }
    }
    boolean rear(){
        if(isEmpty()){
            return false;
        }else{
            System.out.println("Element of rear => " + arr[rear]);
            return true;
        }
    }
    void traversing(){
        for(int i=front; i<=rear; i++){
            System.out.println(i + ". Index value => " + arr[i]);
        }
    }

}
class Main{
    public static void main(String [] arts){
        Queue queue = new Queue();
        Scanner scanner=new Scanner(System.in);
        int i=1;
        while(i==1){

            System.out.println("1. EnQueue ");
            System.out.println("2. DeQueue ");
            System.out.println("3. isEmpty ");
            System.out.println("4. isFull ");
            System.out.println("5. Front ");
            System.out.println("6. Rear ");
            System.out.println("7. Traversing ");
            System.out.println("8. Exit ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> queue.enQueue();
                case 2 -> queue.deQueue();
                case 3 -> queue.isEmpty();
                case 4 -> queue.isFull();
                case 5 -> queue.front();
                case 6 -> queue.rear();
                case 7 -> queue.traversing();
                case 8 -> i = 2;
                default -> System.out.println("Please select right option ");
            }
        }
    }
}