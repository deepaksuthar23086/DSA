import java.util.Scanner;

public class DoublyLinkedList {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node() {
            this.right = null;
            this.left = null;
        }
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void insertionFront(Node head) {
        Node newNode = new Node();
        System.out.println("Enter Data");
        newNode.data = scanner.nextInt();
        newNode.left = head.right;
        head.left = newNode.right;
        head = newNode;
        System.out.println(head.data +"  " + head.right + "  " + head.left);
        // if (head== null) {
        //     head = newNode;
        //     System.out.println(newNode.data +"  righty " + newNode.right + "  " + newNode.left);
        // } else {
        //     head.left = newNode;
        //     newNode.right = head;
        //     head = newNode;
        //     // System.out.println(head.data +"  not null " + head.right + "  " + head.left);
        //     // System.out.println(newNode.data +"  " + newNode.right + "  " + newNode.left);
        // }
    }

    static Node lastNode(Node head) {
        while (head.right != null) {
            head = head.right;
        }
        return head;
    }

    public static void insertionEnd(Node head) {
        Node newNode = new Node();
        System.out.println("Enter Data");
        newNode.data = scanner.nextInt();
        if (head == null) {

            head = newNode;
            System.out.println(newNode.data +"  " + newNode.right + "  " + newNode.left);
        } else {
            Node laNode = lastNode(head);
            laNode.right = newNode.left;
            // System.out.println(laNode.data +"  " + laNode.right + "  " + laNode.left);
        }
    }

    public static void deletionFront(Node head) {
        if(head == null){
            System.out.println("Linked list empty");
        }else{
            head.right = head;
        }
    }

    public static void deletionEnd(Node head) {
        while(head != null){
            if(head.right.right == null){
                head.right = null;
            }
            head = head.right;
        }
    }

    public static void traversingFront(Node head) {
        head = head.right;
        while (head != null) {
            System.out.print(head.data + "-->");
            if (head.right == null) {
                System.out.print("Null");
            }
            head = head.right;
        }
    }

    public static void traversingEnd(Node head) {
        head = head.left;
        while (head != null) {
            System.out.print(head.data + "-->");
            if (head.left == null) {
                System.out.print("Null");
            }
            head = head.left;
        }
    }

    public static void searchData(Node head) {
        System.out.println("Enter search data");
        int searchData = scanner.nextInt();
        while (head.right != null) {
            if (searchData == head.data) {
                System.out.println("Data is available");
            }
            if (searchData != lastNode(head).data) {
                System.out.println("Data is not available");
            }
        }
    }

    public static void updateData(Node head) {
        System.out.println("Enter old data");
        int oldData = scanner.nextInt();
        while (head.right != null) {
            if (oldData == head.data) {
                System.out.println("Enter new data");
                int newData = scanner.nextInt();
                head.data = newData;
            }
            if (oldData != lastNode(head).data) {
                System.out.println("Data not available");
            }
            head = head.right;
        }
    }

    public static void main(String[] args) {
        Node head = new Node();
        // System.out.println(head.data +"  " + head.right + "  " + head.left);
        int exit = 0;
        while (exit == 0) {
            System.out.println(head.data +"  " + head.right + "  " + head.left);
            System.out.println(" ___________________");
            System.out.println("|1. Insertion Front | ");
            System.out.println("|2. Insertion End   |");
            System.out.println("|3. Deletion Front  |");
            System.out.println("|4. Deletion End    |");
            System.out.println("|5. Traversing Front|");
            System.out.println("|6. Traversing End  |");
            System.out.println("|7. Searching       |");
            System.out.println("|8. Update Element  |");
            System.out.println("|9. Exit            |");
            System.out.println("|___________________|");
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
                    traversingFront(head);
                    break;
                case 6:
                    traversingEnd(head);
                    break;
                case 7:
                    searchData(head);
                    break;
                case 8:
                    updateData(head);
                    break;
                case 9:
                    exit = 1;
                    break;
                default:
                    System.out.println("Please select right option");
                    break;
            }
        }
    }
}
