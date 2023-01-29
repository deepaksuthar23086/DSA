import java.util.Scanner;

public class CircularLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(){
            this.next = null;
        }
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void insertionFront(Node head) {
        Node newNode = new Node();
        System.out.println("Enter data");
        newNode.data = scanner.nextInt();
        // newNode.next = head;
        // System.out.println(head.data + " index  " + head.next );
        if(head == null){
            System.out.println(head.data + "  " + head.next );
            head = newNode;
        }else{
            newNode.next = head;
            head.next = newNode;
            head.next = lastNode(head).next;
            System.out.println(head.data + " index  " + head.next );
        }
    }

    public static Node lastNode(Node head){
        while(head.next != null){
            head = head.next;
        }
        return head;
    }
    public static void insertionEnd(Node head) {
        Node newNode = new Node();
        System.out.println("Enter data");
        newNode.data = scanner.nextInt();
        if(head == null){
            head = newNode;
        }else{
            lastNode(head).next = newNode.next;
            head.next = lastNode(head).next; 
        }
    }

    public static void deletionFront(Node head) {

    }

    public static void deletionEnd(Node head) {

    }

    public static void traversing(Node head) {
        Node temp = head;
        do {
                  
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);
        
    }

    public static void searchData(Node head) {

    }

    public static void updateData(Node head) {

    }

    public static void main(String[] args) {
        Node head = new Node();

        int exit = 0;

        while (exit == 0) {
            System.out.println(" __________________");
            System.out.println("|1. Insertion Front| ");
            System.out.println("|2. Insertion End  |");
            System.out.println("|3. Deletion Front |");
            System.out.println("|4. Deletion End   |");
            System.out.println("|5. Traversing     |");
            System.out.println("|6. Searching      |");
            System.out.println("|7. Update Element |");
            System.out.println("|8. Exit           |");
            System.out.println("|__________________|");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    insertionFront(head);
                    break;
                case 2:
                    insertionEnd(head);
                    break;
                case 3:
                    deletionFront(head);
                    break;
                case 4:
                    deletionEnd(head);
                    break;
                case 5:
                    traversing(head);
                    break;
                case 6:
                    searchData(head);
                    break;
                case 7:
                    updateData(head);
                    break;
                case 8:
                    exit = 1;
                    break;
                default:
                    System.out.println("Please select right option ");
                    break;
            }
        }
    }
}
