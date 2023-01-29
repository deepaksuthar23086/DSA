public class QuickSort {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void printArray(int arr[], int high) {
        for (int i = 0; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);

            quickSort(arr, pi + 1, high);

        }

    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = pivot;
                pivot = t;
                // swap(arr[j], arr[i]);

            }
        }
        i++;
        int t = arr[i];
        arr[i] = arr[high];
        arr[high] = t;
        // swap(arr[i], pivot);
        return i;

    }

}

class name {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 0, 1, 9, 2 };
        int high = arr.length - 1;

        QuickSort.quickSort(arr, 0, high);
        QuickSort.printArray(arr, high);
    }

}
