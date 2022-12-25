
import java.util.Scanner;

public class CircularDoublyLinedList {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node() {
            this.left = null;
            this.right = null;
        }
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void insertionFront(Node head) {
        Node newNode = new Node();
        System.out.println("Enter data");
        newNode.data = scanner.nextInt();
        if (head == null) {
            System.out.println("right");
            head = newNode;
            head.right = head;
            head.left = head;
        } else {
            newNode.right = head.left;
            head.right = newNode.left;
            head = newNode;
        }
    }

    public static Node lastNode(Node head) {
        do {
            head = head.right;
        } while (head == head.right);
        return head;
    }

    public static void insertionEnd(Node head) {
        Node newNode = new Node();
        System.out.println("Enter data");
        newNode.data = scanner.nextInt();
        if (head == null) {
            head = newNode;
            head.right = head.left;
        } else {
            Node lNode = lastNode(head);
            lNode.right = newNode.left;
            newNode.right = head.left;
        }
    }

    public static void deletionFront(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            head.left = head.right.right;
        }
    }

    public static void deletionEnd(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            do {
                head = head.right;
                if(head.right.right == head.right){
                    head.right = head.left;
                }
            } while (head.right != head.right);
        }
    }

    public static void traversing(Node head) {

        do {
            head = head.right;
            System.out.print(head.data + "-->");
            if (head.right == null) {
                System.out.print("Null");
            }
        } while (head.right != head.right);
    }

    public static void searchData(Node head) {
        System.out.println("Search Data");
        int searchData = scanner.nextInt();
        do {
            head = head.right;
            if (searchData == head.data) {
                System.out.println("Search data is available");
            }
            if (searchData != lastNode(head).data) {
                System.out.println("Search data not available");
            }
        } while (head.right != head.right);
    }

    public static void updateData(Node head) {
        System.out.println("Node old data");
        int oldData = scanner.nextInt();
        do {
            head = head.right;
            if (oldData == head.data) {
                System.out.println("Node new data");
                int newData = scanner.nextInt();
                head.data = newData;
            }
            if (oldData != lastNode(head).data) {
                System.out.println("This data not available");
            }
        } while (head.right != head.right);
    }

    public static void main(String[] args) {
        Node head = new Node();
        int exit = 0;
        while (exit == 0) {
            System.out.println(" __________________");
            System.out.println("|1. Insertion Front|");
            System.out.println("|2. Insertion End  |");
            System.out.println("|3. Deletion Front |");
            System.out.println("|4. Deletion End   |");
            System.out.println("|5. Traversing     |");
            System.out.println("|6. Search Data    |");
            System.out.println("|7. Update Data    |");
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
                    System.out.println("Please select right option");
                    break;
            }
        }
    }
}
