#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
};
Node *getLastNode(Node *head)
{
    while (head->next != NULL)
    {
        head = head->next;
    }
    return head;
}
void insertionEnd(Node *head)
{
    Node *node = new Node();
    cout << "Enter Element ";
    cin >> node->data;
    Node *lastNode = getLastNode(head);
    lastNode->next = node;
}
void insertionFront(Node *head)
{
    Node *node = new Node();
    cout << "Enter Element ";
    cin >> node->data;
    node->next = head->next;
    head->next = node;
}
void deletionFront(Node *head)
{
    if (head->next == NULL)
    {
        cout << "Linked list is empty " << endl;
    }
    else
    {
        head->next = head->next->next;
    }
}
void deletionEnd(Node *head)
{
    if (head->next == NULL)
    {
        cout << "Linked list is empty " << endl;
    }
    else
    {
        while (head != NULL)
        {
            if (head->next->next == NULL)
            {
                head->next = NULL;
            }
            head = head->next;
        }
    }
}
void traversing(Node *head)
{
    int i = 0;
    head = head->next;
    while (head != NULL)
    {
        cout << i << " -> " << head->data << endl;
        head = head->next;
        i++;
    }
}
void searching(Node *head)
{
    int searchElement;
    cout << "Enter search element ";
    cin >> searchElement;

    while (head != NULL)
    {
        if (searchElement == head->data)
        {
            cout << "Element available" << endl;
            break;
        }
        // if (searchElement != getLastNode(head)->data)
        // {
        //     cout << "Element not found" << endl;
            
        // }
        head = head->next;
    }
}
void updatingElement(Node *head)
{
    int oldElement;
    int updateElement;
    cout << "Enter old element ";
    cin >> oldElement;
    if (head->next == NULL)
    {
        cout << "Linked list is empty " << endl;
    }
    else
    {
        while (head != NULL)
        {
            if (oldElement == head->data)
            {
                cout << "Enter update Element ";
                cin >> updateElement;
                head->data = updateElement;
            }
            if (oldElement != getLastNode(head)->data)
            {

                cout << "Element not found " << endl;
                break;
            }
            head = head->next;
        }
    }
}
int main()
{
    int exit = 0;
    Node *head = new Node();
    while (exit == 0)
    {
        cout << " __________________" << endl;
        cout << "|1. Insertion Front| " << endl;
        cout << "|2. Insertion End  |" << endl;
        cout << "|3. Deletion Front |" << endl;
        cout << "|4. Deletion End   |" << endl;
        cout << "|5. Traversing     |" << endl;
        cout << "|6. Searching      |" << endl;
        cout << "|7. Update Element |" << endl;
        cout << "|8. Exit           |" << endl;
        cout << "|__________________|" << endl;
        int option;
        cin >> option;
        switch (option)
        {
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
            updatingElement(head);
            break;
        case 8:
            exit = 1;
            break;
        default:
            cout << "Select right option " << endl;
            break;
        }
    }
    return 0;
}