
import java.util.Scanner;

public class Linkedlist {
    Node head;

    static class Node {
        int data;
        Node next;

        Node() {
            this.next = null;
        }
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void insertionFront(Node head) {

        Node newNode = new Node();
        System.out.println("Enter Element ");
        newNode.data = scanner.nextInt();
        newNode.next = head.next;
        head.next = newNode;
    }

    static Node lastNode(Node head) {

        while (head.next != null) {
            head = head.next;
        }
        return head;

    }

    public static void insertionEnd(Node head) {

        Node newNode = new Node();
        System.out.println("Enter Element ");
        newNode.data = scanner.nextInt();
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = lastNode(head);
            System.out.println(lastNode.data);
            lastNode.next = newNode;
        }
    }

    public static void deletionEnd(Node head) {

        while (head != null) {
            if (head.next.next == null) {
                head.next = null;
            }
            head = head.next;
        }
    }

    public static void deletionFront(Node head) {

        if (head == null) {
            System.out.println("Linked list is empty ");
        } else {
            head.next = head.next.next;
        }

    }

    public static void traversing(Node head) {

        if (head == null) {
            System.out.println("Linked list is empty ");
        } else {
            head = head.next;
            while (head != null) {
                System.out.print(head.data + "-->");

                if (head.next == null) {
                    System.out.println("Null");
                }

                head = head.next;
            }

        }
    }

    public static void searching(Node head) {

        int searchData = scanner.nextInt();
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            while (head != null) {
                if (searchData == head.data) {
                    System.out.println("True");
                }
                if (searchData != lastNode(head).data) {
                    System.out.println("This data is not available");
                }
                head = head.next;
            }
        }
    }

    public static void updateElement(Node head) {
        System.out.println("Node old data");
        int oldNodeData = scanner.nextInt();
        while (head != null) {
            if (oldNodeData == head.data) {
                System.out.println("Node new data");
                int newNodeData = scanner.nextInt();
                head.data = newNodeData;
                return;
            }
            Node laNode = head;
            while (laNode.next != null) {
                laNode = laNode.next;

            }
            if (oldNodeData != laNode.data) {
                System.out.println("This data is not available");
            }
            head = head.next;
        }
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
                    searching(head);
                    break;
                case 7:
                    updateElement(head);
                    break;
                case 8:
                    exit = 1;
                    break;
                default:
                    System.out.println("Please select right option");
                    break;
            }
        }
    }
}