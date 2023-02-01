#include<iostream>
using namespace std;

void bubbleSort(int arr[], int sort, int long){

    for (int i = 0; i < size(arr); i++){

        for(int j=0; j<6-i; j++){

            if(arr[j]>arr[j+1]){

                int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;
            }
        }
    }
} 
int main(){

    int arr[6]={6,2,5,3,4,1};

    cout << "Befor Array => {";

    for (int i=0; i<size(arr); i++){
        
        cout << arr[i] ;
        
        if(i<5){
            cout << ", ";
        }
    }
    cout << "}";

    bubbleSort(arr, 0, 6);

    cout <<  "After Array => {";

    for (int i=0; i<size(arr); i++){

        cout << arr[i] ;
        if(i<5){
            cout << ", ";
        }
    }
    cout << "}";
}
           
