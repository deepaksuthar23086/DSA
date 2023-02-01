#include<iostream>
using namespace std;
void searchNumber(int arr[], int inputNumber, int high, int low){
    int mid = (high + low)/2;
    if(inputNumber == arr[mid]){
        cout << inputNumber << " Index Number: " << mid << endl;
    }
    else if(inputNumber > arr[mid]){
        low = mid+1;
        searchNumber(arr, inputNumber, high, low);
    }
    else{
        high = mid-1;
        searchNumber(arr, inputNumber, high, low);
    }
}
int main(){
    int arr[9] = {11,22,33,44,55,66,77,88,99};
    int inputNumber;

    cout << "Enter Search Number: ";
    cin >> inputNumber;
    searchNumber(arr, inputNumber, 8, 0);
    return 0;
}