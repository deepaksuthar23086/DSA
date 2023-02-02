#include <iostream>
using namespace std;
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
void printArray(int arr[], int high)
{
    for (int i = 0; i <= high; i++)
    {
        cout << arr[i] << ", ";
    }
    cout << endl;
}
int partition(int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j <= high; j++)
    {
        if (arr[j] <= pivot)
        {
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    i++;
    swap(&arr[i], &arr[high]);
    return i;
}
void quickSort(int arr[], int low, int high)
{
    if (low > high)
    {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
int main()
{
    int arr[] = {8, 7, 6, 0, 1, 9, 2};
    int high = sizeof(arr) / sizeof(arr[0]);
    cout << "unsorted array --> ";
    printArray(arr, high - 1);
    quickSort(arr, 0, high - 1);
    cout << "sorted array --> " ;
    printArray(arr, high);

    return 0;
}