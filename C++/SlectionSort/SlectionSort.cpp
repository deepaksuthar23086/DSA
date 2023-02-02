#include <iostream>

using namespace std;

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main()
{
    int size, exit = 1;
    cout << "Size of array => ";
    cin >> size;
    int arr[size];
    cout << "Enter array element --> ";

    for (int i = 0; i <= size; i++)
    {
        int element;
        cin >> element;
        arr[i] = element;
    }
    for (int step = 0; step <= size; step++)
    {
        int min_value_at_index = step;

        for (int i = step; i <= size; i++)
            if (arr[min_value_at_index] > arr[i])
            {
                min_value_at_index = i;
            }
        swap(&arr[min_value_at_index], &arr[step]);
    }
    cout << "After Array => "
         << "{";
    for (int i = 0; i <= size; i++)
    {
        cout << arr[i];
        if(i<size){
            cout << ", ";
        }
    }
    cout << "}" << endl;
    return 0;
}