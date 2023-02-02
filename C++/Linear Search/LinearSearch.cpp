#include <iostream>
using namespace std;
int main()
{
    int arr[] = {33, 22, 55, 66, 11, 55};
    int searchNumber;

    cout << "Enter Search Number --> ";
    cin >> searchNumber;
    int temp, no = 1;
    for (int i = 0; i <= 6; i++)
    {
        temp = arr[i];
        if (temp == searchNumber)
        {
            cout << searchNumber << " Index number --> " << i + 1 << endl;
            no = 2;
        }
    }
    if (no == 1)
    {
        cout << "This element not present" << endl;
        no = 1;
    }
}
