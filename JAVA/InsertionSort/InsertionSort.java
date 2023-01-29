public class InsertionSort {

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){

            int current = arr[i];

            int empty = i;

            int j = i-1;

            while(j>=0){

                if(arr[j]> current){

                    arr[j+1]=arr[j];

                    empty = j;
                }
                j--;
            }
            arr[empty] = current;
        }
    }
    
    public static void main(String[] args) throws Exception {

        int arr[]= {7,4,8,2,1};

        System.out.print("Before Array => {");

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]);

            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");

        insertionSort(arr);

        System.out.print("After Array => {");

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]);

            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
