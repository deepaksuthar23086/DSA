public class HeapSort {
    static void printArray(int arr[], int size){
        System.out.print("{");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]);
            if(i<size-1){
                System.out.print(", ");
            }
        }
        System.out.print("} \n" );
    }
    static void swap(int a, int b){
        int temp = a;
        b = a;
        b = temp;
    }
    static void heapFiy(int arr[], int size, int currentValue){
        int larger = currentValue;
        int left = currentValue *2 + 1;
        int right = currentValue * 2 + 2;

        if (left < larger && arr[left] > arr[larger]){
            larger = left;
        }
        if (right < larger && arr[right] > arr[larger]){
            larger = right;
        }
        if(larger != currentValue){
            swap(arr[larger], arr[currentValue]);
            heapFiy(arr, size, larger);
        }
    }
    static void heapSort(int arr[], int size){
        for(int i=size/2-1; i>=0; i--){
            heapFiy(arr, size, i);
        }
        for(int i=size-1; i>=0; i--){
            swap(arr[i], arr[0]);
            heapFiy(arr, i, 0);
        }
        System.out.print("After Array => ");
        printArray(arr, size);
    }
    public static void main(String[] args) {
        int arr[]={11,12,13,5,3,6,2};
        System.out.print("Before Array => ");
        printArray(arr, 7);
        heapSort(arr, 7);
    }
}
