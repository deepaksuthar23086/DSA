#include <iostream>

using namespace std;

int main()
{
    int size;
    cout << "Enter Array Size => ";
    cin >> size;
    int arr[size];
    cout << "Enter Array Element " << endl;

    for (int i = 0; i <= size; i++)
    {
        int element;
        cin >> element;
        arr[i] = element;
    }
    for (int i = 1; i <= size; i++)
    {
        int empty_index = i;
        int currentValue = arr[i];
        for (int j = i - 1; j >= 0; j--)
        {
            if (arr[j] > currentValue)
            {
                arr[j + 1] = arr[j];

                empty_index = j;
            }
        }
        arr[empty_index] = currentValue;
    }
    cout << "After Array => {";

    for (int i = 0; i <= size; i++)
    {
        int exit = 1;
        cout << arr[i];
        if (i < size)
        {
            cout << ", ";
        }
    }
    cout << "}";
    return 0;
}