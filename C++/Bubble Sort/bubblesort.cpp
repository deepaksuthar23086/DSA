#include <iostream>
using namespace std;

void bubbleSort(int arr[], int first, int last)
{
        for (int i = 0; i < last; i++)
        {
                for (int j = 0; j < last - i; j++)
                {
                        if (arr[j] > arr[j + 1])
                        {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                        }
                }
        }
}
void printArray(int arr[], int size)
{
        for (int i = 0; i <= size; i++)
        {
                cout << arr[i];
                if (i < 5)
                {
                        cout << ", ";
                }
        }
        cout << "}" << endl;
};
int main()
{
        int arr[] = {6, 2, 5, 3, 4, 1};
        int len = size(arr) - 1;
        cout << "Befor Array --> {";
        printArray(arr, len);
        bubbleSort(arr, 0, len);
        cout << "After Array --> {";
        printArray(arr, len);
}
