#include <iostream>
using namespace std;

void printArray(int arr[], int size)
{
    for (int i = 0; i < size - 1; i++)
    {
        cout << arr[i];
        if (i < size - 2)
        {
            cout << ", ";
        }
    }
    cout << "}" << endl;
}
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
void heapFiy(int arr[], int size, int high)
{
    int larger = high;
    int left = 2 * high + 1;
    int right = 2 * high + 2;

    if (left < size && arr[left] > arr[larger])
    {
        larger = left;
    }
    if (right < size && arr[right] > arr[larger])
    {
        larger = right;
    }
    if (larger != high)
    {
        swap(&arr[larger], &arr[high]);
        heapFiy(arr, size, larger);
    }
}
void heapSort(int arr[], int size)
{
    for (int i = size / 2 - 1; i >= 0; i--)
    {
        heapFiy(arr, size, i);
    }
    for (int i = size - 1; i >= 0; i--)
    {
        swap(&arr[i], &arr[0]);
        heapFiy(arr, i, 0);
    }
    cout << "After Array --> {";
    printArray(arr, size);
}
int main()
{

    int arr[] = {12, 11, 13, 4, 3, 6};
    cout << "Before Array --> {";
    printArray(arr, 6);
    heapSort(arr, 6);
}